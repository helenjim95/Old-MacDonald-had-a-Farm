package de.tum.in.ase;

import java.util.List;

/**
 * Represents a Farm
 */
public class Farm {
    private List<Animal> animals;

    public Farm() {}

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }

    public void addAnimal(Animal animal) {
        if (animal != null) {
            animals.add(animal);
        }
    }

    public void feedAllAnimals() {
        if (animals.size() > 0) {
            for (Animal animal : animals) {
                animal.messageOnFeed();
            }
        }
    }

    /**
     * Sings farm song for all animals in the farm
     */
    public void singFarmSong() {
        if (animals.size() > 0) {
            for (Animal animal : animals) {
                singFarmSongVerse(animal);
            }
        }
    }

    /**
     * Prints the animal specific song given an animal
     *
     * @param animal - animal whose song is to be printed
     */
    private void singFarmSongVerse(Animal animal) {
        //Use animal.getClass().getSimpleName() to get Class name

        String message = animal.messageOnFeed();

        System.out.print("Old MacDonald had a farm\n" +
                "Ee i ee i o\n" +
                "And on his farm he had some ");
        System.out.printf("%ss%n", animal.getClass().getSimpleName()); // TODO: Print Animal Type
        System.out.println("Ee i ee i oh");
        System.out.println("With a ");
        System.out.println(message);
        System.out.println(message);
        System.out.println("here, and a ");
        System.out.println(message);
        System.out.println(message);
        System.out.println("there.");
        System.out.println("Here a ");
        System.out.println(message);
        System.out.println("There a ");
        System.out.println(message);
        System.out.println("Everywhere a ");
        System.out.println(message);
        System.out.println(message);
        System.out.println("Old MacDonald had a farm\n" +
                "Ee i ee i o");
    }
}
