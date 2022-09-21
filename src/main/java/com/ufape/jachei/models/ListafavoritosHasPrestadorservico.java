package com.ufape.jachei.models;

import javax.persistence.*;

@Entity
@Table(name = "listafavoritos_has_prestadorservicos")
public class ListafavoritosHasPrestadorservico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_prestadorServicos", nullable = false)
    private PrestadorServico idPrestadorservicos;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PrestadorServico getIdPrestadorservicos() {
        return idPrestadorservicos;
    }

    public void setIdPrestadorservicos(PrestadorServico idPrestadorservicos) {
        this.idPrestadorservicos = idPrestadorservicos;
    }

}