package com.apprh.apprh.Models;


import java.time.LocalDate;


import javax.persistence.Column;

import javax.persistence.Entity;



import lombok.Getter;
import lombok.Setter;


@Entity // transforma a classe em tabela
@Getter
@Setter
public class Colaborador extends AbstractEntity<Long>{
@Column
private String usuario;
@Column
private String senha;
@Column
private String nome;
@Column(unique =true)
private String cpf;  
@Column
private String cargo;
@Column
private LocalDate dataNascimento;
@Column
private float salario;
@Column
private LocalDate dataDeContratacao;
@Column
private String  status;


@Column
private String  departamento;

/*@ManyToMany
@JoinTable(
    name ="colab_Tarefas",
    joinColumns = @JoinColumn(name="colab_id"),
    inverseJoinColumns = @JoinColumn(name = "tarefa_id")
)

@OneToOne
private FolhadePagamento folhadePagamento;

public FolhadePagamento getFolhadePagamento() {
    return folhadePagamento;
}*/

}
