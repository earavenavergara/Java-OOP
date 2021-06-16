package zoo;

public class Bat extends Mammal {

	public Bat() {
		super();
		energyLevel = 300;
	}

	public void fly() {
		energyLevel -= 50;
		System.out.println("Volando. Zum,zum,zum!!! (-50)");
	}

	public void eatHumans() {
		energyLevel += 25;
		System.out.println("Comiendo humano. Bueno, no importa (+25)");
	}

	public void attacktown() {
		energyLevel -= 100;
		System.out.println("Atacando la ciudad (-100)");
	}

}
