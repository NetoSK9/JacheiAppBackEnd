package com.ufape.jachei.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "prestadorservicos")
public class PrestadorServico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_endereco", nullable = false)
    @JsonIgnoreProperties(value = {"applications", "hibernateLazyInitializer"})
    private Endereco idEndereco;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_contato", nullable = false)
    @JsonIgnoreProperties(value = {"applications", "hibernateLazyInitializer"})
    private Contato idContato;

    @Column(name = "aceitarAgendamento", nullable = false)
    private Byte aceitarAgendamento;

    @Column(name = "aceitarCartao", nullable = false)
    private Byte aceitarCartao;

    @Column(name = "aceitaPix", nullable = false)
    private Byte aceitaPix;

    @Column(name = "atende24H", nullable = false)
    private Byte atende24H;

    @Column(name = "fazDelivery", nullable = false)
    private Byte fazDelivery;

    @Column(name = "levaTraz", nullable = false)
    private Byte levaTraz;

    @Column(name = "atendeDomiciliar", nullable = false)
    private Byte atendeDomiciliar;

    @Column(name = "mostrarEndereco", nullable = false)
    private Byte mostrarEndereco;

    @Column(name = "nome", nullable = false, length = 100)
    private String nome;

    @Column(name = "fotoPerfil", length = 300)
    private String fotoPerfil;

    @Column(name = "cpf", nullable = false, length = 45)
    private String cpf;

    @Column(name = "senha", nullable = false, length = 45)
    private String senha;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Endereco getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(Endereco idEndereco) {
        this.idEndereco = idEndereco;
    }

    public Contato getIdContato() {
        return idContato;
    }

    public void setIdContato(Contato idContato) {
        this.idContato = idContato;
    }

    public Byte getAceitarAgendamento() {
        return aceitarAgendamento;
    }

    public void setAceitarAgendamento(Byte aceitarAgendamento) {
        this.aceitarAgendamento = aceitarAgendamento;
    }

    public Byte getAceitarCartao() {
        return aceitarCartao;
    }

    public void setAceitarCartao(Byte aceitarCartao) {
        this.aceitarCartao = aceitarCartao;
    }

    public Byte getAceitaPix() {
        return aceitaPix;
    }

    public void setAceitaPix(Byte aceitaPix) {
        this.aceitaPix = aceitaPix;
    }

    public Byte getAtende24H() {
        return atende24H;
    }

    public void setAtende24H(Byte atende24H) {
        this.atende24H = atende24H;
    }

    public Byte getFazDelivery() {
        return fazDelivery;
    }

    public void setFazDelivery(Byte fazDelivery) {
        this.fazDelivery = fazDelivery;
    }

    public Byte getLevaTraz() {
        return levaTraz;
    }

    public void setLevaTraz(Byte levaTraz) {
        this.levaTraz = levaTraz;
    }

    public Byte getAtendeDomiciliar() {
        return atendeDomiciliar;
    }

    public void setAtendeDomiciliar(Byte atendeDomiciliar) {
        this.atendeDomiciliar = atendeDomiciliar;
    }

    public Byte getMostrarEndereco() {
        return mostrarEndereco;
    }

    public void setMostrarEndereco(Byte mostrarEndereco) {
        this.mostrarEndereco = mostrarEndereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFotoPerfil() {
        return fotoPerfil;
    }

    public void setFotoPerfil(String fotoPerfil) {
        this.fotoPerfil = fotoPerfil;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}