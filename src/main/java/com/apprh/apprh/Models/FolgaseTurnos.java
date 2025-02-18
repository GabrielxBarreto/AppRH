package com.apprh.apprh.Models;

import java.sql.Time;
import java.time.LocalDate;

import javax.persistence.Column;
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
public class FolgaseTurnos extends AbstractEntity<Long>{
@Column
private String turno;
@Column
private Time inicioDoTurno;
@Column
private  Time fimTurno;
@Column
private LocalDate dataFolha;
//@ManyToOne
//@JoinColumn(name="folgaseTurnos_FK")
//private Gestor gestor;

}
