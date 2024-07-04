package mapper;

import dto.ResidenteDTO;
import entities.Residente;
import org.springframework.stereotype.Service;


@Service
public class ResidenteMapper {


    public ResidenteDTO toDTO (Residente residente){//converte um objeto residente para um objeto residenteDTO
        ResidenteDTO dto = new ResidenteDTO();
        dto.setId(residente.getId());
        dto.setNome(residente.getNome());
        dto.setDataNascimento(residente.getDataNascimento());
        dto.setAlergias(residente.getAlergias());
        dto.setConvenio(residente.getConvenio());
        dto.setDescricaoEnfermidade(residente.getDescricaoEnfermidade());
        dto.setMedicamento(residente.getMedicamento());
        dto.setSexo(residente.getSexo());
        dto.setPeso(residente.getPeso());
        return dto;
    }


}
