
package com.mycompany.juego2eso;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class GameGUI extends javax.swing.JFrame {
    
    private int playerHp = 100 ;
    private int enemyHp = 100;
    private int definitiveCharge = 0;
    private int turnCount = 0;
    
    
    private List<Enemigos> enemies = new ArrayList<>();

     
    public GameGUI() {
        System.out.println("asewgfaegdargraegagbtcom.mycompany.juego2eso.JuegoGUI.<init>()");
        initComponents();
        generateEnemy();
        
        // Establecer el valor inicial de la barra de progreso del jugador
    VidaJugador.setMinimum(0); // Valor mínimo de la barra de progreso
    VidaJugador.setMaximum(100); // Valor máximo de la barra de progreso
    VidaJugador.setValue(playerHp); // Establecer el valor inicial de la barra de progreso del jugador

    // Establecer el valor inicial de la barra de progreso del enemigo
    VidaEnemigo.setMinimum(0); // Valor mínimo de la barra de progreso
    VidaEnemigo.setMaximum(100); // Valor máximo de la barra de progreso
    VidaEnemigo.setValue(enemyHp); // Establecer el valor inicial de la barra de progreso del enemigo
    
        
        
        
        AtaqueBasico.setText("Ataque Básico");
        AtaqueBasico.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                ataqueBasico(evt);
            }
        });

        AtaquePesado.setText("Ataque Pesado");
        AtaquePesado.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                ataqueMedio(evt);
            }
        });

        AtaqueDefinitivo.setText("Ataque Definitivo");
        AtaqueDefinitivo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                ataqueDefinitivo(evt);
            }
        });

        Esquivar.setText("Esquivar");
        Esquivar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                esquivar(evt);
            }
        });
        
        
   
    }
    
    
     //private void checkWinLose() {
        //if (enemyHp <= 0) {
            //JOptionPane.showMessageDialog(this, "¡Has ganado!");
               //endGame();
            
        //} else if (playerHp <= 0) {
            //JOptionPane.showMessageDialog(this, "Has perdido.");
               //endGame();
            
        //}
    //}
     // Método para generar un nuevo enemigo
    private void generateEnemy() {
        String enemyName = "Monstruo1"; // Aquí asigna el nombre del enemigo
        Enemigos newEnemy = new Enemigos(enemyName, 500, 100, 100, 20);
        enemies.add(newEnemy);
        // Mostrar un mensaje de que ha aparecido un nuevo enemigo
        JOptionPane.showMessageDialog(this, "¡Ha aparecido un nuevo enemigo!");
    }
    
    // Método para eliminar un enemigo derrotado
    private void removeDefeatedEnemy(Enemigos defeatedEnemy) {
        enemies.remove(defeatedEnemy);
    }

    // Método para determinar si todos los enemigos han sido derrotados
    private boolean allEnemiesDefeated() {
        return enemies.isEmpty();
    }
     
    
    //JOptionPane.showMessageDialog(null, "¡Ha aparecido un nuevo enemigo!");

    
    private void enemyTurn() {
        playerHp -= 10; // Ataque del enemigo
        turnCount++;
        updateBars();
        //checkWinLose();
    }
       
        
       
     private void ataqueBasico(ActionEvent evt) {
                if (showMathQuestion("fraccion")) {
                         enemyHp -= 10;
                        definitiveCharge++;
                        updateBars();
                        enemyTurn();
                        //checkWinLose();
        }
            }
     
      private void ataqueMedio(ActionEvent evt) {
               if (showMathQuestion("ecuacion")) {
            enemyHp -= 90;
            definitiveCharge++;
            updateBars();
            enemyTurn();
            //checkWinLose();
        }
            }
      
      private void ataqueDefinitivo(ActionEvent evt) {
                if (definitiveCharge >= 3) {
            if (showMathQuestion("potencia")) {
                enemyHp -= 100;
                definitiveCharge = 0;
                updateBars();
                enemyTurn();
                //checkWinLose();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Todavía no puedes realizar esta acción.");
        }
            }
      
       private void esquivar(ActionEvent evt) {
        if (turnCount % 3 == 0) {
            if (showMathQuestion("radical")) {
                JOptionPane.showMessageDialog(this, "¡Esquiva exitosa!");
            } else {
                JOptionPane.showMessageDialog(this, "No has podido esquivar.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Todavía no puedes realizar esta acción.");
        }
    }
      
      
    
   

    //private void esquivar(ActionEvent evt) {
        //if (turnCount % 3 == 0) {
            //if (showQuestion()) {
                //JOptionPane.showMessageDialog(this, "¡Esquiva exitosa!");
            //} else {
                //JOptionPane.showMessageDialog(this, "No has podido esquivar.");
            //}
        //} else {
            //JOptionPane.showMessageDialog(this, "Todavía no puedes realizar esta acción.");
        //}
    //}

    //------------------------------------------------------------
    //Metodo para actualizar las barras de vida y de carga 
    //------------------------------------------------------------
    private void updateBars() {
        VidaJugador.setValue(playerHp);
        VidaEnemigo.setValue(enemyHp);
        //definitiveCharge.setValue(definitiveCharge);
    }
    //------------------------------------------------------------
    
    //private boolean showMathQuestion() {
        //String question = "¿Cuánto es 1/2 + 1/4?";
        //String answer = JOptionPane.showInputDialog(this, question);
        //return "3/4".equals(answer);
    //}
    
    //-------------------------------------------------------------------------------
     //private boolean showMathQuestion() {
        // Genera un problema matemático usando una de las funciones de operacionesMatematicas
        //operacionesMatematicas problema = operacionesMatematicas.generarProblemaFraccion();

        // Muestra el enunciado del problema en un cuadro de diálogo
        //String enunciado = problema.getEnunciado();
        //String respuestaUsuarioStr = JOptionPane.showInputDialog(null, enunciado);

        // Intenta convertir la respuesta del usuario a un número
        //try {
            //double respuestaUsuario = Double.parseDouble(respuestaUsuarioStr);

            // Comprueba si la respuesta del usuario es correcta
            //return problema.comprobarRespuesta(respuestaUsuario);
        //} catch (NumberFormatException e) {
            // Si la conversión falla, se considera incorrecta la respuesta
            //return false;
        //}
    //---------------------------------------------------------------------------------
    
        private boolean showMathQuestion(String tipo) {
        operacionesMatematicas problema = null;
        switch (tipo) {
            case "fraccion":
                problema = operacionesMatematicas.generarProblemaFraccion();
                break;
            case "ecuacion":
                problema = operacionesMatematicas.generarProblemaEcuacion();
                break;
            case "potencia":
                problema = operacionesMatematicas.generarProblemaPotencia();
                break;
            case "radical":
                problema = operacionesMatematicas.generarProblemaRadical();
                break;
        }
        if (problema != null) {
            String enunciado = problema.getEnunciado();
            String respuestaUsuarioStr = JOptionPane.showInputDialog(this, enunciado);
            try {
                double respuestaUsuario = Double.parseDouble(respuestaUsuarioStr);
                return problema.comprobarRespuesta(respuestaUsuario);
            } catch (NumberFormatException e) {
                return false;
            }
        }
        return false;
        //return false;
            }
    //----------------------------------------------------------------------------------
   private void endGame() {
    
    this.dispose(); // Cierra la ventana principal
   
    // System.exit(0);
}
        
        
        
        
        
    //private boolean showQuestion() {
        //String question = "¿Pregunta de esquivar?";
        //String answer = JOptionPane.showInputDialog(this, question);
        //return "respuesta correcta".equals(answer);
    //}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelDeJuego = new javax.swing.JPanel();
        VidaJugador = new javax.swing.JProgressBar();
        CargaAtaqueDefinitivoJugador = new javax.swing.JProgressBar();
        VidaEnemigo = new javax.swing.JProgressBar();
        CargaAtaqueDefinitivoEnemigo = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        PanelDeAtaque = new javax.swing.JPanel();
        AtaqueDefinitivo = new javax.swing.JButton();
        Esquivar = new javax.swing.JButton();
        AtaquePesado = new javax.swing.JButton();
        AtaqueBasico = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelDeJuego.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        VidaJugador.setBackground(new java.awt.Color(255, 153, 102));
        VidaJugador.setForeground(new java.awt.Color(51, 255, 0));
        VidaJugador.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PanelDeJuego.add(VidaJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 37, 271, 15));

        CargaAtaqueDefinitivoJugador.setBackground(new java.awt.Color(153, 153, 153));
        CargaAtaqueDefinitivoJugador.setForeground(new java.awt.Color(255, 255, 51));
        PanelDeJuego.add(CargaAtaqueDefinitivoJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 70, 186, 17));

        VidaEnemigo.setBackground(new java.awt.Color(255, 102, 102));
        VidaEnemigo.setForeground(new java.awt.Color(51, 255, 0));
        VidaEnemigo.setMaximum(1000);
        VidaEnemigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PanelDeJuego.add(VidaEnemigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(532, 37, 258, 15));

        CargaAtaqueDefinitivoEnemigo.setBackground(new java.awt.Color(255, 255, 0));
        PanelDeJuego.add(CargaAtaqueDefinitivoEnemigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 70, 200, 17));
        PanelDeJuego.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, -340, -1, -1));

        AtaqueDefinitivo.setText("jButton3");
        PanelDeAtaque.add(AtaqueDefinitivo);

        Esquivar.setText("jButton1");
        PanelDeAtaque.add(Esquivar);

        AtaquePesado.setText("jButton2");
        PanelDeAtaque.add(AtaquePesado);

        AtaqueBasico.setText("jButton1");
        PanelDeAtaque.add(AtaqueBasico);

        PanelDeJuego.add(PanelDeAtaque, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 320, 260, 60));
        PanelDeJuego.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 680, 270));

        getContentPane().add(PanelDeJuego, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
           // Crear y mostrar la interfaz gráfica
        //JFrame frame = new JFrame("Ataque Básico");
        GameGUI gameGUI = new GameGUI();
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.getContentPane().add(gameGUI.AtaqueBasico);
        //frame.setSize(300, 200);
        //frame.setVisible(true);
        
        
        
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AtaqueBasico;
    private javax.swing.JButton AtaqueDefinitivo;
    private javax.swing.JButton AtaquePesado;
    private javax.swing.JProgressBar CargaAtaqueDefinitivoEnemigo;
    private javax.swing.JProgressBar CargaAtaqueDefinitivoJugador;
    private javax.swing.JButton Esquivar;
    private javax.swing.JPanel PanelDeAtaque;
    private javax.swing.JPanel PanelDeJuego;
    private javax.swing.JProgressBar VidaEnemigo;
    private javax.swing.JProgressBar VidaJugador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
