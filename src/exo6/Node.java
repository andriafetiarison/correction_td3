package Exo6;

public class Node<T> {
	 private T value;
	 private Node<T> next;

	 public Node(T value) {
	     this.value = value;
	     this.next = null;
	 }

	 public void add(T newValue) {
	     Node<T> current = this;
	
	     while (current.next != null) {
	         current = current.next;
	     }
	
	     // Ajout d'un nouveau nœud à la fin
	     current.next = new Node<>(newValue);
	 }

	  public void display() {
	     Node<T> current = this;
	
	     while (current != null) {
	         System.out.print(current.value + " -> ");
	         current = current.next;
	     }
	
	     System.out.println(".");
	  }

	  public static void main(String[] args) {
	      // Création de la liste chaînée avec des chaînes
	      Node<String> stringHead = new Node<>("Bonjour");
	      stringHead.add("à");
	      stringHead.add("tous");
	
	      System.out.println("Liste chaînée de chaînes :");
	      stringHead.display();
	  }
}