# MediaFileRentalSystem


## Overview
The project is a media rental system that takes values from an imported file and stores them in an array. The program offers a menu selection, including options to load a media file, find media values within the file, and check the availability of media for renting. The menu options call corresponding methods to complete the program's functionality.

## Classes

### `Manager`
The `Manager` class is responsible for managing the media rental system. It includes methods to load media from a file, find media by title, and check the availability of media for rent.

### `Media`
The `Media` class serves as a base class for various media objects in the system. It contains attributes such as ID, title, year, chapter, and availability.

### `EBook`
The `EBook` class is a subclass of `Media` and represents e-books. It includes methods to set and retrieve e-book information.

### `MusicCD`
The `MusicCD` class is a subclass of `Media` and represents music CDs. It includes methods to set and retrieve information about music CDs.

### `MovieDVD`
The `MovieDVD` class is a subclass of `Media` and represents movie DVDs. It includes methods to set and retrieve information about movie DVDs.

## Usage
1. **Load Media Objects**: Load media objects from a file by providing the file path. The program will read the file and populate the list of media objects.

2. **Find Media Objects**: Search for media by title. The program will display the media objects that match the provided title.

3. **Rent Media Objects**: Check if a specific media object is available for rent by providing its ID.
