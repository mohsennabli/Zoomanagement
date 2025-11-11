package tn.esprit.gestionemploye.main;

import tn.esprit.gestionemploye.entities.Employe;
import tn.esprit.gestionemploye.entities.Departement;
import tn.esprit.gestionemploye.entities.SocieteArrayList;
import tn.esprit.gestionemploye.entities.DepartementHashSet;

public class EmployeeManagement {
    public static void main(String[] args) {


        SocieteArrayList societe = new SocieteArrayList();

        Employe e1 = new Employe(1, "Nabli", "Mohsen", "IT", 3);
        Employe e2 = new Employe(2, "Ben Salem", "Amine", "RH", 2);
        Employe e3 = new Employe(3, "Trabelsi", "Sami", "IT", 1);
        Employe e4 = new Employe(4, "Nabli", "Houssem", "Finance", 4);

        societe.ajouterEmploye(e1);
        societe.ajouterEmploye(e2);
        societe.ajouterEmploye(e3);
        societe.ajouterEmploye(e4);

        societe.displayEmploye();

        System.out.println("\nRecherche par nom 'Nabli' : " + societe.rechercherEmploye("Nabli"));
        System.out.println("Recherche par objet e2 : " + societe.rechercherEmploye(e2));

        System.out.println("\nSuppression de e3...");
        societe.supprimerEmploye(e3);
        societe.displayEmploye();

        System.out.println("\nTri par ID :");
        societe.trierEmployeParId();
        societe.displayEmploye();

        System.out.println("\nTri par Département + Grade :");
        societe.trierEmployeParNomDépartementEtGrade();
        societe.displayEmploye();



        DepartementHashSet gestionDep = new DepartementHashSet();

        Departement d1 = new Departement(1, "Informatique", 10);
        Departement d2 = new Departement(2, "Comptabilité", 5);
        Departement d3 = new Departement(3, "Ressources Humaines", 8);
        Departement d4 = new Departement(1, "Informatique", 10);

        gestionDep.ajouterDepartement(d1);
        gestionDep.ajouterDepartement(d2);
        gestionDep.ajouterDepartement(d3);
        gestionDep.ajouterDepartement(d4);

        gestionDep.displayDepartement();

        System.out.println("\nRecherche du département 'Comptabilité' : "
                + gestionDep.rechercherDepartement("Comptabilité"));

        System.out.println("\nSuppression du département 'Comptabilité'...");
        gestionDep.supprimerDepartement(d2);
        gestionDep.displayDepartement();

        System.out.println("\nDépartements triés par ID :");
        System.out.println(gestionDep.trierDepartementById());
    }
}
