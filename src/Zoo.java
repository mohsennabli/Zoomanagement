class Zoo {
    Animal[] animals;
    String name;
    String city;
    int nbrCages;

    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = new Animal[25];
    }

    public void addAnimal(Animal a) {
        if (animalCount < 25) {
            animals[animalCount] = a;
            animalCount++;
        } else {
            System.out.println("Zoo full");
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