package com.company;

public class Main {

    public static void main(String[] args) {
        MojKalkulator mojKalkulator = new MojKalkulator();
        System.out.println(mojKalkulator.dodaj(10,20));
        System.out.println(mojKalkulator.odejmij(40,10));
        System.out.println(mojKalkulator.sinus(90));

        System.out.println();
        Kalkulator nowyKalkulator = new MojKalkulator();
        System.out.println(nowyKalkulator.dodaj(10,20));
        System.out.println(nowyKalkulator.odejmij(30,10));
    }
}

interface Kalkulator {
    double Pi = 3.14159;

    double dodaj(double a, double b);
    double odejmij( double a, double b);
}
class MojKalkulator implements Kalkulator {
    public double dodaj(double a, double b) {
        return a + b;
    }
    public double odejmij(double a, double b) {
        return a - b;
    }
    public double sinus(double degree) {
        double radians = degree * 3.14159 / 180;
        return Math.sin(radians);
    }
}
