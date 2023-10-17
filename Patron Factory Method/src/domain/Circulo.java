package domain;

import java.awt.Color;
import java.awt.Graphics;

public class Circulo extends Figura {

    private int radio;

    public Circulo() {
        super();
        this.radio = 50;
        this.setNombre("Circulo");
    }

    public Circulo(int radio,Posicion posicion) {
        super(posicion);
        this.radio = radio;
        this.setNombre("Circulo");
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    @Override
    public void dibujar(Graphics g) {
        g.setColor(Color.red);
        g.fillOval(this.getPosicion().getX(),this.getPosicion().getY(),this.getRadio(),this.getRadio());
    }
}//fin circulo
