package exo3;

public class Pair<T, U> {
	 private T objet1;
	 private U objet2;
	
	 public Pair(T objet1, U objet2) {
	     this.objet1 = objet1;
	     this.objet2 = objet2;
	 }
	
	 public T getObjet1() {
	     return objet1;
	 }

	 public U getObjet2() {
	     return objet2;
	 }

	 @Override
	 public String toString() {
	     return "Pair [Premier: " + objet1 + ", Deuxième: " + objet2 + "]";
	 }

	 public static void main(String[] args) {
	     Pair<Integer, String> pair1 = new Pair<>(1, "Un");
	     System.out.println(pair1);
	     System.out.println("First: " + pair1.getObjet1());
	     System.out.println("Second: " + pair1.getObjet2());
	 }
}
