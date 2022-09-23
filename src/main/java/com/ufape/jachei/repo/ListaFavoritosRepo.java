package com.ufape.jachei.repo;

import com.ufape.jachei.models.ListaFavoritos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ListaFavoritosRepo extends JpaRepository<ListaFavoritos,Long> {
}
