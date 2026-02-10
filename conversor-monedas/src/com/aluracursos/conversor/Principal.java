package com.aluracursos.conversor;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConversorMoneda conversor = new ConversorMoneda();
        int opcion = 0;

        System.out.println("*****************************************************");
        System.out.println("Bienvenido al Conversor de Monedas");
        System.out.println("*****************************************************\n");

        while (opcion != 7) {
            mostrarMenu();
            
            try {
                opcion = scanner.nextInt();
                
                if (opcion >= 1 && opcion <= 6) {
                    System.out.print("Ingrese el valor que desea convertir: ");
                    double valor = scanner.nextDouble();
                    
                    String resultado = procesarConversion(opcion, valor, conversor);
                    System.out.println("\n" + resultado);
                    System.out.println("*****************************************************\n");
                } else if (opcion == 7) {
                    System.out.println("¡Gracias por usar el Conversor de Monedas!");
                    System.out.println("¡Hasta pronto!");
                } else {
                    System.out.println("Opción inválida. Por favor intente nuevamente.\n");
                }
            } catch (Exception e) {
                System.out.println("Error: Por favor ingrese un número válido.\n");
                scanner.nextLine(); // Limpiar buffer
            }
        }
        
        scanner.close();
    }
    
    private static void mostrarMenu() {
        System.out.println("Seleccione una opción de conversión:");
        System.out.println("1) Dólar =>> Peso argentino");
        System.out.println("2) Peso argentino =>> Dólar");
        System.out.println("3) Dólar =>> Real brasileño");
        System.out.println("4) Real brasileño =>> Dólar");
        System.out.println("5) Dólar =>> Peso colombiano");
        System.out.println("6) Peso colombiano =>> Dólar");
        System.out.println("7) Salir");
        System.out.print("Elija una opción válida: ");
    }
    
    private static String procesarConversion(int opcion, double valor, ConversorMoneda conversor) {
        String monedaOrigen, monedaDestino;
        
        switch (opcion) {
            case 1:
                monedaOrigen = "USD";
                monedaDestino = "ARS";
                break;
            case 2:
                monedaOrigen = "ARS";
                monedaDestino = "USD";
                break;
            case 3:
                monedaOrigen = "USD";
                monedaDestino = "BRL";
                break;
            case 4:
                monedaOrigen = "BRL";
                monedaDestino = "USD";
                break;
            case 5:
                monedaOrigen = "USD";
                monedaDestino = "COP";
                break;
            case 6:
                monedaOrigen = "COP";
                monedaDestino = "USD";
                break;
            default:
                return "Opción inválida";
        }
        
        double resultado = conversor.convertir(monedaOrigen, monedaDestino, valor);
        return String.format("El valor %.2f [%s] corresponde al valor final de =>>> %.2f [%s]", 
                           valor, monedaOrigen, resultado, monedaDestino);
    }
}
