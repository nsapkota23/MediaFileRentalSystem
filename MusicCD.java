package FinalProject;

/*
 * Name: Neon Sapkota
 * Date: 10/11/2022
 * Final Project
 * 
 * In this program I have created a media rental system that will take the values from an imported file and store them in an array. There will be a menu selection that will consist of
 * load media file, find media values within the file, and check to see if said media is available to be rented. The menu options will then call the corresponding methods that are necessary
 * to run that menu option to complete the program.
 * 
 */

//create a class MusicCD that extends media 

public class  MusicCD extends Media {
	// sets parameters for MusicCD and creates an instance
	MusicCD(int id, String title, int year, int chapter, boolean available) {
		super(id, title, year, chapter, available);
	}

	//sets the MusicCD to a string value when data is added
	public String toString() {
		return "EBook [id = " + this.id + " title = " + this.title + " chapter = " + this.chapter + " year = " + this.year
		+ " available = " + this.available + "]\n";	
	}

}
