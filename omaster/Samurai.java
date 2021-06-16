package omaster;

public class Samurai extends Human {

	public static int numberOfSamurai = 0;

	public Samurai() {
		super();
		health = 200;
		numberOfSamurai++;
	}

	public void deathBlow(Human human) {
		human.health = 0;
		this.health /= 2;
		System.out.println("deathBlow!!");
	}

	public void meditate() {
		this.health += (this.health / 2);
		System.out.println("meditate!!");
	}

	public void howMany() {
		System.out.println("howMany Samurai: " + numberOfSamurai);
	}
}
