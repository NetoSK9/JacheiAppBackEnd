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
    @Query( nativeQuery = true, value = "select prestadorservicos.*\n" +
            "from prestadorservicos right join prestadorservicos_has_servicos\n" +
            "\ton prestadorservicos.id = prestadorservicos_has_servicos.id_prestador_servico\n" +
            "left join servicos\n" +
            "\ton servicos.id=prestadorservicos_has_servicos.id_servicos\n" +
            "    where lower( replace(servicos.nome,' ','-')) = (:service);")
    List<PrestadorServico> findAllWhitService(String service);
}
