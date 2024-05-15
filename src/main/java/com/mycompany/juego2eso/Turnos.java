package com.mycompany.juego2eso;
import java.util.Random;
import java.util.Scanner;

public class Turnos {
    
    public Jugador jugador;
    public Enemigos enemigo;
    private int numeroDeTurno;
    private static final int TURNOS_PARA_ESQUIVAR = 3;
    private Random random;
    
    public Turnos(Jugador jugador, Enemigos enemigo) {
        this.jugador = jugador;
        this.enemigo = enemigo;
        this.numeroDeTurno = 0;
        this.random = new Random();
    }
    
    // Método para ejecutar el turno del enemigo
    public void ejecutarTurnoEnemigo() {
        // Lógica para que el enemigo ataque al jugador
        int danioEnemigo = enemigo.atacar();
        jugador.recibirDanio(danioEnemigo);
        System.out.println("El enemigo te ha infligido " + danioEnemigo + " puntos de daño.");
    }
    
    public void comenzar() {
        Scanner scanner = new Scanner(System.in);
        
        while (jugador.getSalud() > 0 && enemigo.getSalud() > 0) {
            numeroDeTurno++;
            System.out.println("Turno " + numeroDeTurno);
            
            // Turno del jugador
            System.out.println("Tu turno:");
            System.out.println("1. Ataque ligero");
            System.out.println("2. Ataque pesado");
            System.out.println("3. Ataque definitivo");
            System.out.print("Elige tu acción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character
            
            int danio = 0;
            operacionesMatematicas problema = null;
            
            switch (opcion) {
                case 1:
                    danio = jugador.ataqueLigero();
                    problema = operacionesMatematicas.generarProblemaEcuacion();
                    break;
                case 2:
                    danio = jugador.ataquePesado();
                    problema = operacionesMatematicas.generarProblemaFraccion();
                    break;
                case 3:
                    danio = jugador.ataqueDefinitivo();
                    if (danio > 0) {
                        problema = operacionesMatematicas.generarProblemaPotencia();
                    } else {
                        System.out.println("No tienes suficientes puntos de carga para realizar el ataque definitivo.");
                    }
                    break;
                default:
                    System.out.println("Opción no válida. Pierdes tu turno.");
                    problema = null;
            }
            
            if (problema != null) {
                System.out.println(problema.getEnunciado());
                System.out.print("Introduce tu respuesta: ");
                double respuestaUsuario = scanner.nextDouble();
                
                if (problema.comprobarRespuesta(respuestaUsuario)) {
                    enemigo.recibirDanio(danio);
                    System.out.println("Has infligido " + danio + " puntos de daño al enemigo.");
                } else {
                    System.out.println("Respuesta incorrecta. Tu ataque falló.");
                }
            }
            
            // Turno del enemigo
            ejecutarTurnoEnemigo();
            
            // Mostrar estado actual de los jugadores
            System.out.println("Tu salud: " + jugador.getSalud());
            System.out.println("Salud del enemigo: " + enemigo.getSalud());
        }
        //Resultado del combate
        if (jugador.getSalud() <= 0) {
            System.out.println("¡Has sido derrotado por el enemigo! Game Over.");
        } else {
            System.out.println("¡Has derrotado al enemigo! ¡Felicidades!");
        }
        
        scanner.close();
    }


}