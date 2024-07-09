package br.com.casannova.casamed.dto;

import br.com.casannova.casamed.entities.Medicamento;
import br.com.casannova.casamed.entities.Prescricao;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

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

}
