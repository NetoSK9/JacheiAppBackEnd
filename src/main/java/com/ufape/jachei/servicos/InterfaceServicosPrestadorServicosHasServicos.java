package com.ufape.jachei.servicos;

import com.ufape.jachei.models.PrestadorServicosHasServicos;

import java.util.List;

public interface InterfaceServicosPrestadorServicosHasServicos {
    PrestadorServicosHasServicos savePrestadorServicosHasServicos(PrestadorServicosHasServicos entity);

    PrestadorServicosHasServicos findByIdPrestadorServicosHasServicos(Long id);

    List<PrestadorServicosHasServicos> findAllPrestadorServicosHasServicos();

    void deleteByIdPrestadorServicosHasServicos(Long id);

    void deletePrestadorServicosHasServicos(PrestadorServicosHasServicos entity);
}
