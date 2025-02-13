package com.apprh.apprh.Models;

import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

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
