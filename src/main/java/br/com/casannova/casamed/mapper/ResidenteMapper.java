package br.com.casannova.casamed.mapper;

import br.com.casannova.casamed.dto.ResidenteDTO;
import br.com.casannova.casamed.entities.Residente;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class ResidenteMapper {


    private ModelMapper modelMapper;


    public ResidenteDTO toDTO(Residente residente) {//converte um objeto residente para um objeto residenteDTO
        ResidenteDTO residenteDTO = modelMapper.map(residente, ResidenteDTO.class);// mapeia o objeto residente para um objeto residenteDTO
        return residenteDTO;

//        ResidenteDTO dto = new ResidenteDTO();
//        dto.setId(residente.getId());
//        dto.setNome(residente.getNome());
//        dto.setDataNascimento(residente.getDataNascimento());
//        dto.setAlergias(residente.getAlergias());
//        dto.setConvenio(residente.getConvenio());
//        dto.setDescricaoEnfermidade(residente.getDescricaoEnfermidade());
//        dto.setMedicamento(residente.getMedicamento());
//        dto.setSexo(residente.getSexo());
//        dto.setPeso(residente.getPeso());
//        return dto;
    }

    public Residente toEntity(ResidenteDTO dto) {

        Residente residente = modelMapper.map(dto, Residente.class);
            return residente;
        }

//        //converte um objeto residenteDTO para um objeto residente
//        Residente residente = new Residente();// cria um objeto residente
//
//        if (dto.getId() != null) {//verifica se o id do residenteDTO é diferente de nulo
//            residente.setId(dto.getId());//seta o id do residenteDTO no residente
//        }
//
//        residente.setNome(dto.getNome());
//        residente.setDataNascimento(dto.getDataNascimento());
//        residente.setAlergias(dto.getAlergias());
//        residente.setConvenio(dto.getConvenio());
//        residente.setDescricaoEnfermidade(dto.getDescricaoEnfermidade());
//        residente.setMedicamento(dto.getMedicamento());
//        residente.setSexo(dto.getSexo());
//        residente.setPeso(dto.getPeso());
//        return residente;
    }


