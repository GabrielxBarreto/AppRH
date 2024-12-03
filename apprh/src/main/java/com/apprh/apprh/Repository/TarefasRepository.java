package com.apprh.apprh.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.apprh.apprh.Models.Tarefas;
@Repository
public interface TarefasRepository  extends JpaRepository<Tarefas,Long>{
public Tarefas findByIdTarefa(Long id);

}
