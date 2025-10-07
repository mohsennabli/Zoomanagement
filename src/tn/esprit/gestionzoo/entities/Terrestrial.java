package tn.esprit.gestionzoo.entities;

public class Terrestrial extends Animal {
    private int nbrLegs;

    public Terrestrial(String family, String name, int age, boolean isMammal) {
        super(family, name, age, isMammal);
    }

    public Terrestrial(String name, int nbrLegs) {
        super(name);
        this.nbrLegs = nbrLegs;
    }

    public int getNbrLegs() {
        return nbrLegs;
    }

    public void setNbrLegs(int nbrLegs) {
        this.nbrLegs = nbrLegs;
    }

    @Override
    public String toString() {
        return  super.toString()+ "', nbrLegs=" + nbrLegs;
    }
}
