
package com.mycompany.juego2eso;


public class ataquesEnemigos {
     private String nombre;
    private int danio;
    private int cargamaxima;
    private int cargarestante;
    private int precision;

    public ataquesEnemigos(String nombre, int danio, int cargamaxima, int cargarestante, int precision) {
        this.nombre = nombre;
        this.danio = danio;
        this.cargamaxima = cargamaxima;
        this.cargarestante = cargarestante;
        this.precision = precision;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDanio() {
        return danio;
    }

    public void setDanio(int danio) {
        this.danio = danio;
    }

    public int getCargamaxima() {
        return cargamaxima;
    }

    public void setCargamaxima(int cargamaxima) {
        this.cargamaxima = cargamaxima;
    }

    public int getCargarestante() {
        return cargarestante;
    }

    public void setCargarestante(int cargarestante) {
        this.cargarestante = cargarestante;
    }

    public int getPrecision() {
        return precision;
    }

    public void setPrecision(int precision) {
        this.precision = precision;
    }
    
    public int ataque(){
        return danio;
    }
}
