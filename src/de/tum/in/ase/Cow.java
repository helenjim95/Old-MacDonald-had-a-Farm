package de.tum.in.ase;

public class Cow extends Animal implements Rideable, Milkable {

    public Cow(String name) {
        super(name);
    }

    @Override
    public String messageOnFeed() {
        return "Mooh!";
    }

    @Override
    public String messageOnMilk() {
        return String.format("%s %s is milked", this.getClass().getSimpleName(), this.getName());
    }

    @Override
    public String messageOnRide() {
        return String.format("Riding on %s %s", this.getClass().getSimpleName(), this.getName());
    }
}
