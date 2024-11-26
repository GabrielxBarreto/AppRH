package com.apprh.apprh.Repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apprh.apprh.Models.Vaga;
@Repository
public interface VagaRepository extends JpaRepository<Vaga, Long>{
    Vaga findByCodigo(Long codigo);
    List<Vaga> findByNome(String nome);

}
