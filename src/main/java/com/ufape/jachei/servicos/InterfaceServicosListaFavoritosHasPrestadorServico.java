package com.ufape.jachei.servicos;

import com.ufape.jachei.models.ListaFavoritosHasPrestadorServico;

import java.util.List;

public interface InterfaceServicosListaFavoritosHasPrestadorServico {
    ListaFavoritosHasPrestadorServico saveListaFavoritosHasPrestadorServico(ListaFavoritosHasPrestadorServico entity);

    ListaFavoritosHasPrestadorServico findByIdListaFavoritosHasPrestadorServico(Long id);

    List<ListaFavoritosHasPrestadorServico> findAllListaFavoritosHasPrestadorServicos();

    void deleteByIdListaFavoritosHasPrestadorServico(Long id);

    void deleteListaFavoritosHasPrestadorServico(ListaFavoritosHasPrestadorServico entity);
}
