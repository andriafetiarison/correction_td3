package exo12;

import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class GestionFichiers {

    public static void lireFichier(String nomFichier) throws FileNotFoundException {
        FileReader fileReader = new FileReader(new File(nomFichier));
        System.out.println("Le fichier " + nomFichier + " a été ouvert avec succès.");
    }

    public static void main(String[] args) {
        String fichier = "exemple.txt";

        try {
            lireFichier(fichier);
        } catch (FileNotFoundException e) {
            System.err.println("Erreur : Le fichier " + fichier + " est introuvable.");
        }

        fichier = "fichier_inexistant.txt";
        try {
            lireFichier(fichier);
        } catch (FileNotFoundException e) {
            System.err.println("Erreur : Le fichier " + fichier + " est introuvable.");
        }
    }
}
