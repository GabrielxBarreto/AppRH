package com.apprh.apprh.Models;

import jakarta.persistence.Column;// deleta a tabela e suas informações 
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue; // id automatico 
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;// identifica o id
import jakarta.persistence.ManyToOne;// relacionamento de cardinalidade
import jakarta.persistence.Table;

@Entity
@Table(name = "Candidato") 
public class Candidato{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true) // valores unicos na coluna
    private String rg;

    private String nomeCandidato;
    private String email;

    @ManyToOne  
    private Vaga vaga;
    
    public String getEmail() {
        return email;
    }public long getId() {
        return id;
    }public String getNomeCandidato() {
        return nomeCandidato;
    }public String getRg() {
        return rg;
    }public Vaga getVaga() {
        return vaga;
    }

    public void setEmail(String email) {
        this.email = email;
    }public void setId(long id) {
        this.id = id;
    }public void setNomeCandidato(String nomeCandidato) {
        this.nomeCandidato = nomeCandidato;
    }public void setRg(String rg) {
        this.rg = rg;
    }public void setVaga(Vaga vaga) {
        this.vaga = vaga;
    }
}
