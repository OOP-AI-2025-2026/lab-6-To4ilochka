package org.example.task1;

public class Main {

    public static void main(String[] args) {
        Animal myDog = new Dog("Dog");
        Animal myCat = new Cat("Cat");

        System.out.println(myDog.getName() + " says: " + myDog.makeSound());
        System.out.println(myCat.getName() + " says: " + myCat.makeSound());
    }
}