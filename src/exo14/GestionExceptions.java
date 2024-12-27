package exo14;

public class GestionExceptions {

    public static void traiterExceptions(boolean lancerArrayIndexOutOfBounds) {
        int[] tableau = {1, 2, 3};

        if (lancerArrayIndexOutOfBounds) {
            System.out.println(tableau[5]);
        } else {
            String str = null;
            System.out.println(str.length());
        }
    }

    public static void main(String[] args) {
        try {
            traiterExceptions(true);
        } catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
        	System.err.println("Exception capturée : " + e.getClass().getSimpleName() + " - " + e.getMessage());
        }
    }
}
