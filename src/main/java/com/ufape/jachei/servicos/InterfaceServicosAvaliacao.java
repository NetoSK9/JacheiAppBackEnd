package com.ufape.jachei.servicos;

import com.ufape.jachei.models.Avaliacao;

import java.util.List;

public interface InterfaceServicosAvaliacao {
    Avaliacao saveAvaliacao(Avaliacao entity);

    List<Avaliacao> findAllAvaliacao();

    void deleteByIdAvaliacao(Long id);

    void deleteAvaliacaoRepo(Avaliacao entity);
}
