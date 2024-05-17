
package com.mycompany.juego2eso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Clase para representar a un usuario
class Usuario {
    private String nombre;
    private int puntuacion;

    public Usuario(String nombre, int puntuacion) {
        this.nombre = nombre;
        this.puntuacion = puntuacion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    @Override
    public String toString() {
        return nombre + " - Puntuación: " + puntuacion;
    }
}

// Clase para manejar el ranking de usuarios
public class Ranking {
    private List<Usuario> usuarios;

    public Ranking() {
        usuarios = new ArrayList<>();
    }

    // Método para agregar un usuario al ranking
    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    // Método para ordenar el ranking por puntuación
    public void ordenarPorPuntuacion() {
        Collections.sort(usuarios, new Comparator<Usuario>() {
            @Override
            public int compare(Usuario u1, Usuario u2) {
                return Integer.compare(u2.getPuntuacion(), u1.getPuntuacion());
            }
        });
    }

    // Método para mostrar el ranking
    public void mostrarRanking() {
        System.out.println("Ranking de Usuarios:");
        for (int i = 0; i < usuarios.size(); i++) {
            System.out.println((i + 1) + ". " + usuarios.get(i));
        }
    }

    // Método main para probar la clase
    public static void main(String[] args) {
        Ranking ranking = new Ranking();
        ranking.agregarUsuario(new Usuario("Usuario1", 100));
        ranking.agregarUsuario(new Usuario("Usuario2", 150));
        ranking.agregarUsuario(new Usuario("Usuario3", 80));

        ranking.ordenarPorPuntuacion();
        ranking.mostrarRanking();
    }
}