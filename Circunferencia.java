package org.example;

public class Circunferencia {
    private Punto centro;
    private double radio;

    public Circunferencia(Punto centro, double radio) {
        this.centro = centro;
        this.radio = radio;
    }

    public Circunferencia(double x, double y, double radio) {
        this.centro = new Punto(x,y);
        this.radio = radio;
    }

    public Circunferencia() {
        this.centro = centro;
        this.radio = radio;
    }

    public Punto getCentro() {
        return centro;
    }

    public void setCentro(Punto centro) {
        this.centro = centro;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double distancia(Punto punto) {
        return centro.distancia(punto);
    }

    public double area () {
        return 3.14 * radio * radio;
    }

    public double perimetro () {
        return 2 * 3.14 * radio;
    }

    @Override
    public String toString() {
        return "Circunferencia{" +
                "centro=" + centro +
                ", radio=" + radio +
                '}';
    }
}
