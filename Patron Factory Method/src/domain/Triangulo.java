package domain;

import java.awt.Color;
import java.awt.Graphics;

public class Triangulo extends Figura {

    private int lado;

    public Triangulo() {
        super();
        this.lado = 40;
        this.setNombre("Triangulo");
    }

    public Triangulo(int cateto, Posicion posicion) {
        super(posicion);
        this.lado = cateto;
        this.setNombre("Triangulo");
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public void dibujar(Graphics g) {
        //    g.drawLine(this.getPosicion().getX() - this.getLado(), this.getPosicion().getY() + this.getLado(), this.getPosicion().getX() + this.getLado(), this.getPosicion().getY() + this.getLado());//  /baseeee

        //     g.drawLine(this.getPosicion().getX(), this.getPosicion().getY(), this.getPosicion().getX() - this.getLado(), this.getPosicion().getY() + this.getLado());//cateto

        //     g.drawLine(this.getPosicion().getX(), this.getPosicion().getY(), this.getPosicion().getX() + this.getLado(), this.getPosicion().getY() + this.getLado());//cateto

        g.setColor(Color.yellow);

        int[] xPoints = {
                this.getPosicion().getX() - this.getLado(),
                this.getPosicion().getX(),
                this.getPosicion().getX() + this.getLado()
        };

        int[] yPoints = {
                this.getPosicion().getY() + this.getLado(),
                this.getPosicion().getY(),
                this.getPosicion().getY() + this.getLado()
        };

        int nPoints = 3; // Número de vértices

        // Dibuja el triángulo
        g.drawPolygon(xPoints, yPoints, nPoints);

        // Rellena el triángulo
        g.fillPolygon(xPoints, yPoints, nPoints);

    }
}//fin triangulo