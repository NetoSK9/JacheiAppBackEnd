package com.ufape.jachei.repo;

import com.ufape.jachei.models.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepo extends JpaRepository<Categoria,Long> {
}
