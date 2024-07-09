package br.com.casannova.casamed.mapper;

import br.com.casannova.casamed.dto.PrescricaoDTO;
import br.com.casannova.casamed.entities.Prescricao;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Configuration;

@Configuration
@AllArgsConstructor
public class PrescricaoMapper {

    private ModelMapper modelMapper;

    public PrescricaoDTO toDTO(Prescricao prescricao) {
        PrescricaoDTO prescricaoDTO = modelMapper.map(prescricao, PrescricaoDTO.class);
        return prescricaoDTO;
    }

    public Prescricao toEntity(PrescricaoDTO dto) {
        Prescricao prescricao = modelMapper.map(dto, Prescricao.class);
        return prescricao;
    }
}
