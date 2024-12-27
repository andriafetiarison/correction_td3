package exo4;

import java.util.List;

public class Classe {

    public static <T extends Number> double calculerSomme(List<T> nombres) {
        double somme = 0.0;

        for (T nombre : nombres) {
            somme += nombre.doubleValue();
        }
        return somme;
    }

    public static void main(String[] args) {
        List<Integer> listeEntiers = List.of(1, 2, 3, 4, 5);
        System.out.println("Somme des entiers : " + calculerSomme(listeEntiers));
    }
}

