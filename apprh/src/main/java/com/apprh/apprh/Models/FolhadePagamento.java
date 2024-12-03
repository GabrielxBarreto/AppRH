package com.apprh.apprh.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class FolhadePagamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idFolha;
    private String salarioBase;
    private float descontos;
    private float beneficios;
    private float valorLiquido;
    @OneToOne
    private Colaborador colaborador;
public int getIdFolha() {
    return idFolha;
}
public void setIdFolha(int idFolha) {
    this.idFolha = idFolha;
}
public String getSalarioBase() {
    return salarioBase;
}
public void setSalarioBase(String salarioBase) {
    this.salarioBase = salarioBase;
}
public float getDescontos() {
    return descontos;
}
public void setDescontos(float descontos) {
    this.descontos = descontos;
}
public float getBeneficios() {
    return beneficios;
}
public void setBeneficios(float beneficios) {
    this.beneficios = beneficios;
}
public float getValorLiquido() {
    return valorLiquido;
}
public void setValorLiquido(float valorLiquido) {
    this.valorLiquido = valorLiquido;
}
}
