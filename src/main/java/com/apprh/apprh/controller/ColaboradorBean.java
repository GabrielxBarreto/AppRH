package com.apprh.apprh.controller;
import javax.faces.bean.ManagedBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

//import javax.faces.bean.ViewScoped;

import org.springframework.beans.factory.annotation.Autowired;

import com.apprh.apprh.Models.Colaborador;
import com.apprh.apprh.Repository.ColaboradorRepository;
import com.apprh.apprh.Service.ColaboradorService;


import lombok.Getter;
import lombok.Setter;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@Scope("view")
public class ColaboradorBean {

    private String usuario;
    private String password;
    private String cpf;
    private String cargo;
    @Autowired
    private ColaboradorService cs;
    private ColaboradorRepository cr;
    public String cadastro(){
        Colaborador colaborador = new Colaborador();
        colaborador.setUsuario(usuario);
        colaborador.setSenha(password);
        colaborador.setCpf(cpf);
        colaborador.setCargo(cargo);
        cs.salvarColaborador(colaborador);
        return "login.xhtml?faces-redirect=true";
    }
   

    // Métodos do bean
}
