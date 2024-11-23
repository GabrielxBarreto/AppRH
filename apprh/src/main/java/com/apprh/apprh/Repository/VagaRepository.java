package com.apprh.apprh.Repository;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.apprh.apprh.Models.Vaga;
public interface VagaRepository extends CrudRepository<Vaga, String>{
    Vaga findByCodigo(long codigo);
    List<Vaga> findByNome(String nome);

}
