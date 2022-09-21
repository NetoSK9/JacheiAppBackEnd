package com.ufape.jachei.controllers;

import com.ufape.jachei.facade.Facade;
import com.ufape.jachei.models.PrestadorServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping(value =  "/jachei")
@RestController
public class PrestadorServicosController {
    @Autowired
    private Facade facede;

    @PostMapping(value = "/salvar-prestador-servicos")
    public PrestadorServico createPrestadorServico(@RequestBody PrestadorServico prestadorServico) {
        return facede.savePrestadorServicos(prestadorServico);
    }

    @GetMapping(value = "/prestadores")
    public List<PrestadorServico> getAllPrestadorServico() {
        return facede.findAllPrestadorServicos();
    }

}
