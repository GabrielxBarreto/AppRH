package com.apprh.apprh.Service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.apprh.apprh.Models.FolhadePagamento;

import com.apprh.apprh.Repository.FolhadePagamentoRepository;


@Service
@Transactional
public class FolhadePagamentoService {
FolhadePagamentoRepository cr;
@Transactional(readOnly = true)
public List<FolhadePagamento> buscarTodas(){
    return cr.findAll();
}
public void update(FolhadePagamento ft){
    cr.save(ft);
}
public void calcularSalario(){

}
public void gerarHorlenite(){

}
public void atualizarBeneficios(){

}
}
