package com.ufape.jachei.repo;

import com.ufape.jachei.models.PrestadorServico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PrestadorServicoRepo extends JpaRepository<PrestadorServico,Long> {
    @Query( nativeQuery = true, value = "SELECT prestadorservicos.* FROM" +
            " prestadorservicos inner join endereco" +
            " on prestadorservicos.id_endereco = endereco.id" +
            " and lower(  replace(endereco.cidade,' ','-') ) = (:city)")
    List<PrestadorServico> findAllInCity(String city);
}
