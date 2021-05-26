package fixtures;

import java.io.Serializable;

public class Door implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private boolean isOpen;
	private String type;
	private boolean locked;
	private boolean isExit;

	public Door(String type) {
		this.isOpen = false;
		this.type = type;
	}

	
	public void doorState(boolean state) {

		if (state == true) {
			this.isOpen = true;
		}
		this.isOpen = false;
	}
	

	public boolean isExit() {
		return isExit;
	}


	public void setExit(boolean isExit) {
		this.isExit = isExit;
	}


	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isOpen() {
		return isOpen;
	}

	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}

	public boolean isLocked() {
		return locked;
	}

	public void setLocked(boolean locked) {
		this.locked = locked;
	}


	@Override
	public String toString() {
		return "Door [isOpen=" + isOpen + ", type=" + type + ", locked=" + locked + ", isExit=" + isExit + "]";
	}
	
	

	
}
