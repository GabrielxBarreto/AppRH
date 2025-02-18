package com.apprh.apprh.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
/*import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;*/

import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
public class FolhadePagamento extends AbstractEntity<Long>{
   
    @Column
    private String salarioBase;
    @Column
    private float descontos;
    @Column
    private float beneficios;
    @Column
    private float valorLiquido;
/*@OneToOne
private Colaborador colaborador;*/

}
