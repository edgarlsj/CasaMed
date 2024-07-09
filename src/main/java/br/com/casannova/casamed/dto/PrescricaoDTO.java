package br.com.casannova.casamed.dto;

import br.com.casannova.casamed.entities.Medicamento;
import br.com.casannova.casamed.entities.Residente;
import lombok.Data;

import java.sql.Time;
import java.util.Date;
import java.util.List;

@Data
public class PrescricaoDTO {

    private Long id;
    private Date dataPrescricao;
    private String dose;
    private String periodoDia;
    private String via;
    private Time horarioAdm;
    private List<Medicamento> medicamentos;
    private Boolean etiqueta;
    private String observacao;
    private Residente residente;

}