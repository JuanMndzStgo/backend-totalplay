package com.totalplay.util;

import org.springframework.stereotype.Component;

@Component
public class SoapClientHelper {
    public boolean validarIsbn(String isbn) {
        // Simulación: aquí iría el llamado real al WebServiceTemplate con JAXB
        return isbn != null && isbn.length() == 13;
    }
}
