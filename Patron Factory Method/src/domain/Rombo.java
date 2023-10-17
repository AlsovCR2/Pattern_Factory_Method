package domain;

import java.awt.Color;
import java.awt.Graphics;


public class Rombo extends Figura {

    private int diagMayor;
    private int diagMenor;

    public Rombo() {
        super();
        this.diagMayor = 40;
        this.diagMenor = 40;
        this.setNombre("Rombo");
    }

    public Rombo(int diagonalMayor, int diagonalMenor, Posicion posicion) {
        super(posicion);
        this.diagMayor = diagonalMayor;
        this.diagMenor = diagonalMenor;
        this.setNombre("Rombo");
    }

    public int getDiagonalMayor() {
        return diagMayor;
    }

    public void setDiagonalMayor(int diagonalMayor) {
        this.diagMayor = diagonalMayor;
    }

    public int getDiagonalMenor() {
        return diagMenor;
    }

    public void setDiagonalMenor(int diagonalMenor) {
        this.diagMenor = diagonalMenor;
    }

    @Override
    public void dibujar(Graphics g) {

        g.setColor(Color.green);

        g.drawLine(this.getPosicion().getX(), this.getPosicion().getY(), this.getPosicion().getX() - this.diagMenor, this.getPosicion().getY() + this.diagMayor / 2);//cateto

        g.drawLine(this.getPosicion().getX(), this.getPosicion().getY(), this.getPosicion().getX() + this.diagMenor, this.getPosicion().getY() + this.diagMayor / 2);//cateto 2

        g.drawLine(this.getPosicion().getX(), this.getPosicion().getY() + this.diagMayor, this.getPosicion().getX() - this.diagMenor, this.getPosicion().getY() + this.diagMayor / 2);//cateto3

        g.drawLine(this.getPosicion().getX(), this.getPosicion().getY() + this.diagMayor, this.getPosicion().getX() + this.diagMenor, this.getPosicion().getY() + this.diagMayor / 2);//cateto 4

    }

}//fin rombo