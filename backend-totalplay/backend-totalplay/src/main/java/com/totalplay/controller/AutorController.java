package com.totalplay.controller;

import com.totalplay.model.Autor;
import com.totalplay.service.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/autores")
public class AutorController {

    @Autowired
    private AutorService autorService;

    @GetMapping
    public List<Autor> getAll() {
        return autorService.getAll();
    }

    @PostMapping
    public Autor create(@RequestBody Autor autor) {
        return autorService.create(autor);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) {
        autorService.delete(id);
    }
}
