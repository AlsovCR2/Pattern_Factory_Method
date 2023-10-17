package domain;

public class FabricaFigura {

    public Figura crearFigura(EnumFigura figura) {

        switch (figura) {
            case CIRCULO:
                return new Circulo();

            case CUADRADO:
                return new Cuadrado();

            case TRIANGULO:
                return new Triangulo();



            default:
                return null;

        }
    }
}