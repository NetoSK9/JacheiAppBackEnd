package com.ufape.jachei.servicos;


import com.ufape.jachei.models.PrestadorServicosHasServicos;
import com.ufape.jachei.models.ServicosHasCategoria;
import com.ufape.jachei.repo.PrestadorServicosHasServicosRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicosPrestadorServicosHasServicos implements InterfaceServicosPrestadorServicosHasServicos {

    @Autowired
    private PrestadorServicosHasServicosRepo prestadorServicosHasServicosRepo;


    @Override
    public PrestadorServicosHasServicos savePrestadorServicosHasServicos(PrestadorServicosHasServicos entity) {

        return prestadorServicosHasServicosRepo.save(entity);
    }


    @Override
    public PrestadorServicosHasServicos findByIdPrestadorServicosHasServicos(Long id) {
        Optional<PrestadorServicosHasServicos> prestadorServicosHasServicos = prestadorServicosHasServicosRepo.findById(id);
        if(prestadorServicosHasServicos.isPresent()){
            return prestadorServicosHasServicos.get();
        }else{
            return null;
        }
    }


    @Override
    public List<PrestadorServicosHasServicos> findAllPrestadorServicosHasServicos() {
        return prestadorServicosHasServicosRepo.findAll();
    }


    @Override
    public void deleteByIdPrestadorServicosHasServicos(Long id) {
        prestadorServicosHasServicosRepo.deleteById(id);
    }


    @Override
    public void deletePrestadorServicosHasServicos(PrestadorServicosHasServicos entity) {
        prestadorServicosHasServicosRepo.delete(entity);
    }
}
