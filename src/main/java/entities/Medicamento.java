package entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "medicamento")
@Data

public class Medicamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_medicamento")
    private Long id;

    @Column(name = "nome_medicamento", nullable = false)
    private String nomeMedicamento;


}
