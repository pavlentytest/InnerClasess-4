package com.company;

public class Car {
    private String name;
    private double weight;
    private SteeringWheel steeringWheel;

    public  class SteeringWheel {
        private String material;
        void turnRight() {
             String a = Car.this.name;
            System.out.println("Turn right");
        }
        void turnLeft() {
            System.out.println("Turn left");
        }
    }

    public String getName() {
       //SteeringWheel sw = new SteeringWheel();
        return name;
    }

    void doMove() {
        System.out.println("Moving...");


        class MV {
            private String ccc;
        }
        MV v = new MV();
        v.ccc = "";
    }

}
