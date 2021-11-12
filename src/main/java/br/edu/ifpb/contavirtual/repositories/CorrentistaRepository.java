package br.edu.ifpb.contavirtual.repositories;

import br.edu.ifpb.contavirtual.model.Correntista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CorrentistaRepository extends JpaRepository<Correntista, Long> {

        @Query("SELECT corr FROM Correntista corr WHERE corr.cpf =:cpf")
        Correntista buscarCorrentistaPorCpf(@Param("cpf") String cpf);

}
