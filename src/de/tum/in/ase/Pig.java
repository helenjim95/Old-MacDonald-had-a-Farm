package de.tum.in.ase;

public class Pig extends Animal implements Rideable {

    public Pig(String name) {
        super(name);
    }

    @Override
    public String messageOnFeed() {
        return "Oink!";
    }

    @Override
    public String messageOnRide() {
        return String.format("Riding on %s %s", this.getClass().getSimpleName(), this.getName());
    }
}
