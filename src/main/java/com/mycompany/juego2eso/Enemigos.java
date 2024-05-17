/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.juego2eso;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Enemigos {
    
    private String nombre;
    private int salud;
    private int energia;
    private int danio;
    private int precision;
    

    public Enemigos (String nombre, int salud, int energia, int precicion, int danio) {
        this.nombre = nombre;
        this.salud = salud;
        this.energia = energia;
        this.precision = precicion;
        this.danio = danio;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getPrecision() {
        return precision;
    }

    public void setPrecision(int precision) {
        this.precision = precision;
    }
    
    public int getDanio() {
        return danio;
    }

    public void setDanio(int danio) {
        this.danio = danio;
    }
    
    //metodo para realizar un ataque
    //public int atacar(Enemigos e1){
        
        //int danioAtaque = getDanio();
        //randomeamos la precicion del ataque
        //if(Math.random()*100 <= e1.getPrecision()){
            //return danioAtaque;
        //}else{
            //return 0;
        //}
    //}
    public int atacar() {
    int danioAtaque = getDanio();
    // Aquí puedes hacer referencia al jugador directamente
    // y aplicar tu lógica de ataque.
    if (Math.random() * 100 <= precision) {
        // Aquí puedes acceder a los métodos del jugador
        // para infligir daño, etc.
        return danioAtaque;
    } else {
        return 0;
    }
}
    
    public boolean estaVivo() {
    return salud > 0;
}
    
    
    
    //metodo para esquivar un ataque
    public boolean esquivar(){
        return (Math.random()* 1000 <= precision);
    }
    
    public int recibirdanio(int danio){
        // Reducir la salud del personaje según el daño recibido
        salud -= danio;
        // Verificar si la salud del personaje es menor o igual a cero
        if (salud <= 0) {
            // Si la salud es menor o igual a cero, el personaje está muerto
            System.out.println(nombre + " ha sido derrotado.");
        }
        return danio; // Devolver el daño recibido
    }

    void recibirDanio(int danio) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
