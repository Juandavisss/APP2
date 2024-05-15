
package com.mycompany.juego2eso;
import java.util.Random;

public class operacionesMatematicas {
    private String enunciado;
    private double respuesta;

    public operacionesMatematicas(String enunciado, double respuesta) {
        this.enunciado = enunciado;
        this.respuesta = respuesta;
    }

    // Método para generar un problema de fracciones aleatorio
    public static operacionesMatematicas generarProblemaFraccion() {
        Random rand = new Random();
        int operacion = rand.nextInt(4); // 0: suma, 1: resta, 2: multiplicación, 3: división

        // Generar los números aleatorios
        int numerador1 = rand.nextInt(10) + 1; // Numerador entre 1 y 10
        int denominador1 = rand.nextInt(10) + 1; // Denominador entre 1 y 10
        int numerador2 = rand.nextInt(10) + 1;
        int denominador2 = rand.nextInt(10) + 1;

        String enunciado = "";
        double respuesta = 0.0;

        switch (operacion) {
            case 0: // Suma
                enunciado = String.format("Resuelve el siguiente problema matemático: ¿Cuánto es %d/%d + %d/%d?", numerador1, denominador1, numerador2, denominador2);
                respuesta = (double) (numerador1 * denominador2 + numerador2 * denominador1) / (denominador1 * denominador2);
                break;
            case 1: // Resta
                enunciado = String.format("Resuelve el siguiente problema matemático: ¿Cuánto es %d/%d - %d/%d?", numerador1, denominador1, numerador2, denominador2);
                respuesta = (double) (numerador1 * denominador2 - numerador2 * denominador1) / (denominador1 * denominador2);
                break;
            case 2: // Multiplicación
                enunciado = String.format("Resuelve el siguiente problema matemático: ¿Cuánto es %d/%d * %d/%d?", numerador1, denominador1, numerador2, denominador2);
                respuesta = (double) (numerador1 * numerador2) / (denominador1 * denominador2);
                break;
            case 3: // División
                enunciado = String.format("Resuelve el siguiente problema matemático: ¿Cuánto es %d/%d / %d/%d?", numerador1, denominador1, numerador2, denominador2);
                respuesta = (double) (numerador1 * denominador2) / (denominador1 * numerador2);
                break;
        }

        return new operacionesMatematicas(enunciado, respuesta);
    }

    // Método para generar un problema de ecuaciones básicas aleatorio
    public static operacionesMatematicas generarProblemaEcuacion() {
        Random rand = new Random();
        int operacion = rand.nextInt(4); // 0: suma, 1: resta, 2: multiplicación, 3: división

        // Generar los números aleatorios
        int numero1 = rand.nextInt(100) + 1; // Número entre 1 y 100
        int numero2 = rand.nextInt(100) + 1; // Número entre 1 y 100

        String enunciado = "";
        double respuesta = 0.0;

        switch (operacion) {
            case 0: // Suma
                enunciado = String.format("Resuelve el siguiente problema matemático: ¿Cuánto es %d + %d?", numero1, numero2);
                respuesta = numero1 + numero2;
                break;
            case 1: // Resta
                enunciado = String.format("Resuelve el siguiente problema matemático: ¿Cuánto es %d - %d?", numero1, numero2);
                respuesta = numero1 - numero2;
                break;
            case 2: // Multiplicación
                enunciado = String.format("Resuelve el siguiente problema matemático: ¿Cuánto es %d * %d?", numero1, numero2);
                respuesta = numero1 * numero2;
                break;
            case 3: // División
                enunciado = String.format("Resuelve el siguiente problema matemático: ¿Cuánto es %d / %d?", numero1, numero2);
                respuesta = (double) numero1 / numero2;
                break;
        }

        return new operacionesMatematicas(enunciado, respuesta);
    }

    // Método para generar un problema de potencias básicas aleatorio
    public static operacionesMatematicas generarProblemaPotencia() {
        Random rand = new Random();
        int operacion = rand.nextInt(4); // 0: suma, 1: resta, 2: multiplicación, 3: división

        // Generar los números aleatorios
        int base1 = rand.nextInt(10) + 1; // Base entre 1 y 10
        int exponente1 = rand.nextInt(5) + 1; // Exponente entre 1 y 5
        int base2 = rand.nextInt(10) + 1;
        int exponente2 = rand.nextInt(5) + 1;

        String enunciado = "";
        double respuesta = 0.0;

        switch (operacion) {
            case 0: // Suma
                enunciado = String.format("Resuelve el siguiente problema matemático: ¿Cuánto es %d^%d + %d^%d?", base1, exponente1, base2, exponente2);
                respuesta = Math.pow(base1, exponente1) + Math.pow(base2, exponente2);
                break;
            case 1: // Resta
                enunciado = String.format("Resuelve el siguiente problema matemático: ¿Cuánto es %d^%d - %d^%d?", base1, exponente1, base2, exponente2);
                respuesta = Math.pow(base1, exponente1) - Math.pow(base2, exponente2);
                break;
            case 2: // Multiplicación
                enunciado = String.format("Resuelve el siguiente problema matemático: ¿Cuánto es %d^%d * %d^%d?", base1, exponente1, base2, exponente2);
                respuesta = Math.pow(base1, exponente1) * Math.pow(base2, exponente2);
                break;
            case 3: // División
                enunciado = String.format("Resuelve el siguiente problema matemático: ¿Cuánto es %d^%d / %d^%d?", base1, exponente1, base2, exponente2);
                respuesta = Math.pow(base1, exponente1) / Math.pow(base2, exponente2);
                break;
        }

        return new operacionesMatematicas(enunciado, respuesta);
    }

    // Método para generar un problema de radicales básicos aleatorio
    public static operacionesMatematicas generarProblemaRadical() {
        Random rand = new Random();
        int operacion = rand.nextInt(4); // 0: suma, 1: resta, 2: multiplicación, 3: división

        // Generar los números aleatorios
        int radicando1 = rand.nextInt(100) + 1; // Radicando entre 1 y 100
        int radicando2 = rand.nextInt(100) + 1;

        String enunciado = "";
        double respuesta = 0.0;

        switch (operacion) {
            case 0: // Suma
                enunciado = String.format("Resuelve el siguiente problema matemático: ¿Cuánto es √%d + √%d?", radicando1, radicando2);
                respuesta = Math.sqrt(radicando1) + Math.sqrt(radicando2);
                break;
            case 1: // Resta
                enunciado = String.format("Resuelve el siguiente problema matemático: ¿Cuánto es √%d - √%d?", radicando1, radicando2);
                respuesta = Math.sqrt(radicando1) - Math.sqrt(radicando2);
                break;
            case 2: // Multiplicación
                enunciado = String.format("Resuelve el siguiente problema matemático: ¿Cuánto es √%d * √%d?", radicando1, radicando2);
                respuesta = Math.sqrt(radicando1) * Math.sqrt(radicando2);
                break;
            case 3: // División
                enunciado = String.format("Resuelve el siguiente problema matemático: ¿Cuánto es √%d / √%d?", radicando1, radicando2);
                respuesta = Math.sqrt(radicando1) / Math.sqrt(radicando2);
                break;
        }

        return new operacionesMatematicas(enunciado, respuesta);
    }

    // Método para comprobar si la respuesta dada es correcta
    public boolean comprobarRespuesta(double respuestaUsuario) {
        // Comparar la respuesta del usuario con la respuesta correcta
        return Math.abs(respuestaUsuario - respuesta) < 0.001; // Comparación con un margen de error
    }
    public double getRespuesta() {
    return respuesta;
}

    // Método para obtener el enunciado del problema
    public String getEnunciado() {
        return enunciado;
    }

    public static void main(String[] args) {
        operacionesMatematicas problemaFraccion = generarProblemaFraccion();
        System.out.println(problemaFraccion.getEnunciado());
        System.out.println("Respuesta correcta: " + problemaFraccion.respuesta);

        operacionesMatematicas problemaEcuacion = generarProblemaEcuacion();
        System.out.println(problemaEcuacion.getEnunciado());
        System.out.println("Respuesta correcta: " + problemaEcuacion.respuesta);

        operacionesMatematicas problemaPotencia = generarProblemaPotencia();
        System.out.println(problemaPotencia.getEnunciado());
        System.out.println("Respuesta correcta: " + problemaPotencia.respuesta);

        operacionesMatematicas problemaRadical = generarProblemaRadical();
        System.out.println(problemaRadical.getEnunciado());
        System.out.println("Respuesta correcta: " + problemaRadical.respuesta);
    }
}