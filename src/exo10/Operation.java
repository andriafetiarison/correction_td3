package exo10;

public enum Operation {
	 ADDITION {
	     @Override
	     public double apply(double x, double y) {
	         return x + y;
	     }
	 },
	 SOUSTRACTION {
	     @Override
	     public double apply(double x, double y) {
	         return x - y;
	     }
	 },
	 MULTIPLICATION {
	     @Override
	     public double apply(double x, double y) {
	         return x * y;
	     }
	 },
	 DIVISION {
	     @Override
	     public double apply(double x, double y) {
	         if (y == 0) {
	             throw new ArithmeticException("Division par zéro non autorisée");
	         }
	         return x / y;
	     }
	 };

	public abstract double apply(double x, double y);

	 public static void main(String[] args) {
	     double a = 10;
	     double b = 5;
	
	     for (Operation op : Operation.values()) {
	         System.out.println(op.name() + " : " + a + " et " + b + " = " + op.apply(a, b));
	     }
	 }
}

