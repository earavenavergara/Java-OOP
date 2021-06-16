package omaster;

public class Ninja extends Human {

	public Ninja() {
		super();
		stealth = 10;
	}

	public void steal(Human human) {
		human.health -= this.stealth;
		this.health += this.stealth;
		System.out.println("steal!!");
	}

	public void runAway() {
		this.health -= 10;
		System.out.println("runAway!!");
	}
}
