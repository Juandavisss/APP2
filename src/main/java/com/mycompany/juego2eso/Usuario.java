package com.mycompany.juego2eso;

import java.io.Serializable;

/**
 *Clase que contiene las características de un usuario.
 * 
 * @author estela
 */
public class Usuario implements Serializable {
    private String alias;
    private String nombre;
    private  String email;
    private int edad;
    private String nif;
    private String contrasenia;
    private int puntuacion;
    
    public Usuario(String alias, String nombre, String email, int edad) {
        this.alias = alias;
        this.nombre = nombre;
        this.email = email;
        this.edad = edad;
    }

    public Usuario(String alias, String nombre, String email, int edad, String nif, String contrasenia) {
        this.alias = alias;
        this.nombre = nombre;
        this.email = email;
        this.edad = edad;
        this.nif =nif;
        this.contrasenia =contrasenia;
        //this.puntuacion=puntuacion;
    }

    public String getAlias() {
        return alias;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public int getEdad() {
        return edad;
    }

    public String getNif() {
        return nif;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    @Override
    public String toString() {
        return "Usuario{" + "alias=" + alias + ", nombre=" + nombre + ", email=" + email + ", edad=" + edad + ", nif=" + nif + ", contrasenia=" + contrasenia + ", puntuacion=" + puntuacion + '}';
    }
    


    
}
