package dto;

import entities.Medicamento;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;

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
