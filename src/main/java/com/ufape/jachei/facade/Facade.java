package com.ufape.jachei.facade;

import com.ufape.jachei.models.Avaliacao;
import com.ufape.jachei.models.PrestadorServico;
import com.ufape.jachei.models.Usuario;
import com.ufape.jachei.servicos.InterfaceServicosAvaliacao;
import com.ufape.jachei.servicos.InterfaceServicosPrestadorServicos;
import com.ufape.jachei.servicos.InterfaceServicosUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Facade {
    @Autowired
    private InterfaceServicosPrestadorServicos servicosPrestadorServicos;
    @Autowired
    private InterfaceServicosAvaliacao servicosAvaliacao;
    @Autowired
    private InterfaceServicosUsuario servicosUsuario;

    public PrestadorServico savePrestadorServicos(PrestadorServico entity) {
        return servicosPrestadorServicos.savePrestadorServicos(entity);
    }

    public PrestadorServico findByIdPrestadorServicos(Long id){
        return servicosPrestadorServicos.findByIdPrestadorServicos(id);
    }

    public List<PrestadorServico> findAllPrestadorServicos() {
        return servicosPrestadorServicos.findAllPrestadorServicos();
    }

    public void deleteByIdPrestadorServicos(Long id) {
        servicosPrestadorServicos.deleteByIdPrestadorServicos(id);
    }

    public void deletePrestadorServicos(PrestadorServico entity) {
        servicosPrestadorServicos.deletePrestadorServicos(entity);
    }


    public Avaliacao saveAvaliacao(Avaliacao entity) {
        return servicosAvaliacao.saveAvaliacao(entity);
    }

    public Avaliacao findByIdAvaliacao(Long id) {
        return servicosAvaliacao.findByIdAvaliacao(id);
    }

    public List<Avaliacao> findAllAvaliacoes() {
        return servicosAvaliacao.findAllAvaliacao();
    }

    public void deleteByIdAvaliacao(Long id) {
        servicosAvaliacao.deleteByIdAvaliacao(id);
    }

    public void deleteAvaliacaoRepo(Avaliacao entity) {
        servicosAvaliacao.deleteAvaliacaoRepo(entity);
    }



    public Usuario saveUsuario(Usuario entity) {
        return servicosUsuario.saveUsuario(entity);
    }

    public Usuario findByIdUsuario(Long id) {
        return servicosUsuario.findByIdUsuario(id);
    }

    public List<Usuario> findAllUsuarios() {
        return servicosUsuario.findAllUsuarios();
    }

    public void deleteByIdUsuario(Long id) {
        servicosUsuario.deleteByIdUsuario(id);
    }

    public void deleteUsuario(Usuario entity) {
        servicosUsuario.deleteUsuario(entity);
    }
}
