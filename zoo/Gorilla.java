package zoo;

public class Gorilla extends Mammal {

	public Gorilla() {
		super();
	}

	public void throwSomething() {
		energyLevel -= 5;
		System.out.println("Lanzando cosas a las personas (-5)");
	}

	public void eatBananas() {
			energyLevel += 10;
		System.out.println("Comiendo banana (+10)");
	}

	public void climb() {
		energyLevel -= 10;
		System.out.println("Trepando a la cima (-10)");
	}

}
