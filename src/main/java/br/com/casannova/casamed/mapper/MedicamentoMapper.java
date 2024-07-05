package br.com.casannova.casamed.mapper;


import br.com.casannova.casamed.dto.MedicamentoDTO;
import br.com.casannova.casamed.entities.Medicamento;
import org.springframework.stereotype.Service;

@Service
public class MedicamentoMapper {


    public MedicamentoDTO toDTO(Medicamento medicamento) {
        if (medicamento == null) {
            return null;
        }
        MedicamentoDTO dto = new MedicamentoDTO();
        if (medicamento.getId() != null) {
            dto.setId(medicamento.getId());
        }
        dto.setNomeMedicamento(medicamento.getNomeMedicamento());
        return dto;
    }

    public Medicamento toEntity(MedicamentoDTO dto) {

        if (dto == null) {
            return null;
        }

        Medicamento medicamento = new Medicamento();
        if (dto.getId() != null) {
            medicamento.setId(dto.getId());
        }

        medicamento.setNomeMedicamento(dto.getNomeMedicamento());

        return medicamento;
    }
}
