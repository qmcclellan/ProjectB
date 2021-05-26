package fixtures;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Room extends Fixture implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Map<String, Door> doors;
	private String[] direction = {"North", "West", "South","East"};
	private Door[] door;
	private Item[] items;
	
	private static File roomFile = new File("C:\\Users\\qmccl\\Documents\\room.txt");
	
	
	public Room(String name, String shortDescription, String longDiscription, int doors, int items) {
		super(name, shortDescription, longDiscription);
	
		this.door = new Door[doors];
		this.doors = new HashMap<String, Door>();
		this.items = new Item[items];
	}

		public Map<String, Door> getDoors() {
		return doors;
	}

	public void setDoors() {
		
		for(int i=0; i< door.length; i++) {
			doors.put(direction[i], door[i] = new Door("Closet"));
		}
		
	}
	
	
public void saveRoom(Room room) {
	
	try {
		FileOutputStream fos = new FileOutputStream(roomFile);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(room);
	}catch(IOException e) {
		
	}
}


public static Room loadRooms() {
	
		Room room = null;
	try {
		FileInputStream fis = new FileInputStream(roomFile);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		
		room = (Room) ois.readObject();
		
		
		
	}catch(IOException | ClassNotFoundException e) {
		
	}
	return room; 
}

@Override
public String toString() {
	return "Room [getName()=" + getName() + "\n, getShortDescription()=" + getShortDescription()
			+ "\n, getLongDiscription()=" + getLongDiscription() + "]";
}











	
	

}
