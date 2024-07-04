package entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Medicamentos")
@Data

public class Medicamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_medicamento")
    private Long id;

    @Column(name = "nomeMedicamento", nullable = false)
    private String nomeMedicamento;


}
