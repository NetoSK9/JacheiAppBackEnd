package com.ufape.jachei.servicos;


import com.ufape.jachei.models.ServicosHasCategoria;
import com.ufape.jachei.repo.ServicosHasCategoriaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicosServicosHasCategoria implements InterfaceServicosServicosHasCategoria {

    @Autowired
    private ServicosHasCategoriaRepo repositorioServicosHasCategoria;


    @Override
    public ServicosHasCategoria saveServicosHasCategoria(ServicosHasCategoria entity) {

        return repositorioServicosHasCategoria.save(entity);
    }


    @Override
    public ServicosHasCategoria findByIdServicosHasCategoria(Long id) {
        Optional<ServicosHasCategoria> servicosHasCategoria = repositorioServicosHasCategoria.findById(id);
        if(servicosHasCategoria.isPresent()){
            return servicosHasCategoria.get();
        }else{
            return null;
        }
    }


    @Override
    public List<ServicosHasCategoria> findAllServicosHasCategorias() {
        return repositorioServicosHasCategoria.findAll();
    }


    @Override
    public void deleteByIdServicosHasCategoria(Long id) {
        repositorioServicosHasCategoria.deleteById(id);
    }


    @Override
    public void deleteServicosHasCategoria(ServicosHasCategoria entity) {
        repositorioServicosHasCategoria.delete(entity);
    }
}
