/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.juego2eso;

/**
 *
 * @author mario
 */
public class ataquesJugador {
    private String nombre;
    private int danio;
    private double precision;
    private int puntosCarga;
    private int maxPuntosCarga;
    
    public ataquesJugador(String nombre, int danio, double precision, int maxPuntosCarga) {
        this.nombre = nombre;
        this.danio = danio;
        this.precision = precision;
        this.maxPuntosCarga = maxPuntosCarga;
        this.puntosCarga = 0;
    }
    
    public String getNombre() {
        return nombre;
    }

    public int getDanio() {
        return danio;
    }

    public double getPrecision() {
        return precision;
    }
    
    public int getPuntosCarga() {
        return puntosCarga;
    }

    public int getMaxPuntosCarga() {
        return maxPuntosCarga;
    }
    
    // Realizar ataque ligero
    public int ataqueLigero() {
        puntosCarga += 2;
        return danio;
    }

    // Realizar ataque pesado
    public int ataquePesado() {
        puntosCarga += 3;
        return danio;
    }

    // Realizar ataque definitivo si hay suficientes puntos de carga
    public int ataqueDefinitivo() {
        if (puntosCarga >= maxPuntosCarga) {
            puntosCarga = 0; // Reiniciar puntos de carga
            return danio * 2; // Doble daño para ataque definitivo
        } else {
            System.out.println("No tienes suficientes puntos de carga para el ataque definitivo.");
            return 0;
        }
    }
}
