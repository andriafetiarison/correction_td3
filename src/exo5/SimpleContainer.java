package Exo5;

class SimpleContainer<T> implements Container<T> {
	private T element;

	@Override
	public void add(T element) {
	   this.element = element;
	}

	@Override
	public T get() {
	   return element;
	}

	@Override
	public String toString() {
	   return "SimpleContainer contient : " + element;
	}

	public static void main(String[] args) {
	   SimpleContainer<Integer> containerInt = new SimpleContainer<>();
	   containerInt.add(42);
	   System.out.println(containerInt);
	   System.out.println("Élément récupéré : " + containerInt.get());
	}
}