package com.apprh.apprh.Models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.ManyToOne;


@Entity
public class Tarefas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
   private Long idTarefa;
   @Column
   private String nomeTarefa;
   @Column
   private String descricao;
   @Column
   private Date datainicio;
   @Column
   private Date dataFim;
@ManyToOne
private Gestor gestor;
public Tarefas(){
    
}
public Long getIdTarefa() {
    return idTarefa;
}
public void setIdTarefa(Long idTarefa) {
    this.idTarefa = idTarefa;
}
public String getNomeTarefa() {
    return nomeTarefa;
}
public void setNomeTarefa(String nomeTarefa) {
    this.nomeTarefa = nomeTarefa;
}
public String getDescricao() {
    return descricao;
}
public void setDescricao(String descricao) {
    this.descricao = descricao;
}
public Date getDatainicio() {
    return datainicio;
}
public void setDatainicio(Date datainicio) {
    this.datainicio = datainicio;
}
public Date getDataFim() {
    return dataFim;
}
public void setDataFim(Date dataFim) {
    this.dataFim = dataFim;
}

}
