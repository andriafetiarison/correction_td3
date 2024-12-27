package exo15;

//Classe de l'exception personnalisée
class TemperatureException extends Exception {
	 public TemperatureException(String message) {
	     super(message);
	 }
}

public class Temperature {
	
	 public static void verifierTemperature(int temperature) throws TemperatureException {
	     if (temperature < -50 || temperature > 50) {
	         throw new TemperatureException("Température hors de la plage acceptable : " + temperature + "°C");
	     } else {
	         System.out.println("Température " + temperature + "°C est dans la plage acceptable.");
	     }
	 }
	
	 public static void main(String[] args) {
	     int[] temperatures = {30, 60, -60, 20, 40};
	
	     for (int temp : temperatures) {
	         try {
	             verifierTemperature(temp);
	         } catch (TemperatureException e) {
	             System.err.println("Erreur : " + e.getMessage());
	         }
	     }
	 }
}

