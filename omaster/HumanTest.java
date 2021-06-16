package omaster;

public class HumanTest {

	public static void main(String[] args) {
		Human human = new Human();
		Wizard wisard = new Wizard();
		Ninja ninja = new Ninja();
		Samurai samurai = new Samurai();
		human.attack(human);
		System.out.println("healt human: " + human.getHealth());
		wisard.heal(human);
		System.out.println("healt human: " + human.getHealth());
		wisard.fireBall(human);
		System.out.println("healt human: " + human.getHealth());
		ninja.steal(human);
		System.out.println("healt human: " + human.getHealth());
		System.out.println("healt ninja: " + ninja.getHealth());
		ninja.runAway();
		System.out.println("healt ninja: " + ninja.getHealth());
		samurai.deathBlow(human);
		System.out.println("healt human: " + human.getHealth());
		System.out.println("healt samurai: " + samurai.getHealth());
		samurai.meditate();
		System.out.println("healt samurai: " + samurai.getHealth());
		samurai.howMany();
	}

}
