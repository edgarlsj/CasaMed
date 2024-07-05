package br.com.casannova.casamed.services;


import br.com.casannova.casamed.dto.ResidenteDTO;
import br.com.casannova.casamed.entities.Residente;
import br.com.casannova.casamed.mapper.ResidenteMapper;
import br.com.casannova.casamed.repositories.ResidenteRepository;
import lombok.Data;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Data
public class ResidenteService {

    private ResidenteRepository residenteRepository;
    private ResidenteMapper residenteMapper;

    public ResidenteService(ResidenteRepository residenteRepository, ResidenteMapper residenteMapper){
        this.residenteRepository = residenteRepository;
        this.residenteMapper = residenteMapper;


    }


    public List<ResidenteDTO> getAllResidente() {
        List<ResidenteDTO> residenteDTOList = residenteRepository
                .findAll()
                .stream()
                .map(residenteMapper::toDTO)
                .collect(Collectors.toList());

        return residenteDTOList;
    }

    public ResidenteDTO findResidenteById(Long id) {
        return residenteRepository.findById(id)
                .map(residenteMapper::toDTO)
                .orElse(null);
    }

    @Transactional
    public ResidenteDTO CreateResidente(ResidenteDTO residenteDTO){
    //converte DTO em entidade
    Residente residente = residenteMapper.toEntity(residenteDTO);

    // Salva a entidade no banco de dados
    Residente savedResidente = residenteRepository.save(residente);

    // converte a entidade salva em DTO
    ResidenteDTO savedResidenteDTO = residenteMapper.toDTO(savedResidente);

    // retorna o DTO salvo
    return savedResidenteDTO;
}

}
