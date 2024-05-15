
package com.mycompany.juego2eso;


public class Jugador {
    private String nombre;
    private int salud;
    private int energia;
    private int evasion;
    private Armas armaEquipada;
    private int puntosCarga; //Necesario para los puntos de carag de la ultimate
    public int cargaAtaqueDefinitivo;
    
    // Definir los ataques del jugador
    private ataquesJugador ataqueBasico;
    private ataquesJugador ataquePesado;
    private ataquesJugador ataqueDefinitivo;

    public Jugador (String nombre, int salud, int energia, Armas armaEquipada) {
        this.nombre = nombre;
        this.salud = salud;
        this.energia = energia;
        this.armaEquipada = armaEquipada;
        this.puntosCarga = 0; // Inicializamos los puntos de carga a 0
        
        // Crear instancias de los ataques del jugador
        ataqueBasico = new ataquesJugador("Ataque Básico", 10, 0.8, 0);
        ataquePesado = new ataquesJugador("Ataque Pesado", 20, 0.6, 0);
        ataqueDefinitivo = new ataquesJugador("Ataque Definitivo", 30, 1.0, 5);
        
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

    public Armas getArmaEquipada() {
        return armaEquipada;
    }

    public void setArmaEquipada(Armas armaEquipada) {
        this.armaEquipada = armaEquipada;
    }
    
    //metodo para realizar un ataque
    public int atacar(){
        int danioAtaque = armaEquipada.getDanio();
        //randomeamos la precicion del ataque
        if(Math.random()*100 <= armaEquipada.getPrecision()){
            //return danioAtaque;
        }else{
            return 0;
        }
        return 0;
    }
    
    public boolean estaVivo() {
    return salud > 0;
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
    
     // Realizar ataque ligero y actualizar puntos de carga
    public int ataqueLigero() {
        int danio = ataqueBasico.ataqueLigero();
        actualizarPuntosCarga();
        return danio;
    }

    // Realizar ataque pesado y actualizar puntos de carga
    public int ataquePesado() {
        int danio = ataquePesado.ataquePesado();
        actualizarPuntosCarga();
        return danio;
    }

    // Realizar ataque definitivo si es posible y actualizar puntos de carga
    public int ataqueDefinitivo() {
        int danio = ataqueDefinitivo.ataqueDefinitivo();
        actualizarPuntosCarga();
        return danio;
    }
    
    // Actualizar los puntos de carga al utilizar ataques
    private void actualizarPuntosCarga() {
        puntosCarga = Math.min(puntosCarga, ataqueDefinitivo.getMaxPuntosCarga());
    }
    
    public int getCargaAtaqueDefinitivo() {
    return cargaAtaqueDefinitivo; // Suponiendo que la carga del ataque definitivo está almacenada en una variable llamada cargaAtaqueDefinitivo
}

    void recibirDanio(int danioEnemigo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}

