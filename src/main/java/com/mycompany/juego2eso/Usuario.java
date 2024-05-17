package com.mycompany.juego2eso;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author estela
 */
public class Usuario implements Serializable {
    protected String alias;
    protected String nombre;
    protected String email;
    protected int edad;
    protected int puntuacion;

    public Usuario(String alias, String nombre, String email, int edad) {
        this.alias = alias;
        this.nombre = nombre;
        this.email = email;
        this.edad = edad;
        //this.puntuacion=puntuacion;
    }

    @Override
    public String toString() {
        return "Usuario{" + "alias=" + alias + ", nombre=" + nombre + ", email=" + email + ", edad=" + edad + ", puntuacion= "+puntuacion+'}';
    }
    
    
    
    
    
}
