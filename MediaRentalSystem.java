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


import java.util.Scanner;

//class media rental system
public class MediaRentalSystem {

	public static void main(String[] args) {
		//create a new scanner media
		Scanner media = new Scanner(System.in);
		//while loop to run menu until exit is selected
		while (Menu()) {
			//set selection value and print selection and create new manager instance
			int selection = 0;
			System.out.println("Enter choice");
			selection = media.nextInt();
			Manager directory = new Manager();
		
			
			System.out.println("Enter a choice.");
			
		//series of if statements that run corresponding methods from manager based on value of selection
		if(selection==1) {
			System.out.println("Enter file path load media ");
			String path=media.next();
			directory.LoadMedia(path);
			}
		
		if(selection==2) {
			System.out.println("Enter media title ");
			String title=media.next();
			directory.findMedia(title);
			}
		
		if(selection==3) {
			System.out.println("Enter media id :");
			int id =media.nextInt();
			directory.rentMedia(id);
			}
		
		if(selection==9) {
			System.exit(0);
			}
			}
		
		}
		// menu method that prints the selection screen
		private static boolean Menu() {
			System.out.println("Welcome to media rental system");
			System.out.println("1: Load Media objects ");
			System.out.println("2: Find Media objects ");
			System.out.println("3: Rent Media objects ");
			System.out.println("9: exit ");
			return true;
		}
	}
