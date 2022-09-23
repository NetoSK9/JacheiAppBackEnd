package com.ufape.jachei.servicos;

import com.ufape.jachei.models.Endereco;

import java.util.List;

public interface InterfaceServicosEndereco {
    Endereco saveEndereco(Endereco entity);

    Endereco findByIdEndereco(Long id);

    List<Endereco> findAllEnderecos();

    void deleteByIdEndereco(Long id);

    void deleteEndereco(Endereco entity);
}
