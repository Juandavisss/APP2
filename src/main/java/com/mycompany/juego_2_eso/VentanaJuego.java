
package com.mycompany.juego_2_eso;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class VentanaJuego extends JFrame {
    private JButton botonAtaque1;
    private JButton botonAtaque2;
    private JLabel labelMensaje;

    public VentanaJuego() {
        // Configurar la ventana
        setTitle("Juego de Batalla");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear un panel para los botones y el mensaje
        JPanel panel = new JPanel();
        panel.setLayout(null);

        // Crear botones de ataque
        botonAtaque1 = new JButton("Ataque 1");
        botonAtaque1.setBounds(50, 50, 100, 30);
        botonAtaque1.addActionListener(e -> {
            // Lógica para manejar el primer ataque
            labelMensaje.setText("Has seleccionado Ataque 1");
        });
        panel.add(botonAtaque1);

        botonAtaque2 = new JButton("Ataque 2");
        botonAtaque2.setBounds(200, 50, 100, 30);
        botonAtaque2.addActionListener(e -> {
            // Lógica para manejar el segundo ataque
            labelMensaje.setText("Has seleccionado Ataque 2");
        });
        panel.add(botonAtaque2);

        // Crear un label para mostrar mensajes
        labelMensaje = new JLabel("", SwingConstants.CENTER);
        labelMensaje.setBounds(50, 100, 300, 30);
        panel.add(labelMensaje);

        // Agregar el panel a la ventana
        add(panel);

        // Centrar la ventana en la pantalla
        setLocationRelativeTo(null);

        // Hacer visible la ventana
        setVisible(true);
    }

    
    
}