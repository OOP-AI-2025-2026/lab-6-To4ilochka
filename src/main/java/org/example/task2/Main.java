package org.example.task2;

public class Main {
    public static void main(String[] args) {
        Movable myPoint = new Point(5, 8);

        System.out.println("Initial position: " + myPoint);

        myPoint.moveTo(25.0, 12.5);
        System.out.println("After moveTo(25.0, 12.5): " + myPoint);

        myPoint.setX(50);
        System.out.println("After setX(50): " + myPoint);

        System.out.println("Current coordinates: x = " + myPoint.getX() + ", y = " + myPoint.getY());
    }
}