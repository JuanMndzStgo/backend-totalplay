package com.totalplay.controller;

import com.totalplay.model.Libro;
import com.totalplay.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/libros")
public class LibroController {

    @Autowired
    private LibroService libroService;

    @GetMapping
    public List<Libro> getAll() {
        return libroService.getAll();
    }

    @PostMapping
    public Libro create(@RequestBody Libro libro) {
        return libroService.create(libro);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) {
        libroService.delete(id);
    }
}
