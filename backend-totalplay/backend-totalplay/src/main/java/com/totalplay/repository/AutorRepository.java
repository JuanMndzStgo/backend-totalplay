package com.totalplay.repository;

import com.totalplay.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface AutorRepository extends JpaRepository<Autor, UUID> {
}
