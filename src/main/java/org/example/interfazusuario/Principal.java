package org.example.interfazusuario;

import org.example.interfazusuario.eventos.Eventosraton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Principal extends Frame {
    private Label lblNombre;
    private TextField txtnombre;
    private Button btnboton1;

    public Principal(String title) throws HeadlessException {
        super(title);
        this.setSize(1000,720);
        this.setLayout(new FlowLayout());
        lblNombre = new Label("Nombre:");
        this.add(lblNombre);
        txtnombre = new TextField(30);
        this.add(txtnombre);
        btnboton1 = new Button("Saludos!");
        //btnboton1.addMouseListener(new Eventosraton());
        btnboton1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println(txtnombre.getText());
                JOptionPane.showMessageDialog(null, "Hola " + txtnombre.getText());
            }
        });
        this.add(btnboton1);

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        this.setVisible(true);
    }

}
