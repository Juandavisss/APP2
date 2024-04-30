
package com.mycompany.juego_2_eso;

import java.util.Random;

public class Arma {
    private String nombre;
    private int danioMinimo;
    private int danioMaximo;

    public Arma(String nombre, int danioMinimo, int danioMaximo) {
        this.nombre = nombre;
        this.danioMinimo = danioMinimo;
        this.danioMaximo = danioMaximo;
    }

    // Método para generar un valor de daño aleatorio dentro del rango
    public int generarDanio() {
        Random rand = new Random();
        return rand.nextInt(danioMaximo - danioMinimo + 1) + danioMinimo;
    }

    // Método para obtener el nombre del arma
    public String getNombre() {
        return nombre;
    }
}