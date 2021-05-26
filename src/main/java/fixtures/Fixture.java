package fixtures;

import java.io.Serializable;

public abstract class Fixture implements Serializable{
	
	private String name;
	private String shortDescription;
	private String longDiscription;
	
	
	public Fixture(String name, String shortDescription, String longDiscription) {
		this.name = name;
		this.shortDescription = shortDescription;
		this.longDiscription = longDiscription;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getShortDescription() {
		return shortDescription;
	}


	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}


	public String getLongDiscription() {
		return longDiscription;
	}


	public void setLongDiscription(String longDiscription) {
		this.longDiscription = longDiscription;
	}





	
	
}
