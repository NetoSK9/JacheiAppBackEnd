package com.ufape.jachei.servicos;

import com.ufape.jachei.models.Avaliacao;
import com.ufape.jachei.repo.AvaliacaoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicosAvaliacao implements InterfaceServicosAvaliacao {
    @Autowired
    private AvaliacaoRepo repositorioAvaliacao;

    @Override
    public Avaliacao saveAvaliacao(Avaliacao entity) {
        return repositorioAvaliacao.save(entity);
    }

    @Override
    public List<Avaliacao> findAllAvaliacao() {
        return repositorioAvaliacao.findAll();
    }


    @Override
    public void deleteByIdAvaliacao(Long id) {
        repositorioAvaliacao.deleteById(id);
    }


    @Override
    public void deleteAvaliacaoRepo(Avaliacao entity) {
        repositorioAvaliacao.delete(entity);
    }
}
