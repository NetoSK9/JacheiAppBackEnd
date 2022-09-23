package com.ufape.jachei.servicos;

import com.ufape.jachei.models.ServicosHasCategoria;

import java.util.List;

public interface InterfaceServicosServicosHasCategoria {
    ServicosHasCategoria saveServicosHasCategoria(ServicosHasCategoria entity);

    ServicosHasCategoria findByIdServicosHasCategoria(Long id);

    List<ServicosHasCategoria> findAllServicosHasCategorias();

    void deleteByIdServicosHasCategoria(Long id);

    void deleteServicosHasCategoria(ServicosHasCategoria entity);
}
