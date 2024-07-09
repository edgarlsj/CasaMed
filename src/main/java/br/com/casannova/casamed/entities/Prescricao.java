package br.com.casannova.casamed.entities;


import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Time;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "prescricao")
@Getter
@Setter
@NoArgsConstructor

public class Prescricao {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "id_prescricao")
    private Long id;

    @Column(name = "data_prescricao", nullable = false)
    private Date dataPrescricao;

    @Column(name = "dose", nullable = false)
    private String dose;

    @Column(name = "periodo_dia")//variavel periodo do dia que residente irá tomar remedio
    private String periodoDia;

    @Column(name = "via", nullable = false)
    private String via;

    @Column (name = "horario_adm") //horario que o residente irá tomar o medicamento
    private Time horarioAdm;

    @ManyToOne
    @JoinColumn(name = "id_residente")
    private Residente residente;

    @ManyToMany
    @JoinTable(name = "prescricao_medicamento",
            joinColumns = @JoinColumn(name = "id_prescricao"),
            inverseJoinColumns = @JoinColumn(name = "id_medicamento"))
    private List<Medicamento> medicamentos;


    @Column(name = "etiqueta")
    private Boolean etiqueta;

    @Column(name = "observacao", nullable = false)
    private String observacao;





}
