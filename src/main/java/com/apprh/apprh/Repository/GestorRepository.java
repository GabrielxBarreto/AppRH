package com.apprh.apprh.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.apprh.apprh.Models.Gestor;

public interface GestorRepository extends JpaRepository<Gestor, Long>{
    //Gestor findByIdGestao(Long id);

}
