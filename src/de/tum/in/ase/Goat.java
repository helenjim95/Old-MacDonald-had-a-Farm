package de.tum.in.ase;

public class Goat extends Animal implements Mikable {

    public Goat(String name) {
        super(name);
    }

    @Override
    public String messageOnFeed() {
        return "Maah!";
    }

    @Override
    public String messageOnMilk() {
        return String.format("%s %s is milked", this.getClass().getSimpleName(), this.getName());
    }
}
