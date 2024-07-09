package br.com.casannova.casamed.services;

import br.com.casannova.casamed.dto.PrescricaoDTO;
import br.com.casannova.casamed.entities.Prescricao;
import br.com.casannova.casamed.mapper.PrescricaoMapper;
import br.com.casannova.casamed.repositories.PrescricaoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class PrescricaoService {

    private final PrescricaoRepository prescricaoRepository;
    private final PrescricaoMapper prescricaoMapper;

    @Transactional
    public List<PrescricaoDTO> getAllPrescricoes() {
        return prescricaoRepository.findAll().stream()
                .map(prescricaoMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Transactional
    public PrescricaoDTO getPrescricaoById(Long id) {
        return prescricaoRepository.findById(id)
                .map(prescricaoMapper::toDTO)
                .orElse(null);
    }
    @Transactional
    public PrescricaoDTO createPrescricao(PrescricaoDTO dto){
        dto.setDataPrescricao(new Date());
        return prescricaoMapper.toDTO(prescricaoRepository.save(prescricaoMapper.toEntity(dto)));
    }
}
