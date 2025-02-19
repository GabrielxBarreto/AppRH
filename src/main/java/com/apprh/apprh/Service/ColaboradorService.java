package com.apprh.apprh.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apprh.apprh.Models.Colaborador;

import com.apprh.apprh.Repository.ColaboradorRepository;

@Service
@Transactional
public class ColaboradorService {
    @Autowired
    ColaboradorRepository cr;

    public void salvarColaborador(Colaborador candidato){
         cr.save(candidato);
    }
    public void excluirColaborador(Long id){
        // verificar se existe algum funcionario vinculado ao cargo 
        cr.deleteById(id);
    }
    
    @Transactional(readOnly = true)
    public List<Colaborador> buscarTodas(){
        return cr.findAll();
    }
    public void update(Colaborador ft){
        cr.save(ft);
    }
    public void trocarTurno(){
        //a fazer
    }
    public void solicitarFolga(){
        //
    }
   
}
