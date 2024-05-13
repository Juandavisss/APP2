/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.juego_2_eso;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author dam124
 */
public class PreguntasTest_Esquive {
    private ArrayList<Preguntas> preguntas;
    private Random random;

    public PreguntasTest_Esquive(Preguntas [] preguntas, Random random) {
        this.preguntas = new ArrayList<>();
        this.random = random;
    }
    
        Preguntas p1 = new Preguntas("¿Cual es un elemento de una circunferencia?","Radio, Diametro, Circunferencia, Centro","Radio, Lado, Centro", "Lado, Perimetro");
        Preguntas p2= new Preguntas("¿Que es un triangulo acutangulo?", "Es aquel en el que sus tres ángulos interiores son menores que 90 grados", "Un triángulo acutángulo es aquel que tiene un ángulo recto y dos ángulos agudos", "Un triángulo acutángulo es el que tiene la mayor área posible para su perímetro");
        Preguntas p3 = new Preguntas("¿Como se calcula la hipotenusa?", "la hipotenusa (el lado opuesto al ángulo recto) es igual a la raíz cuadrada de la suma de los cuadrados de los otros dos lados (los catetos)", "La hipotenusa se calcula dividiendo la suma de los catetos por 2", "La hipotenusa siempre es el lado más largo del triángulo, independientemente de si es rectángulo o no");
        Preguntas p4 = new Preguntas("¿Cual es el area del rombo?", " (d1 * d2) / 2", "(d1 / 2) * (d2 / 2) / 2", "(base x altura) / 2");
        Preguntas p5 = new Preguntas(": En un triángulo con base de longitud 10 cm y área de 20 cm², ¿cuál es la altura del triángulo?", "4 cm", "5 cm", "3cm");
        Preguntas p6 = new Preguntas(" ¿Cuál es el resultado de la siguiente operación:(12 x 3) + (5 x 4)?", "56", "42", "64"); 
        Preguntas p7 = new Preguntas("¿Qué es un número primo?", "Un número primo es un número natural mayor que 1 que tiene exactamente dos divisores positivos: 1 y sí mismo.","Un número primo es cualquier número natural mayor que 1.", "Un número primo es un número divisible por 2."); 
        Preguntas p8 = new Preguntas("¿Cuál es la fórmula para calcular el área de un triángulo?","(base x altura) / 2","base x altura", " base + altura"  ); 
        Preguntas p9 = new Preguntas("¿Cuál es el resultado de la siguiente operación: 3 x (4+2) - 5?","15", "22","12" ); 
        Preguntas p10 = new Preguntas("¿Cuál es el resultado de la siguiente operación: 2^3 + 5 x 2 -4?","18","19", "14"); 
        Preguntas p11 = new Preguntas("¿Cuál es la relación entre los ángulos internos de un triángulo?"," La suma de los ángulos internos de un triángulo siempre es 180 grados.","La suma de los ángulos internos de un triángulo siempre es 90 grados.", "La suma de los ángulos internos de un triángulo siempre es 360 grados."); 
        Preguntas p12 = new Preguntas("¿Qué propiedad geométrica define a un cuadrado?","Un cuadrado es un polígono de cuatro lados iguales y cuatro ángulos agudos.","Un cuadrado es un polígono de cuatro lados iguales y cuatro ángulos agudos.","Un cuadrado es un polígono de cuatro lados desiguales y cuatro ángulos rectos." ); 
        Preguntas p13 = new Preguntas("¿Cuál es el resultado de la siguiente operación: 1/2 x 3/4?","3/8","5/8","1/6"); 
        Preguntas p14 = new Preguntas("¿Cuál es el perímetro de un rectángulo con longitud 8 cm y ancho 5 cm?","26 cm","40 cm","13 cm"); 
        Preguntas p15 = new Preguntas("¿Cuál es el resultado de la siguiente operación: 5/2 + 3/4","11/4","7/6","9/4"); 
        Preguntas p16 = new Preguntas("¿Cuál es el área de un círculo con radio 6 cm? (Usa 𝜋 ≈ 3.14)","113.04cm^2","36 cm^2","18 cm^2"); 
        Preguntas p17 = new Preguntas("¿Cuál es la solución de la siguiente ecuación lineal: 3x - 5 = 10","x = 5","x = 3"," x = -5 "); 
        Preguntas p18 = new Preguntas("¿Cuál es el resultado de la siguiente operación:" + Math.sqrt(25)+ Math.sqrt(16),"5+ 4 = 9","5","6"); 
        Preguntas p19 = new Preguntas("¿Cuánto es la raíz cuadrada de 36?","6", "4","8"); 
        Preguntas p20 = new Preguntas("¿Qué figura geométrica tiene cuatro lados iguales y cuatro ángulos rectos?","Cuadrado","Triangulo", "Circulo");
        Preguntas p21 = new Preguntas("¿Cuál es la suma de los ángulos internos de un cuadrilátero?","360 grados","180 grados","90 grados");
        Preguntas p22 = new Preguntas("¿Cuántos lados tiene un hexágono?","6","5","8");
        Preguntas p23 = new Preguntas("¿Cuál es el área de un cuadrado con lado de longitud 8 metros?","64 m^2","32 m^2","16 m^2");
        Preguntas p24 = new Preguntas("¿Cuántas aristas tiene un cubo?","12","6","8");
        Preguntas p25 = new Preguntas("¿Cuál es el resultado de (2^3)^2 ?","64","12","16");
        Preguntas p26 = new Preguntas("¿Cuál es el resultado de 3^4?","81","12","64");
        Preguntas p27 = new Preguntas("Si tienes un conjunto de datos con los siguientes valores: 10, 15, 20, 25, 30. ¿Cuál es la media aritmética de este conjunto?","20","25","15");
        Preguntas p28 = new Preguntas("En una empresa, los salarios mensuales de 8 empleados son: $1000, $1200, $1500, $1800, $2000, $2200, $2500, $3000. ¿Cuál es la mediana de estos salarios?","$1850","$1500","$2200" );
        Preguntas p29 = new Preguntas("Resuelve la ecuación 2x = 5 = 15","x = 5","x = 10","x = 3");
        Preguntas p30 = new Preguntas("Resuelve la ecuación 3(x - 4) = 15","x = 7","x = 5","x = 9");
        Preguntas p31 = new Preguntas("Resuelve la ecuación 2x^2 - 8x = 0","x = 0 o x = 4","x = 2","x = 1");
        Preguntas p32 = new Preguntas("¿Cual es el resultado de la siguiente operacion 3x(4+2)","15", "18", "20");
        Preguntas p33 = new Preguntas("¿Cuál es el resultado de la siguiente operación: 8×(3−1)?", "10", "12", "5");
        Preguntas p34 = new Preguntas("¿Cuál es el valor de 5^2 −3×4?","10","11","21");
        Preguntas p35 = new Preguntas("¿Cuál es el resultado de 7×(4−2)+3?","17","14","21");
        Preguntas p36 = new Preguntas("¿Cuál es el resultado de 1/2 + 3/4?","5/6","3/8","7/4");
        Preguntas p37 = new Preguntas("¿Cuál es el área de un cuadrado con lado de longitud 6 cm?","12 cm^2"," 18 cm^2","36 cm^2");
        Preguntas p38 = new Preguntas(" ¿Cuál es el valor de 2^3 * 3^2 ?","24","72","216");
        Preguntas p39 = new Preguntas("¿Cuál es el resultado de 5/8 24?","15","18","30");
        Preguntas p40 = new Preguntas("¿Cuántos grados tiene un ángulo recto?"," 90 grados","180 grados","360 grados");
        Preguntas p41 = new Preguntas("¿Cuál es el perímetro de un cuadrado con lado de longitud 9 cm?","18 cm","27 cm","36 cm");
        Preguntas p42 = new Preguntas("¿Cuál es el resultado de 2+2×3?","6","8","10");
        Preguntas p43 = new Preguntas(" ¿Cuál es el valor de 3^4?","27","64","81");
        Preguntas p44 = new Preguntas("¿Cuál es el resultado de 15÷5?","3","5","10");
        Preguntas p45 = new Preguntas("¿Cuál es el resultado de 3/5 10?","2","6","8");
        Preguntas p46 = new Preguntas("¿Cuál es el área de un triángulo con base de longitud 8 cm y altura de 5 cm?","20 cm^2","25 cm^2","40 cm^2");
        Preguntas p47 = new Preguntas("¿Cuál es el resultado de 4^2 − 3^2?","1","7","13");
        Preguntas p48 = new Preguntas("¿Cuál es el valor de 2/3 + 3/4?","5/6","1/7","3/7");
        Preguntas p49 = new Preguntas("¿Cuánto es 0.75 como fracción?","1/2","3/4","4/3");
        Preguntas p50 = new Preguntas("¿Cuál es el resultado de 12/3 −2?","2","6","8");
        Preguntas p51 = new Preguntas("¿Cuál es el área de un rectángulo con longitud de base 10 cm y altura de 6 cm?","60 cm","36 cm","16 cm");
        Preguntas p52 = new Preguntas("¿Cuál es el resultado de 6×(4+2)?","12","24","36");
        Preguntas p53 = new Preguntas("¿Cuál es el valor de 4^3?","12","64","81");

    public ArrayList<Preguntas> getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(ArrayList<Preguntas> preguntas) {
        this.preguntas = preguntas;
    }
    
    public void meterArray(){
        preguntas.add(p1);
    }
    
    // Método para obtener una pregunta aleatoria del test
    public Preguntas obtenerPreguntaAleatoria() {
        int indice = random.nextInt(preguntas.size());
        return preguntas.get(indice);
    }

    // Método para verificar si la respuesta a una pregunta es correcta
    public boolean verificarRespuesta(Preguntas pregunta, String respuesta){
         String respuestaCorrecta = pregunta.getRespuestaB();
        int indice = preguntas.indexOf(preguntas);
        if (indice != -1) {
            return respuesta.equalsIgnoreCase(respuestaCorrecta);
        }
        return false;
    }
}
