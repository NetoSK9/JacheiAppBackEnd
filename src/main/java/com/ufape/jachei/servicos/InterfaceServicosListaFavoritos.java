package com.ufape.jachei.servicos;

import com.ufape.jachei.models.ListaFavoritos;

import java.util.List;

public interface InterfaceServicosListaFavoritos {
    ListaFavoritos saveListaFavoritos(ListaFavoritos entity);

    ListaFavoritos findByIdListaFavoritos(Long id);

    List<ListaFavoritos> findAllListaFavoritoss();

    void deleteByIdListaFavoritos(Long id);

    void deleteListaFavoritos(ListaFavoritos entity);
}
