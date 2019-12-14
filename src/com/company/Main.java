package com.company;

public class Main {

    public static void main(String[] args) {

        Car bmw = new Car();
        Car.SteeringWheel w = bmw.new SteeringWheel();
        w.turnLeft();
        w.turnRight();
        bmw.doMove();


    }
}
