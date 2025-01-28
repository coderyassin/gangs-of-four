package org.yascode.structural.decorator;

public class MainApplication {

    public static void main(String[] args) {
        Car sportsCar = new SportsCar(new BasicCar());
        sportsCar.assemble();

        System.out.println("\n*****");

        Car luxuryCar = new LuxuryCar(new BasicCar());
        luxuryCar.assemble();

        System.out.println("\n*****");

        Car sportsLuxuryCar = new SportsCar(luxuryCar);
        sportsLuxuryCar.assemble();
    }
}
