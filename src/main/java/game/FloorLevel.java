package game;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import fixtures.Room;

public class FloorLevel implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String floorName;
	private static String[] direction = {"north", "south","east", "west"};
	private Map<String, Room> roomDoors;
	private Map<String, String> floorMap = new HashMap<String, String>();
	private RoomManager rooms;
	private static File floorFile = new File("C:\\Users\\qmccl\\Documents\\floors.txt");
//	private static File floorFile = new File("C:\\Users\\qmccl\\eclipse-workspace\\HomeTouring\\src\\main\\resources");
	
	public FloorLevel(String name) {
		this.floorName = name;
		this.roomDoors = new HashMap<String, Room>();
		rooms = new RoomManager();
	}
	  
	public void createLevel() {
		for(int i =0; i < rooms.getRooms().size(); i++) {
		roomDoors.put(direction[i], rooms.getRoom(i));
		rooms.getRoom(i).setDoors();
		}	
		
	}
	
	public Map<String, String> showMap(){
		for(int i =0; i < rooms.getRooms().size(); i++) {
			floorMap.put(direction[i], rooms.getRoom(i).getName());
			rooms.getRoom(i).setDoors();
			}
		return floorMap;
	}
	
	public Room changeRooms(String direction) {
		
		if(roomDoors.containsKey(direction)) {
			Room room =roomDoors.get(direction);
			rooms.setCurrentRoom(room);
			return room;
		}
		
		return rooms.getCurrentRoom();
		
	}
	
	
	
	public static String checkDirection(String input){
		
		if(input.length()>0) {
			for(int i=0; i<= direction.length; i++) {
				
				if(input.toLowerCase().trim().equals(direction[i])) {
					return direction[i];
				}
			}
		}
		
		return "Not a valid direction";
	}
		
	
	
	public static void saveFloor(FloorLevel level) {
		floorFile.setReadable(true, true);
try {
			
			FileOutputStream	fos = new FileOutputStream(floorFile);
			
				
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				
				//dl.writeToFile(level, floorFile);
				
				oos.writeObject(level);
				
			oos.close();
			fos.close();
				System.out.println("Saved and Closed");
			} catch (IOException e) {
			
				//e.printStackTrace();
				System.out.println("Could not save : " + floorFile + " missing \n");
				//System.out.println(this.toString());

			}
		
	}

	public static FloorLevel loadFloor()  {
		FloorLevel level = null;
		
		
		try {
			FileInputStream	fis = new FileInputStream(floorFile);
	
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		
	
		
		level = (FloorLevel) ois.readObject();
		
		System.out.println("Read object");
		
		System.out.println(level.toString()+ "1st time");
		
		ois.close();
		fis.close();
	
		} catch (ClassNotFoundException |IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//System.out.println(level.toString());
		}
		
		//System.out.println(level.toString());
		
		return level;
		}
	


	public String getFloorName() {
		return floorName;
	}


	public void setFloorName(String floorName) {
		this.floorName = floorName;
	}
	
	public void setRoomDoors() {
		for(int i=0; i<rooms.getRooms().size(); i++) {
			Room room = rooms.getRoom(i);
			
			roomDoors.put(direction[i], room);
			
		}
		
		System.out.println("Rooms Loaded on Floor...") ;
		//System.out.println(roomDoors.toString());
	}





	public RoomManager getRooms() {
		return rooms;
	}


	public void setRooms(RoomManager rooms) {
		this.rooms = rooms;
	}
	
	public String getRoominfo() { // may need to change
		return rooms.getCurrentRoom().toString();
	}

	@Override
	public String toString() {
		return "FloorLevel [floorName=" + floorName + ", roomDoors=" + roomDoors + ", rooms=" + rooms + "]";
	}


	
	
}
