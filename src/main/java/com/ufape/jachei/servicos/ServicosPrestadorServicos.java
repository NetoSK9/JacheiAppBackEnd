package com.ufape.jachei.servicos;


import com.ufape.jachei.models.PrestadorServico;
import com.ufape.jachei.repo.EnderecoRepo;
import com.ufape.jachei.repo.PrestadorServicoRepo;
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
        repositorioPrestador.deleteById(id);
    }

    @Override
    public void deletePrestadorServicos(PrestadorServico entity) {
        repositorioPrestador.delete(entity);
    }


}
