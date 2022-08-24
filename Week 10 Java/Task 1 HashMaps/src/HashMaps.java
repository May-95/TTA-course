import java.util.HashMap;
import java.util.Scanner;

public class HashMaps {

	public static void main(String[] args) {

		// HashMap object created. It will store String keys that are film titles and String values which is the director's name.
		HashMap<String, String> filmsList = new HashMap<String, String>();

		// adding items to the HashMap using put() method.
		filmsList.put("Doctor Strange in the Multiverse of Madness", "Sam Raimi");
		filmsList.put("Luca", "Enrico Casarosa");
		filmsList.put("Venom", "Ruben Fleischer");
		filmsList.put("About Time", "Richard Curtis");
		filmsList.put("Maleficent", "Robert Stromberg");
		filmsList.put("The Conjuring", "James Wan");
		filmsList.put("Titanic", "James Cameron");
		filmsList.put("Black Panther", "Ryan Coogler");
		filmsList.put("The Lord of the Rings: The Return of the King", "Peter Jackson");

		// using get() method to get HashMap values. Uses key to find its value.
		filmsList.get("Titanic");
		
		// prints out director's name.
		System.out.println(filmsList.get("Titanic")); 

		// key-value pair can be removed using remove() method.
		filmsList.remove("Black Panther");
		
		// null is printed to console as entry has been deleted.
		System.out.println(filmsList.get("Black Panther"));

		// looping through HashMaps
		// loop to find director's name (values)
		for (String director : filmsList.values()) {
			System.out.println(director);
		}
		
		// loop to find film name (key)
		for (String film : filmsList.keySet()) {
			System.out.println(film);
		}

		// loop asking user to add new film titles into the HashMap. 
		String question;
		do {
			Scanner input = new Scanner(System.in);
			
			// user inputs film tile,
			System.out.println("Enter a film title.");
			String inputKey = input.nextLine();
			
			// user inputs director's name
			System.out.println("Enter the director's name");
			String inputValue = input.nextLine();
			
			// user's values are added into the HashMap.
			filmsList.put(inputKey, inputValue);
			
			// print out of HashMap
			System.out.println(filmsList);
			
			// asks user if they want to add another entry.
			System.out.println("Do you want to add another film into the HashMap? enter 'yes' or 'no'?");
			question = input.nextLine().toLowerCase();
			
		} while (question.equals("yes"));
	}
}
