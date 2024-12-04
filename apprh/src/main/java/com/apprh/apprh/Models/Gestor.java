package com.apprh.apprh.Models;

import java.util.List;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Gestor {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int idGestao;
@OneToMany(mappedBy = "gestor")
private List<Tarefas> tarefa;
@OneToMany(mappedBy = "gestor")
private List<FolgaseTurnos> folgaseTurnos;
@OneToMany(mappedBy = "gestor")
private List<RelatoriodePerformace> relatoriodePerformaces;  

@ElementCollection
@CollectionTable(name = "gestor_equipe", joinColumns = @JoinColumn(name = "gestor_id"))
@Column(name = "colaborador")
private List<Colaborador>equipe;

public List<Colaborador> getEquipe() {
    return equipe;
}

public void setEquipe(List<Colaborador> equipe) {
    this.equipe = equipe;
} 

}
