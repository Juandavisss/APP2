
package com.mycompany.juego_2_eso;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class MensajesJuego extends JFrame {
    public MensajesJuego(String mensaje) {
        // Configurar la ventana
        setTitle("Mensaje del Juego");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear un panel para mostrar el mensaje
        JPanel panel = new JPanel();
        JLabel label = new JLabel(mensaje, SwingConstants.CENTER);
        panel.add(label);
        add(panel);

        // Centrar la ventana en la pantalla
        setLocationRelativeTo(null);

        // Hacer visible la ventana
        setVisible(true);
    }

   
    
}