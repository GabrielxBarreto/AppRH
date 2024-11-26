package com.apprh.apprh.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apprh.apprh.Models.Candidato;

public interface GestorRepository extends JpaRepository<Candidato, Long>{

}
