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
        List<MedicamentoDTO> list = medicamentoService.getAllMedicamentos();
        return ResponseEntity.ok(list);
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable Long id){
        MedicamentoDTO dto = medicamentoService.findById(id);
        return ResponseEntity.ok(dto);

    }
    @PostMapping
    public ResponseEntity<?> createMedicamentos(@RequestBody MedicamentoDTO medicamentoDTO){
        MedicamentoDTO create = medicamentoService.createMedicamento(medicamentoDTO);
        return ResponseEntity.ok(create);
    }
    @PutMapping("/{id}")
    public ResponseEntity<?> updateMedicamentos(@PathVariable Long id, @RequestBody MedicamentoDTO medicamentoDTO){
        MedicamentoDTO update = medicamentoService.updateMedicamento(id,medicamentoDTO);
        return ResponseEntity.ok(update);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMedicamentos(Long id){
        medicamentoService.deleteMedicamento(id);
        return ResponseEntity.noContent().build();

    }
}
