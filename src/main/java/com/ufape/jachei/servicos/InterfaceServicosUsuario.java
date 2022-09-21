package com.ufape.jachei.servicos;

import com.ufape.jachei.models.Usuario;

import java.util.List;
import java.util.Optional;

public interface InterfaceServicosUsuario {
    Usuario saveUsuario(Usuario entity);

    List<Usuario> findAllUsuarios();

    Usuario findByIdUsuario(Long id);

    void deleteByIdUsuario(Long id);

    void deleteUsuario(Usuario entity);
}
