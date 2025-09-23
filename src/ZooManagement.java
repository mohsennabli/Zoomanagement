import java.util.Scanner;

public class ZooManagement {
    public static void main(String[] args) {
       /* int nbrCages=20;
        String ZooName= "My Zoo";
        System.out.println("Zoo Name: "+ZooName + "nbr Cages: "+nbrCages);
        Scanner input = new Scanner(System.in) ;
        System.out.println("insert zoo name");
        ZooName = input.nextLine();

        System.out.println("insert zoo age");
        nbrCages = input.nextInt();
        System.out.println("Zoo Name: "+ZooName+ " nbr Cages: "+nbrCages);*/

        Animal dog = new Animal("doberman", "daleji", 11, true);
        Animal cat = new Animal("gatt", "bechbech", 3, true);
        Animal bird = new Animal("boumzayen", "ziwziw", 2, false);
        Zoo myZoo = new Zoo("Myzoo", "tunis", 30);
        myZoo.addAnimal(dog);
        /*System.out.println("Zoo Name"+myZoo.name);
        System.out.println(myZoo);
        System.out.println(myZoo.toString());*/


        Zoo myZoo2 = new Zoo("Belvedaire", "tunis", 3);
        myZoo2.addAnimal(dog);
        myZoo2.addAnimal(cat);
        myZoo2.addAnimal(dog);

        /*myZoo2.removeAnimal(dog);*/


        System.out.println(Zoo.comparerZoo(myZoo, myZoo2).name);
        myZoo2.displayAnimals();
        myZoo2.displayZoo();
        System.out.println(myZoo2.isZooFull());

        int index = myZoo2.searchAnimal(dog);
        System.out.println(index);


    }
}