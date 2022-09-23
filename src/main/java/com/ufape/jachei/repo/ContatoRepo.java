package com.ufape.jachei.repo;

import com.ufape.jachei.models.Contato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContatoRepo extends JpaRepository<Contato,Long> {
}
