package com.apprh.apprh.Models;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Colaborador {
    @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
private int idColaborador;
private String nome;
private int cpf;  
private String cargo;
private Date dataNascimento;
private float salario;
private Date dataDeContratacao;
private String[] status = {"ativo","afastado","demitido"};
private String  departamento;
public int getIdColaborador() {
    return idColaborador;
}
public void setIdColaborador(int idColaborador) {
    this.idColaborador = idColaborador;
}
public String getNome() {
    return nome;
}
public void setNome(String nome) {
    this.nome = nome;
}
public int getCpf() {
    return cpf;
}
public void setCpf(int cpf) {
    this.cpf = cpf;
}
public String getCargo() {
    return cargo;
}
public void setCargo(String cargo) {
    this.cargo = cargo;
}
public Date getDataNascimento() {
    return dataNascimento;
}
public void setDataNascimento(Date dataNascimento) {
    this.dataNascimento = dataNascimento;
}
public float getSalario() {
    return salario;
}
public void setSalario(float salario) {
    this.salario = salario;
}
public Date getDataDeContratacao() {
    return dataDeContratacao;
}
public void setDataDeContratacao(Date dataDeContratacao) {
    this.dataDeContratacao = dataDeContratacao;
}
public String[] getStatus() {
    return status;
}
public void setStatus(String[] status) {
    this.status = status;
}
public String getDepartamento() {
    return departamento;
}
public void setDepartamento(String departamento) {
    this.departamento = departamento;
} 

}
