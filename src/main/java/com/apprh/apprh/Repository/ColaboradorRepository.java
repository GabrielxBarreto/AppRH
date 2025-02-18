package com.apprh.apprh.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apprh.apprh.Models.Colaborador;
@Repository
public interface ColaboradorRepository extends JpaRepository<Colaborador,Long> {

    
    
}
