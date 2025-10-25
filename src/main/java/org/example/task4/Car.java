package org.example.task4;

public class Car implements Comparable {

    private int price;
    private int year;
    private int horsePower;

    public Car(int price, int year, int horsePower) {
        this.price = price;
        this.year = year;
        this.horsePower = horsePower;
    }

    @Override
    public int compareTo(Object o) {
        if (!(o instanceof Car otherCar)) {
            return 0;
        }

        int priceCompare = otherCar.price - this.price;
        if (priceCompare != 0) {
            return priceCompare;
        }

        int yearCompare = this.year - otherCar.year;
        if (yearCompare != 0) {
            return yearCompare;
        }

        return this.horsePower - otherCar.horsePower;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", year=" + year +
                ", horsePower=" + horsePower +
                '}';
    }
}