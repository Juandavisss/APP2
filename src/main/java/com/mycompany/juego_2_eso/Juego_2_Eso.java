

package com.mycompany.juego_2_eso;

import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Juego_2_Eso {

   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         // Crear una instancia de la ventana del juego
        VentanaJuego ventanaJuego = new VentanaJuego();
        menu.setVisible(true);
        menu.setLocationRelativeTo(null);
        Caballero player = new Caballero();
        player.setVisible(true);
        Monstruo eemigo = new Monstruo();
        eemigo.setVisible(true);
        
        // Crear un personaje con su arma
        Arma espada = new Arma("Espada", 5, 100);
        Personaje jugador = new Personaje("Jugador", 10, espada);

        // Crear un enemigo con sus ataques
        Enemigo enemigo = new Enemigo("Enemigo", 100);
        enemigo.addAtaque(ProblemaMatematico.generarProblemaFraccion());

        // Combate por turnos
        while (jugador.getSalud() > 0 && enemigo.getSalud() > 0) {
            // Turno del jugador
            System.out.println("Turno del jugador:");
            ProblemaMatematico ataqueJugador = ProblemaMatematico.generarProblemaFraccion();
            System.out.println("Resuelve el problema matemático para realizar un ataque: " + ataqueJugador.getEnunciado());
            System.out.print("Respuesta: ");
            double respuestaJugador = scanner.nextDouble();
            if (ataqueJugador.comprobarRespuesta(respuestaJugador)) {
                int danioJugador = jugador.atacar();
                enemigo.recibirDanio(danioJugador);
                System.out.println("¡Has realizado un ataque exitoso! El enemigo ha recibido " + danioJugador + " de daño.");
            } else {
                System.out.println("¡Fallaste en resolver el problema matemático! No has podido realizar un ataque.");
            }

            // Turno del enemigo
            ProblemaMatematico ataqueEnemigo = enemigo.seleccionarAtaque();
            System.out.println("El enemigo lanza un ataque: " + ataqueEnemigo.getEnunciado());
            System.out.println("Por favor, resuelve el problema matemático para esquivar el ataque.");
            System.out.print("Respuesta: ");
            double respuestaEnemigo = scanner.nextDouble();
            if (!ataqueEnemigo.comprobarRespuesta(respuestaEnemigo)) {
                System.out.println("¡Fallaste en resolver el problema matemático! Has recibido daño.");
                int danioEnemigo = 10; // Puedes ajustar el daño según lo que desees
                jugador.recibirDanio(danioEnemigo);
            }

            // Mostrar la salud restante de ambos
            System.out.println("Salud del jugador: " + jugador.getSalud());
            System.out.println("Salud del enemigo: " + enemigo.getSalud());
        }

        // Determinar el resultado del combate
        if (jugador.getSalud() <= 0) {
            // Mostrar mensaje de derrota
            JOptionPane.showMessageDialog(null, "El jugador ha sido derrotado. ¡Game over!", "Derrota", JOptionPane.INFORMATION_MESSAGE);
        } else {
            // Mostrar mensaje de victoria
            JOptionPane.showMessageDialog(null, "El enemigo ha sido derrotado. ¡Felicidades, has ganado!", "Victoria", JOptionPane.INFORMATION_MESSAGE);
        }

        
    }
}


