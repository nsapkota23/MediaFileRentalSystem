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

//create a class media to initialize object variables
public class Media {
//Initialize variable
	int id;
	String title;
	int year, chapter;
	boolean available;


//create media to set parameters for media and set values for id,title,year,chapter, and available
public Media(int id, String title, int year, int chapter, boolean available) {
	this.id = id;
	this.title = title;
	this.year = year;
	this.chapter = chapter;
	this.available = available;
}
//get id
public int getId() {
	return id;
}
// sets the id
public void setId(int id) {
	this.id = id;
}
//get title
public String getTitle() {
	return title;
}
// sets the title
public void setTitle(String title) {
	this.title = title;
}
// gets the year
public int getYear() {
	return year;
}
// sets the year
public void setYear(int year) {
	this.year = year;
}
// gets the chapter
public int getChapter() {
	return chapter;
}
// sets the chapter
public void setChapter(int chapter) {
	this.chapter = chapter;
}
// gets boolean for if media is available
public boolean isAvailable() {
	return available;
}
// sets the boolean
public void setAvailable(boolean available) {
	this.available = available;
}
}
