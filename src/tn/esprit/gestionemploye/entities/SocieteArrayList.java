package tn.esprit.gestionemploye.entities;

import tn.esprit.gestionemploye.entities.Employe;
import tn.esprit.gestionemploye.interfaces.IGestion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SocieteArrayList implements IGestion<Employe> {

    private List<Employe> employes = new ArrayList<>();

    @Override
    public void ajouterEmploye(Employe e) {
        employes.add(e);
        System.out.println("Employé ajouté : " + e.getNom());
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for (Employe e : employes) {
            if (e.getNom().equalsIgnoreCase(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employe e) {
        return employes.contains(e);
    }

    @Override
    public void supprimerEmploye(Employe e) {
        if (employes.remove(e)) {
            System.out.println("Employé supprimé : " + e.getNom());
        } else {
            System.out.println("Employé introuvable : " + e.getNom());
        }
    }

    @Override
    public void displayEmploye() {
        System.out.println("📋 Liste des employés :");
        for (Employe e : employes) {
            System.out.println(e);
        }
    }

    // 🔹 Tri par ID (Comparable via lambda)
    @Override
    public void trierEmployeParId() {
        employes.sort(Comparator.comparingInt(Employe::getId));
        System.out.println("Employés triés par ID.");
    }

    // 🔹 Tri par Nom de département puis Grade
    @Override
    public void trierEmployeParNomDépartementEtGrade() {
        employes.sort(Comparator
                .comparing(Employe::getNomDepartement)
                .thenComparing(Employe::getGrade));
        System.out.println("Employés triés par Département puis Grade.");
    }
}
