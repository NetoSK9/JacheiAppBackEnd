package com.ufape.jachei.servicos;


import com.ufape.jachei.models.Usuario;
import com.ufape.jachei.repo.UsuarioRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicosUsuario implements InterfaceServicosUsuario {

    @Autowired
    private UsuarioRepo repositorioUsuario;

    @Override
    public Usuario saveUsuario(Usuario entity) {

        return repositorioUsuario.save(entity);
    }



    @Override
    public Usuario findByIdUsuario(Long id) {
        Optional<Usuario> usuario = repositorioUsuario.findById(id);
        if(usuario.isPresent()){
            return usuario.get();
        }else{
            return null;
        }
    }

    @Override
    public List<Usuario> findAllUsuarios() {
        return repositorioUsuario.findAll();
    }

    @Override
    public void deleteByIdUsuario(Long id) {
        repositorioUsuario.deleteById(id);
    }

    @Override
    public void deleteUsuario(Usuario entity) {
        repositorioUsuario.delete(entity);
    }
}
