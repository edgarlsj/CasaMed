package br.com.casannova.casamed.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

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

//    @ManyToMany(mappedBy = "medicamentos")
//    private List<Prescricao> prescricoes;


}
