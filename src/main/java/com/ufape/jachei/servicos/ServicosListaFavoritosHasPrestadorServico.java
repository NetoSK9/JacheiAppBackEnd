package com.ufape.jachei.servicos;


import com.ufape.jachei.models.ListaFavoritosHasPrestadorServico;
import com.ufape.jachei.repo.ListaFavoritosHasPrestadorServicoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicosListaFavoritosHasPrestadorServico implements InterfaceServicosListaFavoritosHasPrestadorServico {

    @Autowired
    private ListaFavoritosHasPrestadorServicoRepo repositorioListaFavoritosHasPrestadorServico;

    @Override
    public ListaFavoritosHasPrestadorServico saveListaFavoritosHasPrestadorServico(ListaFavoritosHasPrestadorServico entity) {

        return repositorioListaFavoritosHasPrestadorServico.save(entity);
    }

    @Override
    public ListaFavoritosHasPrestadorServico findByIdListaFavoritosHasPrestadorServico(Long id) {
        Optional<ListaFavoritosHasPrestadorServico> listaFavoritosHasPrestadorServico = repositorioListaFavoritosHasPrestadorServico.findById(id);
        if(listaFavoritosHasPrestadorServico.isPresent()){
            return listaFavoritosHasPrestadorServico.get();
        }else{
            return null;
        }
    }

    @Override
    public List<ListaFavoritosHasPrestadorServico> findAllListaFavoritosHasPrestadorServicos() {
        return repositorioListaFavoritosHasPrestadorServico.findAll();
    }

    @Override
    public void deleteByIdListaFavoritosHasPrestadorServico(Long id) {
        repositorioListaFavoritosHasPrestadorServico.deleteById(id);
    }

    @Override
    public void deleteListaFavoritosHasPrestadorServico(ListaFavoritosHasPrestadorServico entity) {
        repositorioListaFavoritosHasPrestadorServico.delete(entity);
    }
}
