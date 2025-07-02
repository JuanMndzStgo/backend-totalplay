package com.totalplay.service;

import com.totalplay.model.Autor;
import com.totalplay.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class AutorService {

    @Autowired
    private AutorRepository autorRepository;

    public List<Autor> getAll() {
        return autorRepository.findAll();
    }

    public Autor create(Autor autor) {
        return autorRepository.save(autor);
    }

    public void delete(UUID id) {
        autorRepository.deleteById(id);
    }
}
