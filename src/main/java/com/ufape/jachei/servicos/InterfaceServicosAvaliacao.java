package com.ufape.jachei.servicos;

import com.ufape.jachei.models.Avaliacao;

import java.util.List;

public interface InterfaceServicosAvaliacao {
    Avaliacao saveAvaliacao(Avaliacao entity);

    Avaliacao findByIdAvaliacao(Long id);

    List<Avaliacao> findAllAvaliacao();

    List<Avaliacao> findAllAvaliacaoOfThisPrestador(Long idPrestador);

    void deleteByIdAvaliacao(Long id);

    void deleteAvaliacao(Avaliacao entity);
}
