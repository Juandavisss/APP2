
package com.mycompany.juego_2_eso;


public class Personaje {
    private String nombre;
    private int salud;
    private Arma arma;

    public Personaje(String nombre, int salud, Arma arma) {
        this.nombre = nombre;
        this.salud = salud;
        this.arma = arma;
    }

    // Métodos para obtener y modificar la salud del personaje
    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    // Método para recibir daño
    public void recibirDanio(int danio) {
        salud -= danio;
    }

    // Método para realizar un ataque
    public int atacar() {
        return arma.generarDanio();
    }

    // Método para obtener el nombre del personaje
    public String getNombre() {
        return nombre;
    }

    // Método para obtener el arma del personaje
    public Arma getArma() {
        return arma;
    }
}
