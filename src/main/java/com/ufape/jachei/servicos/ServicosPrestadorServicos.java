package com.ufape.jachei.servicos;


import com.ufape.jachei.models.*;
import com.ufape.jachei.repo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@Service
public class ServicosPrestadorServicos implements InterfaceServicosPrestadorServicos {
    @Autowired
    private PrestadorServicoRepo repositorioPrestador;
    @Autowired
    private EnderecoRepo enderecoRepo;
    @Autowired
    private ContatoRepo contatoRepo;
    @Autowired
    private AvaliacaoRepo avaliacaoRepo;
    @Autowired
    private ListaFavoritosHasPrestadorServicoRepo listaFavoritosHasPrestadorServicoRepo;
    @Autowired
    private PrestadorServicosHasServicosRepo prestadorServicosHasServicosRepo;


    @Override
    public PrestadorServico savePrestadorServicos(PrestadorServico entity) {

        return repositorioPrestador.save(entity);
    }

    @Override
    public PrestadorServico findByIdPrestadorServicos(Long id) {
        return repositorioPrestador.findById(id).get();

    }

    @Override
    public List<PrestadorServico> findAllPrestadorServicos() {
        return repositorioPrestador.findAll();
    }

    @Override
    public List<PrestadorServico> findAllPrestadorServicosInCity(String city){
        List<PrestadorServico> prestadores = repositorioPrestador.findAll();
        List<PrestadorServico> prestadoresRestorno = new ArrayList<>();
        String formatedCity = city.toLowerCase(Locale.ROOT).replace(" ","-");

        for (PrestadorServico prestador : prestadores){
            if(prestador.getIdEndereco().getCidade()
                    .toLowerCase(Locale.ROOT)
                    .replace(" ","-")
                    .equals(formatedCity) ){
                prestadoresRestorno.add(prestador);
            }
        }
        return prestadoresRestorno;
    }

    @Override
    public void deleteByIdPrestadorServicos(Long id) {
        //Apaga todas as aavaliações em que o prestador selecionado está
        List<Avaliacao> listaAvaliacoes = avaliacaoRepo.findAll();
        for (Avaliacao avaliacao : listaAvaliacoes){
            if( avaliacao.getIdPrestadorservicos().getId().equals(id) ){
                avaliacaoRepo.deleteById(avaliacao.getId());
            }
        }
        //Deleta de todas as listas de favoritos o prestador que será deletado
        List<ListaFavoritosHasPrestadorServico> listaFavoritos = listaFavoritosHasPrestadorServicoRepo.findAll();
        for (ListaFavoritosHasPrestadorServico lista : listaFavoritos){
            if( lista.getIdPrestadorservicos().getId().equals(id) ){
                listaFavoritosHasPrestadorServicoRepo.deleteById(lista.getId());
            }
        }

        //Apaga toda a relação que o prestador tinha com os servicos
        List<PrestadorservicosHasServico> prestadorServicosServicos = prestadorServicosHasServicosRepo.findAll();
        for (PrestadorservicosHasServico lista : prestadorServicosServicos){
            if( lista.getIdPrestadorServico().getId().equals(id) ){
                prestadorServicosHasServicosRepo.deleteById(lista.getId());
            }
        }

        repositorioPrestador.deleteById(id);
    }

    @Override
    public void deletePrestadorServicos(PrestadorServico entity) {
        repositorioPrestador.delete(entity);
    }


}
