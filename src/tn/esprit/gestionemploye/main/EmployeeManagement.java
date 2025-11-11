package tn.esprit.gestionemploye.main;
import tn.esprit.gestionemploye.entities.Employe;
import tn.esprit.gestionemploye.entities.SocieteArrayList;
public class EmployeeManagement {
    public static void main(String[] args) {


        SocieteArrayList societe = new SocieteArrayList();

        Employe e1 = new Employe(1, "Nabli", "Mohsen", "IT", 3);
        Employe e2 = new Employe(2, "Ben Salem", "Amine", "RH", 2);
        Employe e3 = new Employe(3, "Trabelsi", "Sami", "IT", 1);
        Employe e4 = new Employe(4, "Nabli", "Houssem", "Finance", 4);

        // Ajout
        societe.ajouterEmploye(e1);
        societe.ajouterEmploye(e2);
        societe.ajouterEmploye(e3);
        societe.ajouterEmploye(e4);

        // Affichage
        societe.displayEmploye();

        // Recherche
        System.out.println("Recherche par nom 'Nabli' : " + societe.rechercherEmploye("Nabli"));
        System.out.println("Recherche par objet e2 : " + societe.rechercherEmploye(e2));

        // Suppression
        societe.supprimerEmploye(e3);
        societe.displayEmploye();

        // Tri par ID
        societe.trierEmployeParId();
        societe.displayEmploye();

        // Tri par Département + Grade
        societe.trierEmployeParNomDépartementEtGrade();
        societe.displayEmploye();
    }


}