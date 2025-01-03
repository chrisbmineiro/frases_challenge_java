package com.frasesfilme.frases_filme.services;

import com.frasesfilme.frases_filme.dto.FraseDTO;
import com.frasesfilme.frases_filme.models.Frase;
import com.frasesfilme.frases_filme.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraseService {

    @Autowired
    private FraseRepository repository;

    public FraseDTO obterFraseAleatoria() {
        Frase frase = repository.buscaFraseAleatoria();
        return new FraseDTO(frase.getTitulo(), frase.getFrase(), frase.getPersonagem(), frase.getPoster());
    }
}
