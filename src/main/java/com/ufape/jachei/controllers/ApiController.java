package com.ufape.jachei.controllers;


import com.ufape.jachei.facade.Facade;
import com.ufape.jachei.models.PrestadorServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ApiController {
    @Autowired
    private Facade facede;

    @GetMapping(value ="/")
    public String getPage(){
        return "Welcome";
    }
    @GetMapping(value = "/prestadores")
    public List<PrestadorServico> getAllPrestadorServico() {
        return facede.findAllPrestadorServicos();
    }
}
