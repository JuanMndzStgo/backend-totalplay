package com.totalplay.util;

import org.springframework.stereotype.Component;

@Component
public class NormalizadorTextoUtil {

    public String normalizar(String texto) {
        if (texto == null) return null;
        String normalizado = texto.toUpperCase()
                .replaceAll("[Ñ]", "N")
                .replaceAll("[Á]", "A")
                .replaceAll("[É]", "E")
                .replaceAll("[Í]", "I")
                .replaceAll("[Ó]", "O")
                .replaceAll("[ÚÜ]", "U")
                .replaceAll("[^A-Z ]", "")
                .replaceAll("\\s{2,}", " ")
                .trim();
        return normalizado;
    }
}
