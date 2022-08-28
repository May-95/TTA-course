public class ReverseString {

	public static void main(String[] args) {

		// Task 1 -- Reversing strings and sentences

		// Part 1:
		// sentence that will be reversed is stored in a String variable.
		String sentence = "are you as excited as I am?";

		// this variable will hold the reversed string.
		String reverseString;

		// removing the question mark so the sentence reads correctly when read
		// backwards. Also, converting all letters to lowercase and making sure the
		// letter "I" when on its own is always capital letter.
		sentence = sentence.substring(0, sentence.length() - 1).toLowerCase().replaceAll(" i ", " I ");

		// splitting the sentence into individual words using space as the splitter.
		// Assigning the result into an array.
		String split[] = sentence.split(" ");

		// for-loop to iterate through the array of words backwards.
		for (int i = split.length - 1; i >= 0; i--) {
			// reverseString variable assigned as an empty variable.
			reverseString = "";

			if (i > 0 && i == split.length - 1) {
				// word added onto reverseString variable with a space after it. For the first
				// word, the first letter is capitalised to make the sentence correct and proper
				// when read backwards.
				reverseString += split[i] + " ";
				reverseString = reverseString.substring(0, 1).toUpperCase() + reverseString.substring(1).toLowerCase();
			} else if (i > 0) {
				reverseString += split[i] + " ";
			} else {
				// last word has a question mark added at the end instead of a space.
				reverseString = reverseString + split[i] + "?";
			}

			// reversed sentence is printed out onto the console.
			System.out.print(reverseString);
		}
		System.out.println();

		// Part 2: reversing words.

		// array of words that will be reversed.
		String[] wordList = { "Stressed", "Parts", "Straw", "Keep", "Wolf" };

		// variable will hold reversed word. No value assigned.
		String reversedWord;

		// for loop that will iterate through array.
		for (int i = 0; i < wordList.length; i++) {
			// assigned an empty value.
			reversedWord = "";
			// for loop that iterates backwards through each letter of the word.
			for (int j = wordList[i].length() - 1; j >= 0; j--) {
				// each letter is added to reversedWord variable backwards.
				reversedWord += wordList[i].charAt(j);
				// making the first letter of each word a capital letter and the rest lower case
				// so it reads properly backwards.
				reversedWord = reversedWord.substring(0, 1).toUpperCase() + reversedWord.substring(1).toLowerCase();
			}
			// reversed word is printed out onto the console.
			System.out.println(reversedWord);
		}
	}
};
