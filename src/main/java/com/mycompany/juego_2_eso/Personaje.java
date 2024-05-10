
package com.mycompany.juego_2_eso;


public class Personaje {
    private String nombre;
    private int salud;
    private int energia;
    private int evasion;
    private Arma armaEquipada;

    public Personaje(String nombre, int salud, int energia, Arma armaEquipada) {
        this.nombre = nombre;
        this.salud = salud;
        this.energia = energia;
        this.armaEquipada = armaEquipada;
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

    public int getEvasion() {
        return evasion;
    }

    public void setEvasion(int evasion) {
        this.evasion = evasion;
    }
    
    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public Arma getArmaEquipada() {
        return armaEquipada;
    }

    public void setArmaEquipada(Arma armaEquipada) {
        this.armaEquipada = armaEquipada;
    }
    
    //metodo para realizar un ataque
    public int atacar(){
        int danioAtaque = armaEquipada.getDanio();
        //randomeamos la precicion del ataque
        if(Math.random()*100 <= armaEquipada.getPrecision()){
            return danioAtaque;
        }else{
            return 0;
        }
    }
    
    //metodo para esquivar un ataque
    public boolean esquivar(){
        return (Math.random()* 100 <= evasion);
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
}
