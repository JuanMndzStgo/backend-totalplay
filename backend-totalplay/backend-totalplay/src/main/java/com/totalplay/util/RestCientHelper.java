package com.totalplay.util;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class RestClientHelper {

    private final WebClient webClient = WebClient.create();

    public String obtenerPortada(String isbn) {
        // Simulación: deberías consumir realmente el API de OpenLibrary y extraer la URL
        return "https://covers.openlibrary.org/b/isbn/" + isbn + "-L.jpg";
    }
}
