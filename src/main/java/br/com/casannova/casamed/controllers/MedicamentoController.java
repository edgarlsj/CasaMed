package br.com.casannova.casamed.controllers;


import br.com.casannova.casamed.dto.MedicamentoDTO;
import br.com.casannova.casamed.services.MedicamentoService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/medicamentos")

public class MedicamentoController {

    public final MedicamentoService medicamentoService;

    @GetMapping
    public ResponseEntity<?> getAllMedicamentos(){//endpoint para buscar todos os medicamentos
        return ResponseEntity.ok(medicamentoService.getAllMedicamentos());
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable Long id){
        return ResponseEntity.ok(medicamentoService.findById(id));

    }
    @PostMapping
    public ResponseEntity<?> createMedicamentos(@RequestBody MedicamentoDTO medicamentoDTO){
        return ResponseEntity.ok(medicamentoService.createMedicamento(medicamentoDTO));
    }
    @PutMapping("/{id}")
    public ResponseEntity<?> updateMedicamentos(@PathVariable Long id, @RequestBody MedicamentoDTO medicamentoDTO){
        return ResponseEntity.ok(medicamentoService.updateMedicamento(id,medicamentoDTO));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMedicamentos(Long id){
        medicamentoService.deleteMedicamento(id);
        return ResponseEntity.noContent().build();

    }
}
