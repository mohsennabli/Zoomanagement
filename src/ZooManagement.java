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

        Zoo myZoo = new Zoo("Myzoo", "tunis", 30);

        System.out.println("Zoo Name"+zoo.name);
        System.out.println(myZoo);
        System.out.println(myZoo.toString());



    }
}