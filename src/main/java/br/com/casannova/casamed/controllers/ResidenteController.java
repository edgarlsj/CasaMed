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


  @GetMapping//endpoint para buscar todos os residentes
  public ResponseEntity<?> getAllResidentes(){
      return ResponseEntity.ok(residenteService.getAllResidente());
  }

  @GetMapping("/{id}")//endpoint para buscar residente por id
    public ResponseEntity<?> getResidentesById(@PathVariable Long id){
      return ResponseEntity.ok(residenteService.findResidenteById(id));
    }

    @PostMapping//endpoint para criar residente
    public ResponseEntity<?> createResidente(@RequestBody ResidenteDTO residenteDTO){
      return ResponseEntity.ok(residenteService.CreateResidente(residenteDTO));
    }

    @PutMapping("/{id}")//endpoint para atualizar residente
    public ResponseEntity<?> updateResidente (@PathVariable Long id, @RequestBody ResidenteDTO residenteDTO){
    return ResponseEntity.ok(residenteService.updateResidente(id,residenteDTO));
    }

    @DeleteMapping("/{id}")//endpoint para deletar residente
    public ResponseEntity<Void> deleteResidente(@PathVariable Long id){
       residenteService.deleteResidente(id);
       return ResponseEntity.noContent().build();
    }



}
