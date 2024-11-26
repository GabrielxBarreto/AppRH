package com.apprh.apprh.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

import com.apprh.apprh.Models.Candidato;
import com.apprh.apprh.Repository.CandidatoRepository;

@Service
@Transactional
public class CandidatoService {
    @Autowired
    CandidatoRepository cr;

    public void salvarCandidato(Candidato candidato){
    cr.save(candidato);
    }
    public void excluirCandidato(Long id){
        // verificar se existe algum funcionario vinculado ao cargo 
        cr.deleteById(id);
    }
    @Transactional(readOnly = true)
    public Candidato buscarPorId(Long id){
        return cr.findById(id).get();
    }
}
