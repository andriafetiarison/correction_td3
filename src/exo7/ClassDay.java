package exo7;

public class ClassDay {
	public enum Day {
		LUNDI, MARDI, MERCREDI, JEUDI, VENDREDI, SAMEDI, DIMANCHE
	}
	
	 public static void main(String[] args) {
	     for (Day day : Day.values()) {
	         System.out.println("Jour : " + day);
	         afficherMessage(day);
	     }
	 }

	 public static void afficherMessage(Day day) {
	     switch (day) {
	         case LUNDI:
	             System.out.println("Commencez la semaine avec énergie !");
	             break;
	         case MARDI:
	             System.out.println("C'est mardi, continuons à avancer !");
	             break;
	         case MERCREDI:
	             System.out.println("Nous sommes au milieu de la semaine, courage !");
	             break;
	         case JEUDI:
	             System.out.println("C'est jeudi, presque la fin de la semaine !");
	             break;
	         case VENDREDI:
	             System.out.println("Vendredi, le week-end est proche !");
	             break;
	         case SAMEDI:
	             System.out.println("Samedi, profitez du week-end !");
	             break;
	         case DIMANCHE:
	             System.out.println("Dimanche, reposez-vous pour une nouvelle semaine !");
	             break;
	         default:
	             System.out.println("Jour inconnu.");
	             break;
	     }
	     System.out.println();
	 }
	}

