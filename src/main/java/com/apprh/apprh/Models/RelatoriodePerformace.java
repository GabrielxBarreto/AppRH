package com.apprh.apprh.Models;

import java.time.LocalDate;
//import java.util.Date;



import javax.persistence.Entity;
/*import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;*/

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class RelatoriodePerformace extends AbstractEntity<Long>{

private LocalDate dataRelatorio;
private float desempenhoIndividual;
private float avaliacaoEquipe;
//@ManyToOne
//@JoinColumn(name="relatoriodePerformaces_FK")
//private Gestor gestor;

}
