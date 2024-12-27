package exo2;

public class Box<T> {
	private T objet;

	public Box(T objet) {
	     this.objet = objet;
	 }

	 public T getObjet() {
	     return objet;
	 }

	 public void setObjet(T objet) {
	     this.objet = objet;
	 }

	 @Override
	 public String toString() {
	     return "Box contient : " + objet.toString();
	 }

 
	 public static void main(String[] args) {
	     // Exemple 1
	     Box<Integer> boxInt = new Box<>(42);
	     System.out.println(boxInt);
	     System.out.println("Valeur actuelle : " + boxInt.getObjet());
	     boxInt.setObjet(100);
	     System.out.println("Nouvelle valeur : " + boxInt);
	
	     // Exemple 2
	     Box<String> boxStr = new Box<>("Bonjour");
	     System.out.println(boxStr);
	     System.out.println("Valeur actuelle : " + boxStr.getObjet());
	     boxStr.setObjet("Au revoir");
	     System.out.println("Nouvelle valeur : " + boxStr);
	 }
}
