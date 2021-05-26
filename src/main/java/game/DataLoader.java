package game;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DataLoader<T>  {
	T t;
	
	private FileOutputStream fos;
	
	private FileInputStream fis;
	
	
	
	private File roomFile = new File("rooms.txt");
	
	
	
	public DataLoader() {
	}
	


	public void writeToFile(T t, File file) {
		try {
			
			fos = new FileOutputStream(file);
			
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				
				oos.writeObject(t);
				
				oos.close();
				fos.close();
			} catch (IOException e) {
			
				e.printStackTrace();
				System.out.println("Could not save : " + file + " missing \n in dl class");
				System.out.println(t.toString());

			}
	}
	
	public Object  readFromFile(File file) throws IOException, ClassNotFoundException {
		
		
			fis = new FileInputStream(file);
			
			ObjectInputStream oos = new ObjectInputStream(fis);
			
	
			T t = (T) oos.readObject();
			
		
			return t;
		
		
		
		
	}
	
	
	

}
