package com.ufape.jachei.servicos;

import com.ufape.jachei.models.Servico;

import java.util.List;

public interface InterfaceServicosServico {
    Servico saveServico(Servico entity);

    Servico findByIdServico(Long id);

    List<Servico> findAllServicos();

    void deleteByIdServico(Long id);

    void deleteServico(Servico entity);
}
