package com.ufape.jachei.servicos;


import com.ufape.jachei.models.Endereco;
import com.ufape.jachei.repo.EnderecoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicosEndereco implements InterfaceServicosEndereco {

    @Autowired
    private EnderecoRepo repositorioEndereco;

    @Override
    public Endereco saveEndereco(Endereco entity) {

        return repositorioEndereco.save(entity);
    }

    @Override
    public Endereco findByIdEndereco(Long id) {
        return repositorioEndereco.findById(id).get();

    }

    @Override
    public List<Endereco> findAllEnderecos() {
        return repositorioEndereco.findAll();
    }

    @Override
    public void deleteByIdEndereco(Long id) {
        repositorioEndereco.deleteById(id);
    }

    @Override
    public void deleteEndereco(Endereco entity) {
        repositorioEndereco.delete(entity);
    }
}
