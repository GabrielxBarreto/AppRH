package com.apprh.apprh.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import com.apprh.apprh.Models.Colaborador;

//import javax.faces.bean.ViewScoped;


import com.apprh.apprh.Service.ColaboradorService;


import lombok.Getter;
import lombok.Setter;




@Component 
@ViewScoped
public class ColaboradorBean {
    private List<Colaborador> colaboradores;
    @Autowired
    private ColaboradorService cs;
    
@Getter @Setter
   private Colaborador colaborador = new Colaborador();
    public void cadastro(){
        
        cs.salvarColaborador(colaborador);
        colaborador = new Colaborador();
        System.out.println("CADASTRO CONCLUIDO");

    }
    public void listar(){
        colaboradores = cs.buscarTodas();
        System.out.println("CADASTRO CONCLUIDO");
    }
   

    // Métodos do bean
}
