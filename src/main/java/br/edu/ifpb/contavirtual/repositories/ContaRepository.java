package br.edu.ifpb.contavirtual.repositories;

import br.edu.ifpb.contavirtual.model.Conta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ContaRepository extends JpaRepository {


//    @Query("SELECT con FROM Conta con WHERE con.id=:id")
//    Conta buscarContaporId(@Param("id") Long id);

    @Query("SELECT con FROM Conta con WHERE con.nconta=:nconta")
    Conta buscarContaPorNumero(@Param("nconta") Long nconta);


}
