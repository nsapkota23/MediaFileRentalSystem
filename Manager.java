package FinalProject;

/*
 * Name: Neon Sapkota
 * Class: CMIS 242 6384 Intermediate Program
 * Date: 10/11/2022
 * Final Project
 * 
 * In this program I have created a media rental system that will take the values from an imported file and store them in an array. There will be a menu selection that will consist of
 * load media file, find media values within the file, and check to see if said media is available to be rented. The menu options will then call the corresponding methods that are necessary
 * to run that menu option to complete the program.
 * 
 */

//import all the packages used for this class
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//creates a class manager
public class Manager {
	//creates a list of media as an arraylist
	static List<Media> list=new ArrayList<>();;

	//creates a LoadMedia class to populate the data using the path of the file
	public boolean LoadMedia(String path) {
		
		try {
			//create scanners and array to set the data and create media from the file path
			File Media = new File(path);
			Scanner mediaScanner = new Scanner(Media);
		while (mediaScanner.hasNextLine()) {
			String data = mediaScanner.nextLine();
			String[] str = data.split(" ");
			
			//sorts through to see if the media imported is a movie, book, or cd based on the Position of index 0
		if (str[0].equals("EBook")) {
			list.add(new EBook(Integer.parseInt(str[1]), str[2], Integer.parseInt(str[3]),
			Integer.parseInt(str[4]), Boolean.parseBoolean(str[5])));
		}else if(str[0].equals("MusicCD")) {
			list.add(new MusicCD(Integer.parseInt(str[1]), str[2], Integer.parseInt(str[3]),
			Integer.parseInt(str[4]), Boolean.parseBoolean(str[5])));
		}else {
			list.add(new MovieDVD(Integer.parseInt(str[1]), str[2], Integer.parseInt(str[3]),
			Integer.parseInt(str[4]), Boolean.parseBoolean(str[5])));
		}
	}
	//prints the list and uses an exception to say the file doesn't exist
	System.out.println(list);
		return true ;
	} catch (FileNotFoundException e) {
		System.out.println("There file does not exist please try again");
		return false;
	}
	}
	// method for finding certain media using a for loop to iterate through the media and if value at i is equal to the title the it will print the media else will print it doesn't exist in the file
	public void findMedia(String title) {
		for(Media i : list) {
			if(i.getTitle().equals(title))
				System.out.print(i.toString());
			
	
		
		}
	}
	//method to rent the media using for loop and id value to iterate through i and compare it to id if it is equal then the media can be rented out else the media isn't available for rent
	public void rentMedia(int id) {
		for(Media i : list ) {
			if(i.getId()==id) {
				if(i.isAvailable())
				
					System.out.println("The media is available to be rented");
				else
					System.out.println("The media is unavailable at this time ");
			}
		}
	}

}