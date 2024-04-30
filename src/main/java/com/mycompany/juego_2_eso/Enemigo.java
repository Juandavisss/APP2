
package com.mycompany.juego_2_eso;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Enemigo {
    private String nombre;
    private int salud;
    private List<ProblemaMatematico> ataques;

    public Enemigo(String nombre, int salud) {
        this.nombre = nombre;
        this.salud = salud;
        this.ataques = new ArrayList<>();
    }

    // Método para añadir un ataque al enemigo
    public void addAtaque(ProblemaMatematico ataque) {
        ataques.add(ataque);
    }

    // Método para seleccionar un ataque aleatorio del enemigo
    public ProblemaMatematico seleccionarAtaque() {
        Random rand = new Random();
        int indiceAtaque = rand.nextInt(ataques.size());
        return ataques.get(indiceAtaque);
    }

    // Método para recibir daño del jugador
    public void recibirDanio(int danio) {
        salud -= danio;
    }

    // Método para obtener el nombre del enemigo
    public String getNombre() {
        return nombre;
    }

    // Método para obtener la salud del enemigo
    public int getSalud() {
        return salud;
    }
}
