package game;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import fixtures.Door;
import fixtures.Item;
import fixtures.Room;

/*
 * need methods to open and close door by player I believe
 */

public class Player implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<Item> inventory;
	private Room currentRoom;
	private Room lastRoom;
	private int health;
	

	private FloorLevel floorLevel;
	
	private static File playerSave = new File("C:\\Users\\qmccl\\Documents\\save.txt");

	public Player() {

		this.inventory = new ArrayList<Item>();
		this.health = 100;

	}
	
	

	public Room getLastRoom() {
		return lastRoom;
	}



	public void setLastRoom(Room lastRoom) {
		this.lastRoom = lastRoom;
	}



	// Add functionality to be able to retrieve items from list
	public List<Item> getInventory() {
		return inventory;
	}

	// Add the ability to check size before continuously adding items
	public void setInventory(Item item) {
		this.inventory.add(item);
	}

	public Room getCurrentRoom() {
		return currentRoom;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public void setCurrentRoom(Room currentRoom) {
		this.currentRoom = currentRoom;
	}

	public FloorLevel getFloorLevel() {
		return floorLevel;
	}

	public void setFloorLevel(FloorLevel floorLevel) {
		this.floorLevel = floorLevel;
	}

	public void addItem(Item item) {
		this.inventory.add(item);
	}
	
	
	

	@SuppressWarnings("resource")
	public void savePlayer() {
		try {
			FileOutputStream  fos = new FileOutputStream(playerSave);
			
			ObjectOutputStream oos = new ObjectOutputStream(fos);
		
			oos.writeObject(this);
			
		}catch(IOException e) {
			
		}
	}
	
	@SuppressWarnings("resource")
	public static Player loadPlayer() {
		
		Player player = null;
		
		try {
		FileInputStream fis = new FileInputStream(playerSave);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		
		player = (Player) ois.readObject();
		}catch(Exception e) {
			
		}
		return player;
	}

	@Override
	public String toString() {
		return "Player [inventory=" + inventory + ", currentRoom=" + currentRoom + ", health=" + health + "]";
	}
	
	

}
