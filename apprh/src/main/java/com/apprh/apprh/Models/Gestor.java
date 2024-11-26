package com.apprh.apprh.Models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
@Entity
public class Gestor {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idGestao;
@OneToMany
private List<Colaborador>equipe;

public List<Colaborador> getEquipe() {
    return equipe;
}

public void setEquipe(List<Colaborador> equipe) {
    this.equipe = equipe;
} 

}
