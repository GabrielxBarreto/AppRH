package com.apprh.apprh.Models;

import java.util.Date;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class RelatoriodePerformace {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long idRelatorio;
private Date dataRelatorio;
private float desempenhoIndividual;
private float avaliacaoEquipe;
@ManyToOne
private Gestor gestor;
public Long getIdRelatorio() {
    return idRelatorio;
}
public void setIdRelatorio(Long idRelatorio) {
    this.idRelatorio = idRelatorio;
}
public Date getDataRelatorio() {
    return dataRelatorio;
}
public void setDataRelatorio(Date dataRelatorio) {
    this.dataRelatorio = dataRelatorio;
}
public float getDesempenhoIndividual() {
    return desempenhoIndividual;
}
public void setDesempenhoIndividual(float desempenhoIndividual) {
    this.desempenhoIndividual = desempenhoIndividual;
}
public float getAvaliacaoEquipe() {
    return avaliacaoEquipe;
}
public void setAvaliacaoEquipe(float avaliacaoEquipe) {
    this.avaliacaoEquipe = avaliacaoEquipe;
}

}
