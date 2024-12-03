package com.apprh.apprh.Service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apprh.apprh.Models.FolgaseTurnos;
import com.apprh.apprh.Repository.FolgaseTurnosRepository;


@Service
@Transactional
public class FolhadePagamentoService {
FolgaseTurnosRepository cr;
@Transactional(readOnly = true)
public List<FolgaseTurnos> buscarTodas(){
    return cr.findAll();
}
public void calcularSalario(){

}
public void gerarHorlenite(){

}
public void atualizarBeneficios(){

}
}
