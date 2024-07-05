package br.com.casannova.casamed.dto;

import br.com.casannova.casamed.entities.Medicamento;
import lombok.Data;

import java.time.LocalDate;

@Data

public class ResidenteDTO {


    private Long id;
    private String nome;
    private LocalDate dataNascimento;
    private String descricaoEnfermidade;
    private Integer peso;
    private String convenio;
    private Character sexo;
    private String alergias;
    private Medicamento medicamento;
}
