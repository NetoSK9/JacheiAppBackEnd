package com.ufape.jachei.servicos;


import com.ufape.jachei.models.PrestadorServico;
import com.ufape.jachei.repo.PrestadorServicoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicosPrestadorServicos implements InterfaceServicosPrestadorServicos {
    @Autowired
    private PrestadorServicoRepo repositorioPrestador;


    @Override
    public PrestadorServico savePrestadorServicos(PrestadorServico entity) {

        return repositorioPrestador.save(entity);
    }

    @Override
    public List<PrestadorServico> findAllPrestadorServicos() {
        return repositorioPrestador.findAll();
    }

    @Override
    public void deleteByIdPrestadorServicos(Long id) {
        repositorioPrestador.deleteById(id);
    }

    @Override
    public void deletePrestadorServicos(PrestadorServico entity) {
        repositorioPrestador.delete(entity);
    }
}
