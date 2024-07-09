package br.com.casannova.casamed.controllers;

import br.com.casannova.casamed.dto.PrescricaoDTO;
import br.com.casannova.casamed.services.PrescricaoService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/prescricoes")
@AllArgsConstructor
@RestController
public class PrescricaoController {

    private final PrescricaoService prescricaoService;

    @GetMapping
    public ResponseEntity<?> getAllPrescricoes() {
        return ResponseEntity.ok(prescricaoService.getAllPrescricoes());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getPrescricaoById(@PathVariable Long id) {
        return ResponseEntity.ok(prescricaoService.getPrescricaoById(id));
    }

    @PostMapping(consumes = "application/json")
    public ResponseEntity<?> createPrescricao (@RequestBody PrescricaoDTO prescricaoDTO){
        return ResponseEntity.ok(prescricaoService.createPrescricao(prescricaoDTO));
    }

}
