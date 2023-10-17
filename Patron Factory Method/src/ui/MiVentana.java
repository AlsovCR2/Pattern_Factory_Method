package ui;

import javax.swing.*;
import domain.EnumFigura;
import domain.FabricaFigura;
import domain.Figura;
import domain.Posicion;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

public class MiVentana extends JFrame {
    private FabricaFigura fabricaFiguras;
    private ArrayList<Figura> figuras; // Lista para almacenar las figuras creadas

    public MiVentana() {
        fabricaFiguras = new FabricaFigura();
        figuras = new ArrayList<>();

        JButton botonCuadrado = new JButton("Cuadrado");
        JButton botonCirculo = new JButton("Círculo");
        JButton botonTriangulo = new JButton("Triangulo");
        JButton botonRombo = new JButton("Rombo");

        botonCuadrado.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Figura figura = fabricaFiguras.crearFigura(EnumFigura.CUADRADO);
                asignarPosicionAleatoria(figura);
                figuras.add(figura);
                repaint();
            }
        });

        botonCirculo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Figura figura = fabricaFiguras.crearFigura(EnumFigura.CIRCULO);
                asignarPosicionAleatoria(figura);
                figuras.add(figura);
                repaint();
            }
        });

        botonTriangulo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Figura figura = fabricaFiguras.crearFigura(EnumFigura.TRIANGULO);
                asignarPosicionAleatoria(figura);
                figuras.add(figura);
                repaint();
            }
        });

        botonRombo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Figura figura = fabricaFiguras.crearFigura(EnumFigura.ROMBO);
                asignarPosicionAleatoria(figura);
                figuras.add(figura);
                repaint();
            }
        });

        setLayout(new FlowLayout());
        add(botonCuadrado);
        add(botonCirculo);
        add(botonTriangulo);
        //  add(botonRombo);

        setTitle("Dibujar Figuras");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        for (Figura figura : figuras) {
            figura.dibujar(g);
        }
    }

    // Función para asignar una posición aleatoria
    private void asignarPosicionAleatoria(Figura figura) {
        Random rand = new Random();
        int x = rand.nextInt(getWidth() - 40);
        int y = rand.nextInt(getHeight() - 40);
        figura.setPosicion(new Posicion(x, y));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MiVentana();
            }
        });
    }
}
