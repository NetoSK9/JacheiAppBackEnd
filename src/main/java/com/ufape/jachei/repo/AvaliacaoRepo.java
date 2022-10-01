package com.ufape.jachei.repo;

import com.ufape.jachei.models.Avaliacao;
import com.ufape.jachei.models.PrestadorServico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AvaliacaoRepo extends JpaRepository<Avaliacao,Long> {
    @Query( nativeQuery = true, value = "select avaliacao.* \n" +
            "from avaliacao where avaliacao.id_prestador_servicos = (:idPrestador)")
    List<Avaliacao> findAllOfThisPrestador(Long idPrestador);
}
