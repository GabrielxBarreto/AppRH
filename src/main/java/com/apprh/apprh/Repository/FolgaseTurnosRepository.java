package com.apprh.apprh.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apprh.apprh.Models.FolgaseTurnos;
@Repository
public interface FolgaseTurnosRepository extends JpaRepository<FolgaseTurnos,Long>{
    //public FolgaseTurnos findById(Long id);


}

