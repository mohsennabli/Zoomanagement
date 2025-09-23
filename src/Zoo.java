class Zoo {
    Animal[] animals;
    String name;
    String city;
    int nbrCages;
    int animalCount;

    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = new Animal[nbrCages];
        this.animalCount = 0;

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
        if (animalCount>=nbrCages){
            return false;
        }
        for (int i = 0; i < this.animals.length; i++) {
            if (animals[i]==null) {
                animals[i]=animal;
                animalCount++;
                return true;
            }
        }
        return false;
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