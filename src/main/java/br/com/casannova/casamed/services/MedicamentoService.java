package br.com.casannova.casamed.services;


import br.com.casannova.casamed.dto.MedicamentoDTO;
import br.com.casannova.casamed.entities.Medicamento;
import br.com.casannova.casamed.mapper.MedicamentoMapper;
import br.com.casannova.casamed.repositories.MedicamentoRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class MedicamentoService {

    private MedicamentoRepository medicamentoRepository;
    private MedicamentoMapper medicamentoMapper;

    @Transactional
    public List<MedicamentoDTO> getAllMedicamentos() {
        List<MedicamentoDTO> list = medicamentoRepository.findAll()
                .stream()
                .map(medicamentoMapper::toDTO)
                .collect(Collectors.toList());

        return list;
    }

    @Transactional
    public MedicamentoDTO findById(Long id) {
        return medicamentoRepository.findById(id)
                .map(medicamentoMapper::toDTO)
                .orElse(null);
    }

    @Transactional
    public MedicamentoDTO createMedicamento(MedicamentoDTO medicamentoDTO) {
        Medicamento medicamento = medicamentoMapper.toEntity(medicamentoDTO);
        Medicamento entityMedicamento = medicamentoRepository.save(medicamento);
        MedicamentoDTO saveMedicamento = medicamentoMapper.toDTO(entityMedicamento);
        return saveMedicamento;

    }

    @Transactional
    public MedicamentoDTO updateMedicamento(Long id, MedicamentoDTO medicamentoDTO) {
        medicamentoDTO.setId(id);
        Medicamento medicamento = medicamentoMapper.toEntity(medicamentoDTO);
        Medicamento entityMedicamento = medicamentoRepository.save(medicamento);
        MedicamentoDTO saveMedicamento = medicamentoMapper.toDTO(entityMedicamento);
        return saveMedicamento;

    }

    @Transactional
    public void deleteMedicamento(Long id) {
        medicamentoRepository.deleteById(id);
    }

}

