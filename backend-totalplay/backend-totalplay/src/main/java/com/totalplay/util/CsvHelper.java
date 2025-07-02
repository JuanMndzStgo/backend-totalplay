package com.totalplay.util;

import com.totalplay.model.Libro;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

@Component
public class CsvHelper {

    public List<Libro> parseCsv(InputStream is) {
        List<Libro> libros = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] campos = line.split(",");
                if (campos.length >= 3) {
                    Libro libro = new Libro();
                    libro.setTitulo(campos[0].trim());
                    libro.setIsbn(campos[1].trim());
                    libro.setNumeroPaginas(Integer.parseInt(campos[2].trim()));
                    // Aquí deberías asociar el autor y obtener la portada en la lógica real
                    libros.add(libro);
                }
            }
        } catch (Exception e) {
            throw new RuntimeException("Error al procesar el CSV", e);
        }
        return libros;
    }
}
