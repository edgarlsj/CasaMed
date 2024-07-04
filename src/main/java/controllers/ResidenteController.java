package controllers;


import dto.ResidenteDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import services.ResidenteService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/residentes")

public class ResidenteController {

    private ResidenteService residenteService;


  @GetMapping
  public List<ResidenteDTO> getAllresidentes(){
      return residenteService.getAllResidente();
  }

}
