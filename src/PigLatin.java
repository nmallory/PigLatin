import java.util.Scanner;

public class PigLatin {

	public static void main(String[] args) {

		String words = "";
		String yes = "yes";

		System.out.println("Welcome to the Pig Latin Translator!");

		// Create scanner
		Scanner input = new Scanner(System.in);

		do {
			// Prompt the user to enter a line to be translated.
			System.out.println("Enter a line to be translated:");
			words = input.next();
			words = words.toLowerCase();
			
			//If statement to check if word starts with a vowel
			if (words.startsWith("a") || words.startsWith("e") || words.startsWith("i") || words.startsWith("o")
					|| words.startsWith("u")) {
				
			//Concating "way" to end of word entered
				words += "way";

			}
			for (int i = 0; i < words.length(); i++) {
				// Checks to see if first letter is not a vowel
					if (!words.startsWith("a") && !words.startsWith("e") && !words.startsWith("i")
							&& !words.startsWith("o") && !words.startsWith("u")) {

						//CharAt returns first character at a specified index
						char firstChar = words.charAt(0);
						
						//Removes first letter of word entered
						words = words.substring(1);
						
						words = words.substring(0) + firstChar +"ay" ;
	
					} // ends loop for if statement for consonants
						
			} // forloop
			System.out.println(words);
			
			//Ask user if they want to translate another word
			System.out.println("Translate another line? (yes/no): ");

			input.nextLine();
			//Clears out scanner
			input.nextLine();
			
		} while (yes.equalsIgnoreCase("yes"));
	}
}// class
