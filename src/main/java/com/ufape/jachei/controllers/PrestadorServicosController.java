package com.ufape.jachei.controllers;

import com.ufape.jachei.facade.Facade;
import com.ufape.jachei.models.PrestadorServico;
import com.ufape.jachei.models.Usuario;
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

        facede.savePrestadorServicos(updatePrestador);
        return "Alterado...";

    }

    @DeleteMapping ( value = "/remover-prestador-servicos/{id}")
    public void deleteByIdPrestadorServicos( @PathVariable Long id ){
        facede.deleteByIdPrestadorServicos(id);
    }

    @DeleteMapping ( value = "/remover-prestador-servicos/{id}")
    public void deletePrestadorServicos( PrestadorServico entity ){
        facede.deletePrestadorServicos(entity);
    }
}
