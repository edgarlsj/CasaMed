package br.com.casannova.casamed.services;


import br.com.casannova.casamed.dto.ResidenteDTO;
import br.com.casannova.casamed.entities.Residente;
import br.com.casannova.casamed.mapper.ResidenteMapper;
import br.com.casannova.casamed.repositories.ResidenteRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ResidenteService {

    private ResidenteRepository residenteRepository;
    private ResidenteMapper residenteMapper;

    public List<ResidenteDTO> getAllResidente() {
       return residenteRepository
                .findAll()
                .stream()
                .map(residenteMapper::toDTO)
                .collect(Collectors.toList());


    }

    public ResidenteDTO findResidenteById(Long id) {
        return residenteRepository.findById(id)
                .map(residenteMapper::toDTO)
                .orElse(null);
    }

    @Transactional
    public ResidenteDTO CreateResidente(ResidenteDTO residenteDTO) {
        //converte DTO em entidade
        Residente residente = residenteMapper.toEntity(residenteDTO);
        // Salva a entidade no banco de dados
        Residente savedResidente = residenteRepository.save(residente);
        // converte a entidade salva em DTO
        return residenteMapper.toDTO(savedResidente);
    }

    @Transactional
    public ResidenteDTO updateResidente(Long id, ResidenteDTO residenteDTO) {
        residenteDTO.setId(id);

        Residente residente = residenteMapper.toEntity(residenteDTO);

        Residente saveResidente = residenteRepository.save(residente);

        return residenteMapper.toDTO(saveResidente);


    }

    @Transactional
    public ResponseEntity<?> deleteResidente(Long id) {

        if (residenteRepository.existsById(id)){
            residenteRepository.deleteById(id);
            return ResponseEntity.ok("Residente deletado com sucesso!");
        }else {
            return ResponseEntity.ok("Residente com o ID informado já foi excluído ou não existe.");

        }
    }


}
