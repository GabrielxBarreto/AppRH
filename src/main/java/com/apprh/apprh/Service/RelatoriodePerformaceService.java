package com.apprh.apprh.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.apprh.apprh.Models.Colaborador;
import com.apprh.apprh.Models.RelatoriodePerformace;
import com.apprh.apprh.Repository.RelatoriodePerformaceRepository;


@Service
@Transactional
public class RelatoriodePerformaceService {
@Autowired
    RelatoriodePerformaceRepository cr;

    public void salvarRelatorioDePerformace(RelatoriodePerformace rp){
    cr.save(rp);
    }
    public void excluirRelatorioDePerformace(Long id){
        // verificar se existe algum funcionario vinculado ao cargo 
        cr.deleteById(id);
    }
    @Transactional(readOnly = true)
    public RelatoriodePerformace buscarPorId(Long id){
        return cr.findById(id).get();
    }
    public void update(RelatoriodePerformace ft){
        cr.save(ft);
    }
public void gerarRelatorioDesempenho(Colaborador colaborador){
    
}
public void avaliarDesempenho(Colaborador colaborador){
    
}
public void gerarRelatorioEquipe(Colaborador colaborador){
    
}
}
