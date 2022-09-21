package com.ufape.jachei.models;

import javax.persistence.*;

@Entity
@Table(name = "prestadorservicos_has_servicos")
public class PrestadorservicosHasServico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_servicos", nullable = false)
    private Servico idServicos;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Servico getIdServicos() {
        return idServicos;
    }

    public void setIdServicos(Servico idServicos) {
        this.idServicos = idServicos;
    }

}