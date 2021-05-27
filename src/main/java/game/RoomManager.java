package game;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import fixtures.Door;
import fixtures.Room;

public class RoomManager implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Room startingRoom; 
	private Room currentRoom;
	private List <Room> rooms; 
	
	
	
//	private List<Door> exits;
	
	
	
	public RoomManager() {
	    rooms = new ArrayList<Room>();
	   // exits = new ArrayList<Door>();
	}
	
	public void init() {
	    Room foyer = new Room(
	    		"The Foyer",
	    		"a small foyer",
	    		"The small entryway of a neo-colonial house. A dining room is open to the south, where a large table can be seen." + "\n"
	    		+ "The hardwood floor leads west into doorway, next to a staircase that leads up to a second floor." + "\n"
	    		+ "To the north is a small room, where you can see a piano.",4,4);
	    	
	    Room kitchen = new Room(
	    		"The Kitchen",
	    		"a small foyer",
	    		"The small entryway of a neo-colonial house. A dining room is open to the south, where a large table can be seen." + "\n"
	    		+ "The hardwood floor leads west into doorway, next to a staircase that leads up to a second floor." + "\n"
	    		+ "To the north is a small room, where you can see a piano.",4,4);
	
	    Room backroom = new Room(
	    		"The Backroom",
	    		"a small foyer",
	    		"The small entryway of a neo-colonial house. A dining room is open to the south, where a large table can be seen." + "\n"
	    		+ "The hardwood floor leads west into doorway, next to a staircase that leads up to a second floor." + "\n"
	    		+ "To the north is a small room, where you can see a piano.",4,4);
	    
	    Room bedroom = new Room(
	    		"Bedroom",
	    		"a small foyer",
	    		"The small entryway of a neo-colonial house. A dining room is open to the south, where a large table can be seen." + "\n"
	    		+ "The hardwood floor leads west into doorway, next to a staircase that leads up to a second floor." + "\n"
	    		+ "To the north is a small room, where you can see a piano.",4,4);
	    
	    
	    
	    //this.rooms[0] = foyer;
	            this.startingRoom = foyer;
	            this.setCurrentRoom(bedroom);
	            addRooms(foyer);
	            addRooms(kitchen);
	            addRooms(backroom);
	            addRooms(bedroom);
	            

	}
	
	
	
	
	
	public Room getCurrentRoom() {
		return currentRoom;
	}

	public void setCurrentRoom(Room currentRoom) {
		this.currentRoom = currentRoom;
	}

	public void addRooms(Room room) {
		rooms.add(room);
		
	}


	public void removeRoom(Room room) {
		rooms.remove(rooms.indexOf(room));
	}
	
	
	public Room getRoom(int i) {
		
		return rooms.get(i);
		
	}
	

	public List<Room> getRooms() {
		return rooms;
	}

	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}

	public Room getStartingRoom() {
		return startingRoom;
	}

	public void setStartingRoom(Room startingRoom) {
		this.startingRoom = startingRoom;
	}




	
	
}
