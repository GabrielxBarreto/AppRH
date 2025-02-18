package com.apprh.apprh.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.apprh.apprh.Models.Colaborador;
import com.apprh.apprh.Models.Gestor;
import com.apprh.apprh.Repository.GestorRepository;

public class GestorService {
    @Autowired
    GestorRepository cr;

    public void salvarGestor(Gestor g){
    cr.save(g);
    }
    public void excluirGestor(Long id){
        // verificar se existe algum funcionario vinculado ao cargo 
        cr.deleteById(id);
    }
    @Transactional(readOnly = true)
    public Gestor buscarPorId(Long id){
        return cr.findById(id).get();
    }
    public void update(Gestor g){
        cr.save(g);
    }
public void aprovarFolga(Colaborador Colaborador){
    
}
public void gerarRelatorioDesempenho(){
    
}
}
