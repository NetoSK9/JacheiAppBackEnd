package com.ufape.jachei.servicos;


import com.ufape.jachei.models.ListaFavoritos;
import com.ufape.jachei.repo.ListaFavoritosRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicosListaFavoritos implements InterfaceServicosListaFavoritos {

    @Autowired
    private ListaFavoritosRepo repositorioListaFavoritos;

    @Override
    public ListaFavoritos saveListaFavoritos(ListaFavoritos entity) {

        return repositorioListaFavoritos.save(entity);
    }



    @Override
    public ListaFavoritos findByIdListaFavoritos(Long id) {
        Optional<ListaFavoritos> ListaFavoritos = repositorioListaFavoritos.findById(id);
        if(ListaFavoritos.isPresent()){
            return ListaFavoritos.get();
        }else{
            return null;
        }
    }

    @Override
    public List<ListaFavoritos> findAllListaFavoritoss() {
        return repositorioListaFavoritos.findAll();
    }

    @Override
    public void deleteByIdListaFavoritos(Long id) {
        repositorioListaFavoritos.deleteById(id);
    }

    @Override
    public void deleteListaFavoritos(ListaFavoritos entity) {
        repositorioListaFavoritos.delete(entity);
    }
}
