package com.ufape.jachei.servicos;

import com.ufape.jachei.models.PrestadorServico;

import java.util.List;

public interface InterfaceServicosPrestadorServicos {
    PrestadorServico savePrestadorServicos(PrestadorServico entity);

    List<PrestadorServico> findAllPrestadorServicos();

    void deleteByIdPrestadorServicos(Long id);

    void deletePrestadorServicos(PrestadorServico entity);
}
