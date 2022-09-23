package com.ufape.jachei.servicos;


import com.ufape.jachei.models.Endereco;
import com.ufape.jachei.repo.EnderecoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
        Optional<Endereco> Endereco = repositorioEndereco.findById(id);
        if(Endereco.isPresent()){
            return Endereco.get();
        }else{
            return null;
        }
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
