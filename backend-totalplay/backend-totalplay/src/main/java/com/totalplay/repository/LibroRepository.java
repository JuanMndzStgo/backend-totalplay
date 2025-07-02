package com.totalplay.repository;

import com.totalplay.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface LibroRepository extends JpaRepository<Libro, UUID> {
}
