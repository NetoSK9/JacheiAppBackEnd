package com.ufape.jachei.facade;

import com.ufape.jachei.models.*;
import com.ufape.jachei.servicos.*;
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
    @Autowired
    private InterfaceServicosEndereco servicosEndereco;
    @Autowired
    private InterfaceServicosContato servicosContato;
    @Autowired
    private InterfaceServicosServicosHasCategoria servicosServicosHasCategoria;

    public PrestadorServico savePrestadorServicos(PrestadorServico entity) {

        return servicosPrestadorServicos.savePrestadorServicos(entity);
    }

    public PrestadorServico findByIdPrestadorServicos(Long id){
        return servicosPrestadorServicos.findByIdPrestadorServicos(id);
    }

    public List<PrestadorServico> findAllPrestadorServicos() {
        return servicosPrestadorServicos.findAllPrestadorServicos();
    }

    public List<PrestadorServico> findAllPrestadorServicosInCity(String city) {
        return servicosPrestadorServicos.findAllPrestadorServicosInCity(city);
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
    public List<Avaliacao> findAllAvaliacaoOfThisPrestador(Long idPrestador){
        return servicosAvaliacao.findAllAvaliacaoOfThisPrestador(idPrestador);
    }

    public void deleteByIdAvaliacao(Long id) {
        servicosAvaliacao.deleteByIdAvaliacao(id);
    }

    public void deleteAvaliacao(Avaliacao entity) {
        servicosAvaliacao.deleteAvaliacao(entity);
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


    public Contato saveContato(Contato entity) {
        return servicosContato.saveContato(entity);
    }

    public Contato findByIdContato(Long id){
        return servicosContato.findByIdContato(id);
    }

    public List<Contato> findAllContatos() {
        return servicosContato.findAllContatos();
    }

    public void deleteByIdContato(Long id) {
        servicosContato.deleteByIdContato(id);
    }

    public void deleteContato(Contato entity) {
        servicosContato.deleteContato(entity);
    }

    public Endereco saveEndereco(Endereco entity) {
        return servicosEndereco.saveEndereco(entity);
    }

    public Endereco findByIdEndereco(Long id){
        return servicosEndereco.findByIdEndereco(id);
    }

    public List<Endereco> findAllEnderecos() {
        return servicosEndereco.findAllEnderecos();
    }

    public void deleteByIdEndereco(Long id) {
        servicosEndereco.deleteByIdEndereco(id);
    }

    public void deleteEndereco(Endereco entity) {
        servicosEndereco.deleteEndereco(entity);
    }

    public List<ServicosHasCategoria> findAllServicosHasCategoria(){
        return  servicosServicosHasCategoria.findAllServicosHasCategorias();
    }

}
