package domain;

import java.awt.Graphics;

public class Figura {

    public Posicion posicion;
    private String nombre;

    public Figura() {
        this.posicion = null;
        this.nombre = "";
    }//constructor default

    public Figura(Posicion posicion) {
        this.posicion = posicion;
    } //constructor

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int size() {
        return this.nombre.length() * 2 + 4;
    }

    public void dibujar(Graphics g) {

    }

} //fin clase Figura
