package com.ufape.jachei.servicos;


import com.ufape.jachei.models.Contato;
import com.ufape.jachei.repo.ContatoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicosContato implements InterfaceServicosContato {

    @Autowired
    private ContatoRepo repositorioContato;

    @Override
    public Contato saveContato(Contato entity) {

        return repositorioContato.save(entity);
    }

    @Override
    public Contato findByIdContato(Long id) {
        Optional<Contato> Contato = repositorioContato.findById(id);
        if(Contato.isPresent()){
            return Contato.get();
        }else{
            return null;
        }
    }

    @Override
    public List<Contato> findAllContatos() {
        return repositorioContato.findAll();
    }

    @Override
    public void deleteByIdContato(Long id) {
        repositorioContato.deleteById(id);
    }

    @Override
    public void deleteContato(Contato entity) {
        repositorioContato.delete(entity);
    }
}
