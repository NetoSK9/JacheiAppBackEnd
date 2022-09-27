package com.ufape.jachei.servicos;

import com.ufape.jachei.models.PrestadorServico;

import java.util.List;

public interface InterfaceServicosPrestadorServicos {
    PrestadorServico savePrestadorServicos(PrestadorServico entity);

    PrestadorServico findByIdPrestadorServicos(Long id);

    List<PrestadorServico> findAllPrestadorServicos();

    List<PrestadorServico> findAllPrestadorServicosInCity(String city);

    void deleteByIdPrestadorServicos(Long id);

    void deletePrestadorServicos(PrestadorServico entity);
}
