package com.apprh.apprh.Models;

import java.sql.Time;
import java.util.Date;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class FolgaseTurnos {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int idEscala;
private String turno;
private Time inicioDoTurno;
private  Time fimTurno;
private Date dataFolha;
public int getIdEscala() {
    return idEscala;
}
public void setIdEscala(int idEscala) {
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
