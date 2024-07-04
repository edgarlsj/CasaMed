package entities;


import jakarta.persistence.*;
import lombok.Data;

import java.sql.Time;
import java.util.Date;

@Entity
@Table(name = "prescricao")
@Data

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

    @ManyToOne
    @JoinColumn(name = "id_medicamento")
    private Medicamento medicamento;

    @Column(name = "etiqueta")
    private Boolean etiqueta;

    @Column(name = "observacao", nullable = false)
    private String observacao;





}
