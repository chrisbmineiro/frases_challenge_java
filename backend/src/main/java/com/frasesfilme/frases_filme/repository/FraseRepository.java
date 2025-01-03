package com.frasesfilme.frases_filme.repository;

import com.frasesfilme.frases_filme.models.Frase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface FraseRepository extends JpaRepository<Frase, Long> {
    @Query("")
    Frase buscaFraseAleatoria();
}