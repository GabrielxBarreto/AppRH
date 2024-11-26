package com.apprh.apprh.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apprh.apprh.Models.Candidato;
import com.apprh.apprh.Models.Vaga;

// a estrutura findBy é padrão
@Repository
public interface CandidatoRepository extends JpaRepository<Candidato, Long>{
    // o generic: <Candidato, String> indica a classe que será manipulada e o tipo da chave primaria a entidade
    Iterable<Candidato>findByVaga(Vaga vaga);
    Candidato findByRg(String rg);
    Candidato findById(long id);
    Candidato findByNomeCandidato(String nome);

}
