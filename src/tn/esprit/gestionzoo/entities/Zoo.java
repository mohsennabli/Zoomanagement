package tn.esprit.gestionzoo.entities;

public class Zoo {
    Animal[] animals;
    private String name;
    private String city;
    static final int nbrCages =25;
    private int animalCount;

    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.animals = new Animal[nbrCages];
        this.animalCount = 0;

    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (name == ""){
            System.out.println("Name is empty");
        }
        this.name = name;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        if (city == ""){
            System.out.println("City is empty");
        }
        this.city = city;
    }
    public int getAnimalCount() {
        return animalCount;
    }
    public void setAnimalCount(int animalCount) {
        this.animalCount = animalCount;
    }

    public void displayAnimals() {
        if (animalCount==0){
            System.out.println("Pas d'animeaux");
        }
        else{
            for (int i = 0; i < this.animals.length; i++) {
                System.out.println(this.animals[i]);
            }
        }
    }

    public boolean addAnimal(Animal animal) {
        if (animal == null) return false;
        if (isZooFull()) return false;
        else{
            for (int i = 0; i < animals.length; i++) {
                if (animals[i] != null && (animals[i].getName()) ==animal.getName()) {
                    return false;
                }
            }
            for (int i = 0; i < animals.length; i++) {
                if (animals[i] == null) {
                    animals[i] = animal;
                    animalCount++;
                    return true;
                }
            }
            return false;
        }
    }

    public int searchAnimal(Animal animal) {
        if (animal == null){return -1;}
        for (int i = 0; i < this.animals.length; i++) {
            if (animals[i]!=null && (animals[i].getName() == animal.getName())){
                return i;
            }
        }
        return -1;

    }

    public boolean removeAnimal(Animal animal) {
        if (animal == null){return false;}
        for (int i = 0; i < this.animals.length; i++) {
            if (animals[i]!=null && (animals[i].getName() == animal.getName())){
                this.animals[i] = null;
                animalCount--;
                return true;
            }
        }
        return false;
    }

    public boolean isZooFull() {
        if (animalCount>=nbrCages){return true;}
        return false;
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.animalCount >= z2.animalCount) {
            return z1;
        } else {
            return z2;
        }
    }


        public void displayZoo(){
        System.out.println("Zoo name: "+name);
        System.out.println("Zoo city: "+city);
        System.out.println("Zoo nbr cages: "+nbrCages);
    }




    @Override
    public String toString() {
        return "Zoo{name='" + name + "'," +
                " city='" + city + "', cages=" +
                nbrCages + ", animaux=" + animalCount + "}";
    }

}