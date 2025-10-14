package tn.esprit.gestionzoo.entities;

public class Aquatic extends Animal {

    private String habitat;

    public Aquatic(String name) {
        super(name);
    }

    public Aquatic(String name, String habitat) {
        super(name);
        this.habitat = habitat;
    }
    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    @Override
    public String toString() {
        return super.toString() +"', habitat='" + habitat;
    }

    public void swim() {
        System.out.println("This aquatic animal is not swimming anymore.");
    }
}
