package game;

import java.io.File;
import java.util.Scanner;

import fixtures.Room;

public class Main {
	
	private static FloorLevel floor = new FloorLevel("Level1");
	private static Player player1 = new Player();

	public static void runTour() {
		floor.getRooms().init();
		
		System.out.println("Loaded room Manager");
		
		floor.createLevel();
		
		System.out.println(floor.getRooms().getRooms());
		
		System.out.println("Your current room: \n"+floor.getRoominfo().toString());
		
		System.out.println("Filled map in floor manager with rooms");
		
		System.out.println("Getting floor info");
		
		System.out.println(floor.showMap());
		
		System.out.println("Please Enter direction to go");
		
		String[] movement =collectInput();
		
		parse(movement, player1);
		
		System.out.println("Got user input");
		
		System.out.println(player1.getLastRoom());
		
		System.out.println(player1.getCurrentRoom());
		
		System.out.println("Moving player");
		
		
		
		
	}
	public static void printRoom(Player player) {
		
		player.getCurrentRoom();
		
	}
	
	public static String[] collectInput() {
		
		
		
		Scanner scanner = new Scanner(System.in);
		String input = "";
		
		
			
			input = scanner.next();
			
		
		
		input = input.toLowerCase().trim();
		System.out.println(input);
		
		scanner.close();
		
		String[] action = input.split(" ");
		
		return action;
		
	}
	
	public static void  parse(String[] action, Player player) {
			System.out.println("Inside parse method");
		String direction = null;
		
		
		
			direction = action[0];
			
			player.setLastRoom(floor.getRooms().getCurrentRoom());
			
			player.setCurrentRoom(floor.changeRooms(direction));
			
			
			
			System.out.println("Method working");
		

			System.out.println("==========================");
		
		System.out.println("You try to move: " + direction);
		

		System.out.println("==========================");
		
		System.out.println("You are in room: " + player.getCurrentRoom().getShortDescription());
		
		System.out.println("==========================");
		
		System.out.println("You left romm: " + player.getLastRoom().getShortDescription());
		
		
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		
		
		Main.runTour();
		
		/*FloorLevel floor1 = new FloorLevel("Level 1");
		
		Player player1 = new Player();
		
		player1.setFloorLevel(floor1);
		
		player1.getFloorLevel().getRooms().init();
		
		
		
	//System.out.println(player1.getFloorLevel().getRoominfo());
	

	player1.getFloorLevel().setRoomDoors();
	
	//System.out.println(player1.getFloorLevel().getRoomDoors());
	
	System.out.println("=======1  \n");
	
	player1.setCurrentRoom(player1.getFloorLevel().getRooms().getCurrentRoom());
	
	player1.getFloorLevel().getRooms().getCurrentRoom().setDoors();
	
	System.out.println(player1.getFloorLevel().getRooms().getRooms());
	
	System.out.println("=========2 \n");
	
	 File floorFile = new File("C:\\Users\\qmccl\\Documents\\floors.txt");
	 
	 
	
	System.out.println("==================== "); 
		
		try {
			
			FloorLevel level = new FloorLevel("");
			
			level.createLevel();
			
			level.toString();
			
		//	FloorLevel.saveFloor(floor1);
			System.out.println("==================saving floor");
			
		//	FloorLevel floor = FloorLevel.loadFloor();
			
		//	System.out.println(floor.toString());
			
		//	System.out.println(floor.getRoomDoors());
			System.out.println("==================loaded floor");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Player Trials");
		
		try {
			player1.savePlayer();
				System.out.println("==================saving player");
				
				Player player2 = Player.loadPlayer();
				
				System.out.println(player2.toString());
				
				System.out.println("==================loaded player");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		try {
			
			System.out.println("==================saving floor");
			player1.getCurrentRoom().saveRoom(player1.getCurrentRoom());
			Room room = Room.loadRooms();
			
			System.out.println(room.toString());
			
			System.out.println("==================loaded floor");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Player Trials");
		
		
		
		
		System.out.println("finished");
*/}
}