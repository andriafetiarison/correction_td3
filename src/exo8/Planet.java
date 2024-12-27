package exo8;

public enum Planet {
	 MERCURY(3.30e23, 2.4397e6),
	 VENUS(4.87e24, 6.0518e6),
	 EARTH(5.97e24, 6.371e6),
	 MARS(6.42e23, 3.3895e6),
	 JUPITER(1.90e27, 6.9911e7),
	 SATURN(5.68e26, 5.8232e7),
	 URANUS(8.68e25, 2.5362e7),
	 NEPTUNE(1.02e26, 2.4622e7);

	 private final double masse;
	 private final double radius;
	 private static final double G = 6.67430e-11;

	 Planet(double masse, double radius) {
	     this.masse = masse;
	     this.radius = radius;
	 }

	 public double getMasse() {
	     return masse;
	 }

	 public double getRadius() {
	     return radius;
	 }

	 // Méthode pour calculer la gravité à la surface de la planète
	 public double surfaceGravity() {
	     return G * masse / (radius * radius);
	 }

	 @Override
	 public String toString() {
	     return this.name() + " : Masse = " + masse + " kg, Rayon = " + radius + " m, Gravité = " + surfaceGravity() + " m/s²";
	 }
 
	 public static void main(String[] args) {
	     System.out.println("Planètes du système solaire :\n");
	
	     for (Planet planet : Planet.values()) {
	         System.out.println(planet);
	     }
	 }
}
