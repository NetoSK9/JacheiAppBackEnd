package com.ufape.jachei.repo;

import com.ufape.jachei.models.PrestadorServico;
import com.ufape.jachei.models.PrestadorServicosHasServicos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PrestadorServicosHasServicosRepo extends JpaRepository <PrestadorServicosHasServicos,Long> {
    @Query( nativeQuery = true, value = "select prestadorservicos_has_servicos.* \n" +
            "from prestadorservicos_has_servicos \n" +
            "left join prestadorservicos\n" +
            "on prestadorservicos_has_servicos.id = (:idPrestador);")
    List<PrestadorServicosHasServicos> findAllOfPrestador(Long idPrestador);

}