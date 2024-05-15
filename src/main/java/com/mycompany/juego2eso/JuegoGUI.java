
package com.mycompany.juego2eso;



import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class JuegoGUI extends javax.swing.JFrame {

    private int playerHp = 100;
    private int enemyHp = 1000;
    private int definitiveCharge = 0;
    private int turnCount = 0;
     
    public JuegoGUI() {
        System.out.println("asewgfaegdargraegagbtcom.mycompany.juego2eso.JuegoGUI.<init>()");
        
        initComponents();
        PanelAtaque = new javax.swing.JPanel();
        imagenEscenario = new javax.swing.JLabel();
        Jugador = new javax.swing.JLabel();
        VidaJugador = new javax.swing.JProgressBar();
        panelDeJuego = new javax.swing.JPanel();
        AtaqueBasico = new javax.swing.JButton();
        AtaqueDefinitivo = new javax.swing.JButton();
        AtaquePesado = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        VidaEnemigo = new javax.swing.JProgressBar();
        CargaAtaqueDefinitivo = new javax.swing.JProgressBar();
        CargaAtaqueDefinitivoEnemigo = new javax.swing.JProgressBar();
        Monstruo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelAtaque.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Jugador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/juego2eso/Caballero.png"))); // NOI18N
        PanelAtaque.add(Jugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 500, -1, -1));

        Monstruo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/juego2eso/Monstruo2-removebg-preview (1).png"))); // NOI18N
        PanelAtaque.add(Monstruo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 410, 210, 200));
        PanelAtaque.add(VidaJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 320, 30));

        AtaqueBasico.setText("Ataque Básico");
        AtaqueBasico.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                ataqueBasico(evt);
            }
        });
        PanelAtaque.add(AtaqueBasico, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, -1, -1));

        AtaqueDefinitivo.setText("Ataque Medio");
        AtaqueDefinitivo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                ataqueMedio(evt);
            }
        });
        PanelAtaque.add(AtaqueDefinitivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 480, -1, -1));

        AtaquePesado.setText("Ataque Definitivo");
        AtaquePesado.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                ataqueDefinitivo(evt);
            }
        });
        PanelAtaque.add(AtaquePesado, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 480, -1, -1));

        jButton4.setText("Esquivar");
        jButton4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                esquivar(evt);
            }
        });
        PanelAtaque.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 480, -1, -1));

        panelDeJuego.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panelDeJuego.add(PanelAtaque, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 540));
        getContentPane().add(panelDeJuego, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 540));

        pack();
        
    }
    
    //private void initComponents() {
        
    //}
    
    
    private void ataqueBasico(ActionEvent evt) {
        if (showMathQuestion()) {
            enemyHp -= 20;
            definitiveCharge++;
            updateBars();
            enemyTurn();
        }
    }

    private void ataqueMedio(ActionEvent evt) {
        if (showMathQuestion()) {
            enemyHp -= 40;
            definitiveCharge++;
            updateBars();
            enemyTurn();
        }
    }

    private void ataqueDefinitivo(ActionEvent evt) {
        if (definitiveCharge >= 3) {
            enemyHp -= 100;
            definitiveCharge = 0;
            updateBars();
            enemyTurn();
        } else {
            JOptionPane.showMessageDialog(this, "Todavía no puedes realizar esta acción.");
        }
    }

    private void esquivar(ActionEvent evt) {
        if (turnCount % 3 == 0) {
            if (showQuestion()) {
                JOptionPane.showMessageDialog(this, "¡Esquiva exitosa!");
            } else {
                JOptionPane.showMessageDialog(this, "No has podido esquivar.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Todavía no puedes realizar esta acción.");
        }
    }

    private void enemyTurn() {
        playerHp -= 10; // Ataque del enemigo
        turnCount++;
        updateBars();
    }

    private void updateBars() {
        VidaJugador.setValue(playerHp);
        VidaEnemigo.setValue(enemyHp);
        CargaAtaqueDefinitivo.setValue(definitiveCharge);
    }
    
    private boolean showMathQuestion() {
        String question = "¿Cuánto es 1/2 + 1/4?";
        String answer = JOptionPane.showInputDialog(this, question);
        return "3/4".equals(answer);
    }
    
    
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
    
    private boolean showQuestion() {
        String question = "¿Pregunta de esquivar?";
        String answer = JOptionPane.showInputDialog(this, question);
        return "respuesta correcta".equals(answer);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        panelDeJuego = new javax.swing.JPanel();
        Jugador = new javax.swing.JLabel();
        Monstruo1 = new javax.swing.JLabel();
        VidaJugador = new javax.swing.JProgressBar();
        CargaAtaqueDefinitivo = new javax.swing.JProgressBar();
        CargaAtaqueDefinitivoEnemigo = new javax.swing.JProgressBar();
        VidaEnemigo = new javax.swing.JProgressBar();
        PanelAtaque = new javax.swing.JPanel();
        AtaqueBasico = new javax.swing.JButton();
        AtaqueDefinitivo = new javax.swing.JButton();
        AtaquePesado = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        imagenEscenario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelDeJuego.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Jugador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Caballero.jpg"))); // NOI18N
        panelDeJuego.add(Jugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, 560, 430));

        Monstruo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/juego2eso/Monstruo2-removebg-preview (1).png"))); // NOI18N
        panelDeJuego.add(Monstruo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, -1, -1));
        panelDeJuego.add(VidaJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 210, 20));
        panelDeJuego.add(CargaAtaqueDefinitivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 200, 30));
        panelDeJuego.add(CargaAtaqueDefinitivoEnemigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 30, 260, 20));
        panelDeJuego.add(VidaEnemigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 60, 260, 20));

        AtaqueBasico.setText("jButton1");

        AtaqueDefinitivo.setText("jButton2");

        AtaquePesado.setText("jButton3");

        jButton4.setText("jButton4");

        javax.swing.GroupLayout PanelAtaqueLayout = new javax.swing.GroupLayout(PanelAtaque);
        PanelAtaque.setLayout(PanelAtaqueLayout);
        PanelAtaqueLayout.setHorizontalGroup(
            PanelAtaqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAtaqueLayout.createSequentialGroup()
                .addGroup(PanelAtaqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelAtaqueLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(AtaqueBasico))
                    .addGroup(PanelAtaqueLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(AtaqueDefinitivo)))
                .addContainerGap(82, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAtaqueLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(PanelAtaqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAtaqueLayout.createSequentialGroup()
                        .addComponent(AtaquePesado)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAtaqueLayout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addContainerGap())))
        );
        PanelAtaqueLayout.setVerticalGroup(
            PanelAtaqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAtaqueLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AtaqueBasico)
                .addGap(5, 5, 5)
                .addComponent(AtaquePesado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AtaqueDefinitivo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        panelDeJuego.add(PanelAtaque, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 480, 220, 140));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Monstruo2-removebg-preview (1).png"))); // NOI18N
        panelDeJuego.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, -1, -1));

        imagenEscenario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/juego2eso/Escenario.jpg"))); // NOI18N
        panelDeJuego.add(imagenEscenario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 640));

        getContentPane().add(panelDeJuego, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(JuegoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JuegoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JuegoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JuegoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JuegoGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AtaqueBasico;
    private javax.swing.JButton AtaqueDefinitivo;
    private javax.swing.JButton AtaquePesado;
    private javax.swing.JProgressBar CargaAtaqueDefinitivo;
    private javax.swing.JProgressBar CargaAtaqueDefinitivoEnemigo;
    private javax.swing.JLabel Jugador;
    private javax.swing.JLabel Monstruo1;
    private javax.swing.JPanel PanelAtaque;
    private javax.swing.JProgressBar VidaEnemigo;
    private javax.swing.JProgressBar VidaJugador;
    private javax.swing.JLabel imagenEscenario;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JPanel panelDeJuego;
    // End of variables declaration//GEN-END:variables
}