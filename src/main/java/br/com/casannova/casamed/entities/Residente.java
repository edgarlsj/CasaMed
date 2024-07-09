package br.com.casannova.casamed.entities;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "residente")
@Data
@NoArgsConstructor
@AllArgsConstructor



public class Residente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_residente")
    private Long id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "data_nascimento", nullable = false)
    private LocalDate dataNascimento;

    @Column(name = "descricao_enfermidade", nullable = false)
    private String descricaoEnfermidade;

    @Column(name = "peso", nullable = false)
    private Integer peso;

    @Column(name = "convenio", nullable = false)
    private String convenio;

    @Column(name = "sexo", nullable = false)
    private Character sexo;

    @Column(name = "alergias", nullable = true)
    private String alergias;

//    @ManyToOne
//    @JoinColumn(name = "id_medicamento")
//    private Medicamento medicamento;

//    @OneToMany(mappedBy = "residente")
//    private List<Prescricao> prescricoes;






}
