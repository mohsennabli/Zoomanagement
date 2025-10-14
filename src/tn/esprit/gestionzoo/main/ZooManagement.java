package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class ZooManagement {
    public static void main(String[] args) {
       /* int nbrCages=20;
        String ZooName= "My tn.esprit.gestionzoo.entities.Zoo";
        System.out.println("tn.esprit.gestionzoo.entities.Zoo Name: "+ZooName + "nbr Cages: "+nbrCages);
        Scanner input = new Scanner(System.in) ;
        System.out.println("insert zoo name");
        ZooName = input.nextLine();

        System.out.println("insert zoo age");
        nbrCages = input.nextInt();
        System.out.println("tn.esprit.gestionzoo.entities.Zoo Name: "+ZooName+ " nbr Cages: "+nbrCages);*/

        /*Animal dog = new Animal("doberman", "daleji", 11, true);
        Animal cat = new Animal("gatt", "bechbech", 3, true);
        Animal bird = new Animal("boumzayen", "ziwziw", 2, false);
        Zoo myZoo = new Zoo("Myzoo", "tunis", 30);
        myZoo.addAnimal(dog);*/
        /*System.out.println("tn.esprit.gestionzoo.entities.Zoo Name"+myZoo.name);
        System.out.println(myZoo);
        System.out.println(myZoo.toString());*/


        /*Zoo myZoo2 = new Zoo("Belvedaire", "tunis", 3);
        myZoo2.addAnimal(dog);
        myZoo2.addAnimal(cat);
        myZoo2.addAnimal(dog);*/

        /*myZoo2.removeAnimal(dog);*/


        /*System.out.println(Zoo.comparerZoo(myZoo, myZoo2).getName());
        myZoo2.displayAnimals();
        myZoo2.displayZoo();
        System.out.println(myZoo2.isZooFull());

        int index = myZoo2.searchAnimal(dog);
        System.out.println(myZoo2);*/



        Dolphin dolphin = new Dolphin("dalfoun", "battah", 25);
        Penguin penguin = new Penguin("batri9", 15);
        Penguin penguin2 = new Penguin("batri9_2", 21);
        Penguin penguin3 = new Penguin("batri9_3", 25);


        System.out.println(dolphin.toString());
        System.out.println(penguin.toString());
        Aquatic aquatic = new Aquatic("ssss");

        aquatic.swim();
        dolphin.swim();
        penguin.swim();

        Zoo aquaZoo = new Zoo("belvedaire","tunis",15);
        aquaZoo.addAquaticAnimal(dolphin);
        aquaZoo.addAquaticAnimal(penguin);
        aquaZoo.addAquaticAnimal(penguin2);
        aquaZoo.addAquaticAnimal(penguin3);
        float maximum=aquaZoo.maxPenguinSwimmingDepth();
        System.out.println(maximum);
        aquaZoo.displayNumberByType();

        Aquatic a1 = new Aquatic("Dolphin", 5, "Ocean");
        Aquatic a2 = new Aquatic("Dolphin", 5, "Ocean");



        System.out.println(a1.equals(a2));





    }
}