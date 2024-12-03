package com.apprh.apprh.Service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apprh.apprh.Models.Colaborador;
import com.apprh.apprh.Models.FolgaseTurnos;
import com.apprh.apprh.Repository.FolgaseTurnosRepository;

@Service
@Transactional
public class FolgaseTurnosService {
    @Autowired
    FolgaseTurnosRepository cr;

    public void salvarFolgaseTurno(FolgaseTurnos ft){
    cr.save(ft);
    }
    public void excluirFolgaseTurno(Long id){
        // verificar se existe algum funcionario vinculado ao cargo 
        cr.deleteById(id);
    }
    @Transactional(readOnly = true)
    public FolgaseTurnos buscarPorId(Long id){
        return cr.findByIdEscala(id);
    }
    public void update(FolgaseTurnos ft){
        cr.save(ft);
    }
    public void alocarTurno(Colaborador colaborador){

    }
    public void definirFolga(Colaborador colaborador){

    }
    public void gerarEscala(){
        
    }
}
