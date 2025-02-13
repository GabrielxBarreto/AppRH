package com.apprh.apprh.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class FolhadePagamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idFolha;
    @Column
    private String salarioBase;
    @Column
    private float descontos;
    @Column
    private float beneficios;
    @Column
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
