package fixtures;

import java.io.Serializable;

public class Item extends Fixture implements Serializable{
	
	private boolean carriable;

	public Item(String name, String shortDescription, String longDiscription, boolean carriable) {
		super(name, shortDescription, longDiscription);
		// TODO Auto-generated constructor stub
		this.carriable = carriable;
	}

	@Override
	public String toString() {
		return "Item [getName()=" + getName() + ", getShortDescription()=" + getShortDescription()
				+ ", getLongDiscription()=" + getLongDiscription() + ", getClass()=" + getClass() + ", toString()=" + super.toString() + "]";
	}

	public boolean isCarriable() {
		return carriable;
	}

	public void setCarriable(boolean carriable) {
		this.carriable = carriable;
	}

	
}
