package com.apprh.apprh.Models;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Tarefas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int idTarefa;
   private String nomeTarefa;
   private String descricao;
   private Date datainicio;
   private Date dataFim;
public int getIdTarefa() {
    return idTarefa;
}
public void setIdTarefa(int idTarefa) {
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
