package exo11;

public class Main {
    public static double diviser(double numerateur, double diviseur) {
        if (diviseur == 0) {
            throw new ArithmeticException("Division par zéro n'est pas autorisée.");
        }
        return numerateur / diviseur;
    }

    public static void main(String[] args) {
        double numerateur = 10;
        double diviseur = 0;

        try {
            double resultat = diviser(numerateur, diviseur);
            System.out.println("Résultat : " + resultat);
        } catch (ArithmeticException e) {
            System.err.println("Erreur : " + e.getMessage());
        }

        diviseur = 5;
        try {
            double resultat = diviser(numerateur, diviseur);
            System.out.println("Résultat : " + resultat);
        } catch (ArithmeticException e) {
            System.err.println("Erreur : " + e.getMessage());
        }
    }
}

