package br.com.casannova.casamed.mapper;


import br.com.casannova.casamed.dto.MedicamentoDTO;
import br.com.casannova.casamed.entities.Medicamento;
import lombok.AllArgsConstructor;
import org.apache.catalina.mapper.Mapper;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MedicamentoMapper {

    private ModelMapper modelMapper;


    public MedicamentoDTO toDTO(Medicamento medicamento) {// converte um objeto medicamento para um objeto medicamentoDTO
        MedicamentoDTO dto = modelMapper.map(medicamento, MedicamentoDTO.class);
        return  dto;

//        if (medicamento == null) {
//            return null;
//        }
//        MedicamentoDTO dto = new MedicamentoDTO();
//        if (medicamento.getId() != null) {
//            dto.setId(medicamento.getId());
//        }
//        dto.setNomeMedicamento(medicamento.getNomeMedicamento());
//        return dto;
    }

    public Medicamento toEntity(MedicamentoDTO dto) {//converte um objeto medicamentoDTO para um objeto medicamento
        Medicamento medicamento = modelMapper.map(dto, Medicamento.class);
        return medicamento;

//        if (dto == null) {
//            return null;
//        }
//
//        Medicamento medicamento = new Medicamento();
//        if (dto.getId() != null) {
//            medicamento.setId(dto.getId());
//        }
//
//        medicamento.setNomeMedicamento(dto.getNomeMedicamento());
//
//        return medicamento;
    }
}
