package org.example;

public class Punto {
    private double x;
    private double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Punto() {
        this.x = 0;
        this.y = 0;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    /**
     * Formúla matemática para calcular la distancia entre el punto x e y
     *
     * @param punto segundo punto para calcular la distancia
     * @return devuelve la distancia entre ambos puntos
     */
    public double distancia(Punto punto) {
        double x = this.x - punto.getX();
        double y = this.y - punto.getY();
        return x * x + y * y;
    }
}
