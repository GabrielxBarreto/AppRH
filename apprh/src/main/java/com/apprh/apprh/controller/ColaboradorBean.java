package com.apprh.apprh.controller;

import javax.faces.bean.ViewScoped;

import org.springframework.beans.factory.annotation.Autowired;

import com.apprh.apprh.Service.ColaboradorService;

import javax.annotation.ManagedBean;

@ManagedBean
@ViewScoped
public class ColaboradorBean {
    @Autowired
    private ColaboradorService meuServicoSpring;

    // Métodos do bean
}
