package exo1;

public class MethodeGenerique {
	
	public static <T> void afficherElements(T[] tableau) {
        for (T element : tableau) {
            System.out.println(element);
        }
    }
	
	public static void main(String[] args) {
		Integer[] nombres = {1, 2, 3, 4, 5};
        System.out.println("Affichage des nombres :");
        afficherElements(nombres);
	}

}
