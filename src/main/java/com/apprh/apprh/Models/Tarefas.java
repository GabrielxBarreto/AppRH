package com.apprh.apprh.Models;

import java.time.LocalDate;
//import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
/*import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;*/

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Tarefas extends AbstractEntity<Long>{
   
   @Column
   private String nomeTarefa;
   @Column
   private String descricao;
   @Column
   private LocalDate datainicio;
   @Column
   private LocalDate dataFim;
/*@ManyToOne
@JoinColumn(name="tarefa_FK")
private Gestor gestor;*/


}
