package omaster;

public class Wizard extends Human {

	public Wizard() {
		super();
		health = 50;
		intelligence = 8;
	}

	public void heal(Human human) {
		human.health += this.intelligence;
		System.out.println("heal!!");
	}

	public void fireBall(Human human) {
		human.health -= this.intelligence * 3;
		System.out.println("fireBall!!");
	}

}
