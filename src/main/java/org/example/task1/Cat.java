package org.example.task1;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    String makeSound() {
        return "Meow";
    }
}
