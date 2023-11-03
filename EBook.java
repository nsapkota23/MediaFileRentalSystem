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

// create a class EBooks that extends media 
public class EBook extends Media {
	// sets parameters for EBook and creates an instance
		EBook(int id, String title, int year, int chapter, boolean available) {
			super(id, title, year, chapter, available);
		}

		//sets the EBook to a string value when data is added
		public String toString() {
			return "EBook [id = " + this.id + " title = " + this.title + " chapter = " + this.chapter + " year = " + this.year
					+ " available = " + this.available + "]\n";
		}

		}


