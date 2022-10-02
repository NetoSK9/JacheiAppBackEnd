package com.ufape.jachei.controllers;

import com.ufape.jachei.facade.Facade;
import com.ufape.jachei.models.Contato;
import com.ufape.jachei.models.Endereco;
import com.ufape.jachei.models.PrestadorServico;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping(value =  "/jachei/prestadores-servicos")
@RestController
public class PrestadorServicosController {
    @Autowired
    private Facade facede;

    @PostMapping(value = "/salvar-prestador-servicos")
    public String createPrestadorServico(@RequestBody PrestadorServico prestadorServico) {

        facede.savePrestadorServicos(prestadorServico);
        return "Salvo...";
    }

    @GetMapping( value = "/prestador-servicos/{id}")
    public PrestadorServico findPrestadorServicosByID(@PathVariable Long id){
        return facede.findByIdPrestadorServicos(id);
    }

    @GetMapping(value = "/ver-todos-prestadores-servicos")
    public List<PrestadorServico> getAllPrestadorServico() {
        return facede.findAllPrestadorServicos();
    }

    @GetMapping(value = "/ver-todos-prestadores-servicos-na-cidade-{city}")
    public List<PrestadorServico> getAllPrestadorServicoInCity(@PathVariable String city) {
        return facede.findAllPrestadorServicosInCity(city);
    }

    @PutMapping ( value = "/alterar-prestador-servicos/{id}")
    public String updatePrestadorServicos( @PathVariable Long id, @RequestBody @NotNull PrestadorServico prestadorServico ){
        PrestadorServico updatePrestador = facede.findByIdPrestadorServicos(id);

        updatePrestador.setAceitaPix(prestadorServico.getAceitaPix());
        updatePrestador.setAceitarAgendamento(prestadorServico.getAceitarAgendamento());
        updatePrestador.setAceitarCartao(prestadorServico.getAceitarCartao());
        updatePrestador.setAtende24H(prestadorServico.getAtende24H());
        updatePrestador.setAtendeDomiciliar(prestadorServico.getAtendeDomiciliar());
        updatePrestador.setCpf(prestadorServico.getCpf());
        updatePrestador.setFazDelivery(updatePrestador.getFazDelivery());
        updatePrestador.setFotoPerfil(prestadorServico.getCpf());
        updatePrestador.setLevaTraz(prestadorServico.getLevaTraz());
        updatePrestador.setMostrarEndereco(prestadorServico.getMostrarEndereco());
        updatePrestador.setNome(prestadorServico.getNome());
        updatePrestador.setSenha(prestadorServico.getSenha());

        updatePrestador.setIdEndereco(prestadorServico.getIdEndereco());
        updatePrestador.setIdContato(prestadorServico.getIdContato());

        facede.savePrestadorServicos(updatePrestador);
        return "Alterado...";

    }

    @DeleteMapping ( value = "/remover-prestador-servicos/{id}")
    public void deleteByIdPrestadorServicos( @PathVariable Long id ){
        facede.deleteByIdPrestadorServicos(id);
    }

    @GetMapping( value = "/ver-contato-prestador/{idPrestadorServicos}" )
    public Contato findContatoOfPrestadorServicos(@PathVariable Long idPrestadorServicos) {
        return facede.findByIdPrestadorServicos(idPrestadorServicos).getIdContato();
    }

    @GetMapping( value = "/ver-endereco-prestador/{idPrestadorServicos}" )
    public Endereco findEnderecoOfPrestadorServicos(@PathVariable Long idPrestadorServicos) {
        return facede.findByIdPrestadorServicos(idPrestadorServicos).getIdEndereco();
    }


    public void deletePrestadorServicos( PrestadorServico entity ){
        facede.deletePrestadorServicos(entity);
    }
}
