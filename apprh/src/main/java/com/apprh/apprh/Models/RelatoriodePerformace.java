package com.apprh.apprh.Models;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class RelatoriodePerformace {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int idRelatorio;
private Date dataRelatorio;
private float desempenhoIndividual;
private float avaliacaoEquipe;

}
