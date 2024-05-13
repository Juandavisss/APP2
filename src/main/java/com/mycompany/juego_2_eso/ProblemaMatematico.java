
package com.mycompany.juego_2_eso;
import java.util.Random;

public class ProblemaMatematico {
    private String enunciado;
    private double respuesta;

    public ProblemaMatematico(String enunciado, double respuesta) {
        this.enunciado = enunciado;
        this.respuesta = respuesta;
    }

    // Método para generar un problema de fracciones aleatorio
    public static ProblemaMatematico generarProblemaFraccion() {
        Random rand = new Random();
        int numerador1 = rand.nextInt(10) + 1; // Numerador entre 1 y 10
        int denominador1 = rand.nextInt(10) + 1; // Denominador entre 1 y 10
        int numerador2 = rand.nextInt(10) + 1;
        int denominador2 = rand.nextInt(10) + 1;

        // Asegurarse de que el segundo número no sea cero
        while (numerador2 == 0 || denominador2 == 0) {
            numerador2 = rand.nextInt(10) + 1;
            denominador2 = rand.nextInt(10) + 1;
        }

        // Crear el enunciado del problema
        String enunciado = String.format("¿Cuánto es %d/%d + %d/%d?", numerador1, denominador1, numerador2, denominador2);

        // Calcular la respuesta
        double respuesta = (double) (numerador1 * denominador2 + numerador2 * denominador1) / (denominador1 * denominador2);

        return new ProblemaMatematico(enunciado, respuesta);
    }

    // Método para comprobar si la respuesta dada es correcta
    public boolean comprobarRespuesta(double respuestaUsuario) {
        // Comparar la respuesta del usuario con la respuesta correcta
        return Math.abs(respuestaUsuario - respuesta) < 0.001; // Comparación con un margen de error
    }

    // Método para obtener el enunciado del problema
    public String getEnunciado() {
        return enunciado;
    }
}