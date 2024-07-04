package entities;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "pacientes")
@Data

public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_paciente")
    private Long id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "dataNascimento", nullable = false)
    private LocalDate dataNascimento;

    @Column(name = "descricaoEnfermidade", nullable = false)
    private String descricaoEnfermidade;

    @Column(name = "data_inicio", nullable = false)
    private Date dataInicio;

    @Column(name = "data_fim")
    private Date dataFim;

    @Column(name = "peso", nullable = false)
    private Integer peso;

}
