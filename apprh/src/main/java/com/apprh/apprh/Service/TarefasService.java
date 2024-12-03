package com.apprh.apprh.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.apprh.apprh.Models.Tarefas;

import com.apprh.apprh.Repository.TarefasRepository;
    
    @Service
    @Transactional
    public class TarefasService{
        @Autowired
        TarefasRepository cr;
    
        public void salvarTarefa(Tarefas tarefa){
        cr.save(tarefa);
        }
        public void excluirTarefa(Long id){
            // verificar se existe algum funcionario vinculado ao cargo 
            cr.deleteById(id);
        }
        @Transactional(readOnly = true)
        public Tarefas buscarPorId(Long id){
            return cr.findByIdTarefa(id);
        }
        public void alocarColaborador(){
        //
        }
        public void removerColaborador(){
        //
        }
    }
    
