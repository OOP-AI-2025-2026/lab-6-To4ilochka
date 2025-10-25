package org.example.task3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Smartphone myPhone = new Smartphone("Pixel 10 Ultra", 51.5074, -0.1278);

        System.out.println("--- Testing Communication ---");
        testCellularDevice(myPhone);

        System.out.println("\n--- Testing Navigation ---");
        printDeviceLocation(myPhone);
    }

    public static void testCellularDevice(Cellular device) {
        device.makeCall();
        device.receiveCall();
    }

    public static void printDeviceLocation(GPS device) {
        double[] coords = device.getCoordinates();
        System.out.println("Device location: " + Arrays.toString(coords));
    }
}