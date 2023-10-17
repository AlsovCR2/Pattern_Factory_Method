package domain;

import java.awt.Color;
import java.awt.Graphics;

public class Cuadrado extends Figura {

    private int lado;

    public Cuadrado() {
        super();
        this.lado = 40;
        this.setNombre("Cuadrado");
    }

    public Cuadrado(int lado, Posicion posicion) {
        super(posicion);
        this.lado = lado;
        this.setNombre("Cuadrado");
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public void dibujar(Graphics g) {
        g.setColor(Color.blue);
        g.fillRect(this.getPosicion().getX(), this.getPosicion().getY(), this.lado,this. lado);
    }

}//fin cuadrado
