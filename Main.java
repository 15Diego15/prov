package org.example;

public class Main {
    public static void main(String[] args) {
        Circunferencia circunferencia1 = new Circunferencia(1,2,3);
        Circunferencia circunferencia2 = new Circunferencia(5,5,4);

        System.out.println("Punto 1: " + circunferencia1.toString());
        System.out.println("Punto 2: " + circunferencia1.toString());

        System.out.println("El perimetro de la primera circuenferia es: " + circunferencia1.perimetro() + "cm");
        System.out.println("El perimetro de la segunda circuenferia es: " + circunferencia2.perimetro() + "cm");

        System.out.println("El radio de la primera circuenferia es: " + circunferencia1.area() + "cm");
        System.out.println("El radio de la segunda circuenferia es: " + circunferencia2.area() + "cm");
    }


}