package com.apprh.apprh.Models;

import java.sql.Time;
import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class FolgaseTurnos {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long idEscala;
private String turno;
private Time inicioDoTurno;
private  Time fimTurno;
private Date dataFolha;
@ManyToOne
private Gestor gestor;
public Long getIdEscala() {
    return idEscala;
}
public void setIdEscala(Long idEscala) {
    this.idEscala = idEscala;
}
public String getTurno() {
    return turno;
}
public void setTurno(String turno) {
    this.turno = turno;
}
public Time getInicioDoTurno() {
    return inicioDoTurno;
}
public void setInicioDoTurno(Time inicioDoTurno) {
    this.inicioDoTurno = inicioDoTurno;
}
public Time getFimTurno() {
    return fimTurno;
}
public void setFimTurno(Time fimTurno) {
    this.fimTurno = fimTurno;
}
public Date getDataFolha() {
    return dataFolha;
}
public void setDataFolha(Date dataFolha) {
    this.dataFolha = dataFolha;
} 
}
