/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.juego2eso;

import ficheros.*;
import config.Conexion;
import java.sql.*;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.xml.parsers.ParserConfigurationException;

/**
 *
 * @author dam126
 */
public class PanelPrincipalApp extends javax.swing.JFrame {

    /**
     * 
     * Creates new form PanelPrincipalApp
     */
    public static Cronometro crono = new Cronometro();
    private static Ranking rank = new Ranking();
    private Ranking RApp = new Ranking();
    private Registro r = new Registro();
    public static String alias ;
    private String level;
    private int acu = 0,xMouse,yMouse,acuact = 0;
    private int x1, x2;
    
    Conexion con1=new Conexion ();
    Connection conet;
    Statement st;
    ResultSet rs;
    
    
    public PanelPrincipalApp() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    /**
     * 
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BG = new javax.swing.JPanel();
        jButtonVerUsuarios = new javax.swing.JButton();
        jPanelExit = new javax.swing.JPanel();
        jLabelExit = new javax.swing.JLabel();
        jPanelMove = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldAliasSesion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPasswordFieldContrasenaSesion = new javax.swing.JPasswordField();
        BTVerPuntos = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        BTRegistrarse = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        BTAceptar = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio de Sesión");
        setUndecorated(true);

        BG.setBackground(new java.awt.Color(235, 255, 150));
        BG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonVerUsuarios.setMnemonic('V');
        jButtonVerUsuarios.setText("Ver usuarios");
        jButtonVerUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerUsuariosActionPerformed(evt);
            }
        });
        BG.add(jButtonVerUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, -1, -1));

        jPanelExit.setBackground(new java.awt.Color(255, 255, 255));
        jPanelExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelExitMouseEntered(evt);
            }
        });

        jLabelExit.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelExit.setText("X");
        jLabelExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelExitMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanelExitLayout = new javax.swing.GroupLayout(jPanelExit);
        jPanelExit.setLayout(jPanelExitLayout);
        jPanelExitLayout.setHorizontalGroup(
            jPanelExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelExitLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelExit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelExitLayout.setVerticalGroup(
            jPanelExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelExitLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelExit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        BG.add(jPanelExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 40));

        jPanelMove.setBackground(new java.awt.Color(235, 255, 149));
        jPanelMove.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanelMoveMouseDragged(evt);
            }
        });
        jPanelMove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelMoveMousePressed(evt);
            }
        });
        jPanelMove.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                jPanelMoveComponentMoved(evt);
            }
        });

        javax.swing.GroupLayout jPanelMoveLayout = new javax.swing.GroupLayout(jPanelMove);
        jPanelMove.setLayout(jPanelMoveLayout);
        jPanelMoveLayout.setHorizontalGroup(
            jPanelMoveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );
        jPanelMoveLayout.setVerticalGroup(
            jPanelMoveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        BG.add(jPanelMove, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 410, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Inicio Sesión");
        BG.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, -1, 38));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Alias:");
        BG.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        jTextFieldAliasSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAliasSesionActionPerformed(evt);
            }
        });
        BG.add(jTextFieldAliasSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 110, 290, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Contraseña:");
        BG.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jPasswordFieldContrasenaSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldContrasenaSesionActionPerformed(evt);
            }
        });
        BG.add(jPasswordFieldContrasenaSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 140, 290, -1));

        BTVerPuntos.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Ver Puntos");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout BTVerPuntosLayout = new javax.swing.GroupLayout(BTVerPuntos);
        BTVerPuntos.setLayout(BTVerPuntosLayout);
        BTVerPuntosLayout.setHorizontalGroup(
            BTVerPuntosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );
        BTVerPuntosLayout.setVerticalGroup(
            BTVerPuntosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
        );

        BG.add(BTVerPuntos, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 90, 20));

        BTRegistrarse.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Registrarse");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout BTRegistrarseLayout = new javax.swing.GroupLayout(BTRegistrarse);
        BTRegistrarse.setLayout(BTRegistrarseLayout);
        BTRegistrarseLayout.setHorizontalGroup(
            BTRegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );
        BTRegistrarseLayout.setVerticalGroup(
            BTRegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
        );

        BG.add(BTRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 90, 20));

        BTAceptar.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Aceptar");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout BTAceptarLayout = new javax.swing.GroupLayout(BTAceptar);
        BTAceptar.setLayout(BTAceptarLayout);
        BTAceptarLayout.setHorizontalGroup(
            BTAceptarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );
        BTAceptarLayout.setVerticalGroup(
            BTAceptarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
        );

        BG.add(BTAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 90, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BG, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldAliasSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAliasSesionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAliasSesionActionPerformed

    private boolean validarInicio(){
        alias = jTextFieldAliasSesion.getText();
        String contrasena = jPasswordFieldContrasenaSesion.getText();
        
        if(alias == null || contrasena == null ||"".equals(alias) ||
                "".equals(contrasena)){ 
            JOptionPane.showMessageDialog(this, "El campo no puede estar vacio", "Error",JOptionPane.ERROR_MESSAGE);
            return false;
        }else{
            return true;
        }
    }
    
    public boolean validarNumeros(String entrada){
        return entrada.matches("[0-9]*");
    }
    
    public void xml(String nomb, String contarss) throws Exception{
        GenerarDom generar = new GenerarDom();
        generar.setFilePathToDesktop();
        
        generar.generarDocument(nomb, contarss);
        generar.generarXml();
        
    }
    
    private void jPasswordFieldContrasenaSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldContrasenaSesionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldContrasenaSesionActionPerformed

    private void jLabelExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabelExitMouseClicked

    private void jLabelExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelExitMouseEntered
        jPanelExit.setBackground(Color.red);
        jLabelExit.setForeground(Color.white);
    }//GEN-LAST:event_jLabelExitMouseEntered

    private void jLabelExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelExitMouseExited
        jPanelExit.setBackground(Color.white);
        jLabelExit.setForeground(Color.black);
    }//GEN-LAST:event_jLabelExitMouseExited

    private void jPanelExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelExitMouseEntered
        jPanelExit.setBackground(Color.red);
    }//GEN-LAST:event_jPanelExitMouseEntered

    private void jPanelMoveMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelMoveMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jPanelMoveMouseDragged

    private void jPanelMoveMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelMoveMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanelMoveMousePressed

    private void jPanelMoveComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanelMoveComponentMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanelMoveComponentMoved

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
                                             
        try {
            
           // int nivel = jComboBoxNivel.getSelectedIndex();
            //System.out.println(nivel);
            alias  = jTextFieldAliasSesion.getText();
            //level = jComboBoxNivel.getSelectedItem()+"";
            String contrasena = jPasswordFieldContrasenaSesion.getText();
            
            
            /**
            * xml
            * 
            * xml(alias, level);
            * RApp.aplicarNoPu(alias, ""+rank.getPuntos());
            */
            
            
            /**
            * base de datos inicio de sesion
            */
            
            //creamos una consulta para el alias y la contraseña
            String query ="SELECT * FROM usuario WHERE alias= '"+alias+"'and contrasenia='"+contrasena+"'";
            System.out.println(query);     //muestra en pantalla la consulta
            conet=Conexion.getConexion();   //obtenemos la conexion
            st=conet.createStatement();     //el Statement nos permite ejecutar el comando
            rs=st.executeQuery(query);     //ResultSet nos sirve para guardar el resultado d ela ajecucion del comando
            
            
            if(rs.next()){
                //en la bbdd, la consulta nos devolveria el resultado del select
                //si ejcuta la consulta entonces abrimos el nivel que haya seleccionado el usuario
                if(validarInicio()){
                    setVisible(false);   //Oculta la ventana actual
                    crono.setVisible(true);    //Hace visible el cronometro
                    crono.getTiempo().start();    //inicia el temporizador
                    
                    
                    // Crear un objeto de arma para el jugador
                    //Armas armaJugador = new Armas("Espada", 20, 80, 90, "Común", 5);

                    // Crear una instancia de jugador y pasarle el objeto de arma creado
                    //Jugador jugador = new Jugador("NombreJugador", 100, 100, armaJugador);

                    // Crear una instancia de enemigo
                    //Enemigos enemigo = new Enemigos("Orco", 100, 100, 80, 10);

                    // Crear una instancia de la interfaz del juego
                    GameGUI gameGUI = new GameGUI();
                    gameGUI.setVisible(true);
                    //JuegoGUI juegoGUI = new JuegoGUI();
                    //juegoGUI.setVisible(true);
                    // Crear una instancia de la clase de turnos
                    //Turnos turnos = new Turnos(jugador, enemigo);

                    // Comenzar el juego
                    //turnos.comenzar();
                }
            }else{
                //si no existe nos devolveria Empty
                JOptionPane.showMessageDialog(this, "El usuario o la contraseña son incorrectos");
            }
            
            
        } catch (Exception ex) {
            System.out.println("no se pudo iniciar sesion");
        }
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        setVisible(false);
        r.setVisible(true);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        setVisible(false);
        //RApp.aplicarNoPu(getNombres(), rank.getPuntos()+"");
        //RApp.setVisible(true);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jButtonVerUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerUsuariosActionPerformed
        escribirUsutxt();
    }//GEN-LAST:event_jButtonVerUsuariosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws Exception{
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelPrincipalApp().setVisible(true);
                // TODO code application logic here
        
                
            }
        });
    }
    
    
    void escribirUsutxt(){
        ArrayList <Usuario> usuarios=new ArrayList<> ();
        String sql ="select * from usuario";
        try{
            conet=Conexion.getConexion();
            st=conet.createStatement();
            rs=st.executeQuery(sql);
            
            //leo la fila de la bbdd , creo objeto y lo añado al arraylist
            while (rs.next()){
                Usuario usu=new Usuario (rs.getString("alias"),rs.getString("nombre"),rs.getString("email"),Integer.parseInt(rs.getString("edad")));
                usuarios.add(usu);      
             
            }
           //escribo usuarios en el txt
            for (Usuario us: usuarios){
               Objetos.escribirArchivoObjetos("ArchivoUsuarios", us); 
            }
            
            
            //comprobamos que fubciona, leemos el archivo creado y le escribimos en pantalla
            
            List recuperada=Objetos.leerArchivoObjetos("ArchivoUsuarios");
         
         for (Object objeto: recuperada){
             Usuario proyec=(Usuario)objeto;
             System.out.println(proyec);
         }
            
        }catch(Exception e){
            
        }
    }  
    public Cronometro getCrono() {
        return crono;
    }

    

    public Registro getR() {
        return r;
    }
    /*
    public void aplicarPoints(int pun){
        rank.setPuntos(pun);
    }
    
    public void mostrarPoints(){
        System.out.println(rank.getPuntos());
    }
    */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG;
    private javax.swing.JPanel BTAceptar;
    private javax.swing.JPanel BTRegistrarse;
    private javax.swing.JPanel BTVerPuntos;
    private javax.swing.JButton jButtonVerUsuarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelExit;
    private javax.swing.JPanel jPanelExit;
    private javax.swing.JPanel jPanelMove;
    private javax.swing.JPasswordField jPasswordFieldContrasenaSesion;
    private javax.swing.JTextField jTextFieldAliasSesion;
    // End of variables declaration//GEN-END:variables
}
