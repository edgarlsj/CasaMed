package services;


import dto.ResidenteDTO;
import mapper.ResidenteMapper;
import org.springframework.stereotype.Service;
import repositories.ResidenteRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ResidenteService {

    private ResidenteRepository residenteRepository;
    private ResidenteMapper residenteMapper;


    public List<ResidenteDTO> getAllResidente() {
        List<ResidenteDTO> residenteDTOList = residenteRepository
                .findAll()
                .stream()
                .map(residenteMapper::toDTO)
                .collect(Collectors.toList());

        return residenteDTOList;
    }

}
