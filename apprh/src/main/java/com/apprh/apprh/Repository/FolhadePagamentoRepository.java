package com.apprh.apprh.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apprh.apprh.Models.Candidato;

public interface FolhadePagamentoRepository extends JpaRepository<Candidato, Long> {

}
