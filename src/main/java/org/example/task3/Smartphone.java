package org.example.task3;

public record Smartphone(String model, double latitude, double longitude) implements GPS, Cellular {

    @Override
    public double[] getCoordinates() {
        return new double[]{this.latitude, this.longitude};
    }

    @Override
    public void makeCall() {
        System.out.println(model + ": Making an outgoing call...");
    }

    @Override
    public void receiveCall() {
        System.out.println(model + ": Receiving an incoming call.");
    }

    public void printLocation() {
        System.out.println("Location of " + model + ": (" + latitude + ", " + longitude + ")");
    }
}