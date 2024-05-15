
package com.mycompany.juego2eso;

import java.util.ArrayList;
import java.util.List;
public class Juego2Eso {

   
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Crear un objeto de arma para el jugador
        Armas armaJugador = new Armas("Espada", 20, 80, 90, "Común", 5);
        
        // Crear una instancia de jugador y pasarle el objeto de arma creado
        Jugador jugador = new Jugador("NombreJugador", 100, 100, armaJugador);
        
        // Crear una instancia de enemigo
        Enemigos enemigo = new Enemigos("Orco", 100, 100, 80, 25);
        
        // Crear una instancia de la interfaz del juego
        JuegoGUI juegoGUI = new JuegoGUI();
        juegoGUI.setVisible(true);
        // Crear una instancia de la clase de turnos
        Turnos turnos = new Turnos(jugador, enemigo);
        
        // Comenzar el juego
        turnos.comenzar();
    }
    
}
