package com.annotation.override;

public class Main {
    public static void main(String[] args) {
        Animal animal=new Animal();
        Dog dog=new Dog();
        Animal dog2=new Dog();

        animal.makeSound();

        dog.makeSound();

        dog2.makeSound();
    }
}
