
public class Human {

	protected int intelligence;
	protected int health;
	protected int strength;
	protected int stamina;
	
	public Human() {
		this.intelligence = 3;
		this.health = 100;
		this.strength = 3;
		this.stamina = 3;
	}
	
	public void attackHuman() {
		this.health = this.health - this.strength;
        System.out.println("Ouch, what you do that for?! " + this.health);
	}
}
