package br.com.casannova.casamed.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Table(name = "medicamento")


public class Medicamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_medicamento")
    private Long id;

    @Column(name = "nome_medicamento", nullable = false)
    private String nomeMedicamento;


}
