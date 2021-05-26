package fixtures;

import java.io.Serializable;

public class Weapon extends Item implements Serializable{
	
	private int strength;
	private int health;
	
	
	public Weapon(String name, String shortDescription, String longDiscription, boolean carriable, int strength,
			int health) {
		super(name, shortDescription, longDiscription, carriable);
		this.strength = strength;
		this.health = health;
	}


	public int getStrength() {
		return strength;
	}


	public void setStrength(int strength) {
		this.strength = strength;
	}


	public int getHealth() {
		return health;
	}


	public void setHealth(int health) {
		this.health = health;
	}


	@Override
	public String toString() {
		return "Weapon [strength=" + strength + ", health=" + health + ", isCarriable()=" + isCarriable()
				+ ", getName()=" + getName() + ", getShortDescription()=" + getShortDescription()
				+ ", getLongDiscription()=" + getLongDiscription() + ", getClass()=" + getClass() + "]";
	}

	

}
