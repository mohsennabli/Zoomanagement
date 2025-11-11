package tn.esprit.gestionemploye.entities;

import tn.esprit.gestionemploye.interfaces.IDepartement;

import java.util.HashSet;
import java.util.TreeSet;

public class DepartementHashSet implements IDepartement<Departement> {

    private HashSet<Departement> departements = new HashSet<>();

    @Override
    public void ajouterDepartement(Departement t) {
        if (departements.add(t)) {
            System.out.println("Département ajouté : " + t.getNom());
        } else {
            System.out.println("Département déjà existant !");
        }
    }

    @Override
    public boolean rechercherDepartement(String nom) {
        for (Departement d : departements) {
            if (d.getNom().equalsIgnoreCase(nom))
                return true;
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement t) {
        return departements.contains(t);
    }

    @Override
    public void supprimerDepartement(Departement t) {
        if (departements.remove(t)) {
            System.out.println(" Département supprimé : " + t.getNom());
        } else {
            System.out.println("Département introuvable !");
        }
    }

    @Override
    public void displayDepartement() {
        System.out.println("\n Liste des départements :");
        for (Departement d : departements) {
            System.out.println(d);
        }
    }

    @Override
    public TreeSet<Departement> trierDepartementById() {
        TreeSet<Departement> sorted = new TreeSet<>((d1, d2) -> Integer.compare(d1.getId(), d2.getId()));
        sorted.addAll(departements);
        return sorted;
    }
}
