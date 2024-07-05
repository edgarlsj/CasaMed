package br.com.casannova.casamed.controllers;


import br.com.casannova.casamed.dto.ResidenteDTO;
import br.com.casannova.casamed.services.ResidenteService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/residentes")


public class ResidenteController {


    private ResidenteService residenteService;


  @GetMapping
  public ResponseEntity<?> getAllResidentes(){
      List<ResidenteDTO> list = residenteService.getAllResidente();
      return ResponseEntity.ok(list);
  }

  @GetMapping("/{id}")
    public ResponseEntity<?> getResidentesById(@PathVariable Long id){
      ResidenteDTO residenteDTO = residenteService.findResidenteById(id);
      return ResponseEntity.ok(residenteDTO);
    }

    @PostMapping
    public ResponseEntity<?> createResidente(@RequestBody ResidenteDTO residenteDTO){
      ResidenteDTO residenteCreate = residenteService.CreateResidente(residenteDTO);
      return ResponseEntity.ok(residenteCreate);
    }

}
