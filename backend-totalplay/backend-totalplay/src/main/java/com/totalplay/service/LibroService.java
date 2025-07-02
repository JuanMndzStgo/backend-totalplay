package com.totalplay.service;

import com.totalplay.model.Libro;
import com.totalplay.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class LibroService {

    @Autowired
    private LibroRepository libroRepository;

    public List<Libro> getAll() {
        return libroRepository.findAll();
    }

    public Libro create(Libro libro) {
        return libroRepository.save(libro);
    }

    public void delete(UUID id) {
        libroRepository.deleteById(id);
    }
}
