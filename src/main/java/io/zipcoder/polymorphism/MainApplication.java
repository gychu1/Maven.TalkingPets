package io.zipcoder.polymorphism;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainApplication {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Pet> listOfPets = new ArrayList<>();

        System.out.println("How many pets do you have?");
        int numOfPets = scanner.nextInt();

        for (int i = 0; i < numOfPets; i++) {
            System.out.println("What kind of pet is it?");
            String petType = scanner.next().toLowerCase();
            String petName;
            switch (petType) {
                case "dog":
                    System.out.println("What is your dog's name?");
                    petName = scanner.next();
                    Pet petDog = new Dog(petName);
                    listOfPets.add(petDog);
                    break;
                case "cat":
                    System.out.println("What is your cat's name?");
                    petName = scanner.next();
                    Pet petCAT = new Cat(petName);
                    listOfPets.add(petCAT);
                    break;
                case "bunny":
                    System.out.println("What is your bunny's name?");
                    petName = scanner.next();
                    Pet petBunny = new Bunny(petName);
                    listOfPets.add(petBunny);
                    break;
                default:
                    i--;
                    break;
            }

        }
        listOfPets.forEach(pet -> System.out.println(pet.name + " says " + pet.speak()));
    }
}
