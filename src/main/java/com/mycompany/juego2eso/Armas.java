
package com.mycompany.juego2eso;

import java.util.Random;

public class Armas {
    
   private String nombre;
   private int danio;
   private int velocidadAtaque;
   private int precision;
   private String rareza;
   private int critico;
   //private float modificador; para modfificar los parametros danio la velocidad de ataque y la precision 

    public Armas(String nombre, int daño, int velocidadAtaque, int precision, String rareza, int modificador) {
        this.nombre = nombre;
        this.danio = danio;
        this.velocidadAtaque = velocidadAtaque;
        this.precision = precision;
        this.rareza = rareza;
        this.critico= critico;
        //this.modificador = modificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDanio() {
        return danio;
    }

    public void setDanio(int danio) {
        this.danio = danio;
    }

    public int getVelocidadAtaque() {
        return velocidadAtaque;
    }

    public void setVelocidadAtaque(int velocidadAtaque) {
        this.velocidadAtaque = velocidadAtaque;
    }

    public int getPrecision() {
        return precision;
    }

    public void setPrecision(int precision) {
        this.precision = precision;
    }

    public String getRareza() {
        return rareza;
    }

    public void setRareza(String rareza) {
        this.rareza = rareza;
    }

    public int getCritico() {
        return critico;
    }

    public void setCritico(int critico) {
        this.critico = critico;
    }
    
    @Override
    public String toString() {
        return "Has elejido el arma{" + "llamada=" + nombre + ", con un danio=" + danio + ", velocidadAtaque=" + velocidadAtaque + ", precision=" + precision + ", rareza=" + rareza + '}';
    }
    
}
