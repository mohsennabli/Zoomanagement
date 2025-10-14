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
    public Aquatic(String name, int age, String habitat) {
        super(name);
        this.setAge(age);
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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Aquatic other = (Aquatic) obj;
        boolean sameName = this.getName().equals(other.getName());
        boolean sameAge = this.getAge() == other.getAge();
        boolean sameHabitat = this.habitat.equals(other.habitat);

        return sameName && sameAge && sameHabitat;
    }

}
