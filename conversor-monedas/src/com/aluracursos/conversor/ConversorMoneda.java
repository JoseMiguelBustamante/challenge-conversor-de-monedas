package com.aluracursos.conversor;

import com.google.gson.JsonObject;

public class ConversorMoneda {
    private final String API_KEY = "61038ef0500b49319b6b5600";
    private final String BASE_URL = "https://v6.exchangerate-api.com/v6/";
    private ConsultaAPI consultaAPI;
    
    public ConversorMoneda() {
        this.consultaAPI = new ConsultaAPI();
    }
    
    public double convertir(String monedaOrigen, String monedaDestino, double cantidad) {
        try {
            // Obtener tasas de cambio desde la API
            String url = BASE_URL + API_KEY + "/latest/" + monedaOrigen;
            JsonObject tasas = consultaAPI.obtenerTasas(url);
            
            if (tasas != null && tasas.has("conversion_rates")) {
                JsonObject conversionRates = tasas.getAsJsonObject("conversion_rates");
                
                if (conversionRates.has(monedaDestino)) {
                    double tasa = conversionRates.get(monedaDestino).getAsDouble();
                    return cantidad * tasa;
                } else {
                    System.out.println("Error: Moneda destino no encontrada");
                    return 0;
                }
            } else {
                System.out.println("Error: No se pudieron obtener las tasas de cambio");
                return 0;
            }
            
        } catch (Exception e) {
            System.out.println("Error en la conversión: " + e.getMessage());
            return 0;
        }
    }
}
