package de.tum.in.ase;

/**
 * Represents a Farm
 */
public class Farm {
    //TODO: Implement Farm as described in task

    /**
     * Sings farm song for all animals in the farm
     */
    public void singFarmSong() {
        //TODO: Let the Animals sing!
    }

    /**
     * Prints the animal specific song given an animal
     *
     * @param animal - animal whose song is to be printed
     */
    private void singFarmSongVerse(/*Animal animal*/) {
        //Use animal.getClass().getSimpleName() to get Class name

        System.out.print("Old MacDonald had a farm\n" +
                "Ee i ee i o\n" +
                "And on his farm he had some ");
        System.out.println("" + "s"); // TODO: Print Animal Type
        System.out.println("Ee i ee i oh");
        System.out.println("With a ");

        System.out.println("here, and a ");

        System.out.println("there.");
        System.out.println("Here a ");


        System.out.println("There a ");

        System.out.println("Everywhere a ");

        System.out.println("Old MacDonald had a farm\n" +
                "Ee i ee i o");
    }
}
