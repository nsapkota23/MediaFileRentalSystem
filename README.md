# MediaFileRentalSystem


## Overview
The project is a media rental system that takes values from an imported file and stores them in an array. The program offers a menu selection, including options to load a media file, find media values within the file, and check the availability of media for renting. The menu options call corresponding methods to complete the program's functionality.

## Classes
- `Manager`: Manages the media rental system. It includes methods to load media, find media, and check media availability.

- `Media`: A base class for media objects, with attributes such as ID, title, year, chapter, and availability.

- `EBook`: A class that extends `Media` and represents an e-book. It includes methods to set and retrieve e-book information.

## Usage
1. **Load Media Objects**: Load media objects from a file by providing the file path. The program will read the file and populate the list of media objects.

2. **Find Media Objects**: Search for media by title. The program will display the media objects that match the provided title.

3. **Rent Media Objects**: Check if a specific media object is available for rent by providing its ID.
