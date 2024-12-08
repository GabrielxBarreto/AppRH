package com.apprh.apprh.Models;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;


@Entity // transforma a classe em tabela

public class Colaborador {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int idColaborador;
@Column
private String nome;
@Column(unique =true)
private String cpf;  
@Column
private String cargo;
@Column
private Date dataNascimento;
@Column
private float salario;
@Column
private Date dataDeContratacao;
@Column
private List<String> status = Arrays.asList("ativo", "afastado", "demitido");

@Column
private String  departamento;
@ManyToMany
@JoinTable(
    name ="colab_Tarefas",
    joinColumns = @JoinColumn(name="colab_id"),
    inverseJoinColumns = @JoinColumn(name = "tarefa_id")
)

@OneToOne
private FolhadePagamento folhadePagamento;

public FolhadePagamento getFolhadePagamento() {
    return folhadePagamento;
}
public void setFolhadePagamento(FolhadePagamento folhadePagamento) {
    this.folhadePagamento = folhadePagamento;
}
public Colaborador(){

}
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
public String getCpf() {
    return cpf;
}
public void setCpf(String cpf) {
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
public List<String> getStatus() {
    return status;
}
public void setStatus(List<String> status) {
    this.status = status;
}
public String getDepartamento() {
    return departamento;
}
public void setDepartamento(String departamento) {
    this.departamento = departamento;
} 

}
