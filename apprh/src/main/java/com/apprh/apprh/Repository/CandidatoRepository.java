package com.apprh.apprh.Repository;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.apprh.apprh.Models.Candidato;
import com.apprh.apprh.Models.Vaga;

// a estrutura findBy é padrão
public interface CandidatoRepository extends CrudRepository<Candidato,String> {
    // o generic: <Candidato, String> indica a classe que será manipulada e o tipo da chave primaria a entidade
    Iterable<Candidato>findByVaga(Vaga vaga);
    Candidato findByRG(String rg);
    Candidato findById(long id);
    Candidato findByNome(String nome);

}
