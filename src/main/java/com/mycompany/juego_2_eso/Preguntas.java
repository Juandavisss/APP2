/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.juego_2_eso;

/**
 *
 * @author dam124
 */
public class Preguntas {
    String Pregunta;
    String RespuestaB;
    String RespuestaM;
    String RespuestaM2;

    public Preguntas(String Pregunta, String RespuestaB, String RespuestaM, String RespuestaM2) {
        this.Pregunta = Pregunta;
        this.RespuestaB = RespuestaB;
        this.RespuestaM = RespuestaM;
        this.RespuestaM2 = RespuestaM2;
    }

    public String getPregunta() {
        return Pregunta;
    }

    public void setPregunta(String Pregunta) {
        this.Pregunta = Pregunta;
    }

    public String getRespuestaB() {
        return RespuestaB;
    }

    public void setRespuestaB(String RespuestaB) {
        this.RespuestaB = RespuestaB;
    }

    public String getRespuestaM() {
        return RespuestaM;
    }

    public void setRespuestaM(String RespuestaM) {
        this.RespuestaM = RespuestaM;
    }

    public String getRespuestaM2() {
        return RespuestaM2;
    }

    public void setRespuestaM2(String RespuestaM2) {
        this.RespuestaM2 = RespuestaM2;
    }
    
    
}
