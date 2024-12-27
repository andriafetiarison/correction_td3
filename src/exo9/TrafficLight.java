package exo9;

public enum TrafficLight {
	 RED(60),
	 GREEN(45),
	 ORANGE(5);

	private final int duration;

	 TrafficLight(int duration) {
	     this.duration = duration;
	 }

	 public int getDuration() {
	     return duration;
	 }

	  public TrafficLight getNextLight() {
	     switch (this) {
	         case RED:
	             return GREEN;
	         case GREEN:
	             return ORANGE;
	         case ORANGE:
	             return RED;
	         default:
	             throw new IllegalStateException("État inconnu : " + this);
	     }
	 }

	  public static void main(String[] args) {
	     TrafficLight currentLight = RED;
	
	     for (int i = 0; i < 6; i++) {
	         System.out.println("Feu actuel : " + currentLight + " (Durée : " + currentLight.getDuration() + " secondes)");
	         currentLight = currentLight.getNextLight();
	     }
	 }
}

