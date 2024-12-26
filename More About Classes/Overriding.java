package lab2;

import java.util.Scanner;

class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The dog barks.");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cat meows.");
    }
}

public class Overriding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 'dog' or 'cat':");
        String animalType = scanner.nextLine();

        Animal animal;

        if (animalType.equalsIgnoreCase("dog")) {
            animal = new Dog();
        } else if (animalType.equalsIgnoreCase("cat")) {
            animal = new Cat();
        } else {
            System.out.println("Invalid animal type.");
            return;
        }

        animal.makeSound();
    }
}