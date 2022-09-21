package com.ufape.jachei.controllers;

import com.ufape.jachei.facade.Facade;
import com.ufape.jachei.models.Usuario;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(value =  "/jachei")
@RestController
public class UsuarioController {
    @Autowired
    private Facade facade;

    @PostMapping(value = "/salvar-usuario")
    public String saveUsuario(@RequestBody Usuario entity) {
        facade.saveUsuario(entity);
        return "Salvo...";
    }

    @GetMapping( value = "/usuario/{id}" )
    public Usuario findUsuario(@PathVariable Long id) {
        return facade.findByIdUsuario(id);
    }

    @GetMapping( value = "/ver-todos-usuarios" )
    public List<Usuario> findAllUsuarios() {
        return facade.findAllUsuarios();
    }

    @PutMapping( value = "/alterar-usurario/{id}" )
    public String updateUser(@PathVariable Long id, @RequestBody @NotNull Usuario usuario ){
        Usuario updateUser = facade.findByIdUsuario(id);

        updateUser.setLinkFoto(usuario.getLinkFoto());
        updateUser.setNome(usuario.getNome());

        facade.saveUsuario(updateUser);

        return "Alterado...";
    };

    @DeleteMapping( value = "/remover-usuario/{id}")
    public void deleteByIdUsuario(@PathVariable Long id) {
        facade.deleteByIdUsuario(id);
    }

    @DeleteMapping( value = "/remover-usuario")
    public void deleteUsuario(Usuario entity) {
        facade.deleteUsuario(entity);
    }


}
