package com.apprh.apprh.Models;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;


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

private String  status;


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

public String getDepartamento() {
    return departamento;
}
public void setDepartamento(String departamento) {
    this.departamento = departamento;
} 
public String getStatus() {
    return status;
}
public void setStatus(String status) {
    this.status = status;
}
}
