import java.util.Scanner;

public class PigLatin {

	public static void main(String[] args) {
		
		String words;
		String yes = "";
		
		System.out.println("Welcome to the Pig Latin Translator!");
		
		do{
		//Create scanner
		Scanner input = new Scanner(System.in);
		
		//Prompt the user to enter a line to be translated.
		System.out.println("Enter a line to be translated: this sentence exists here: ");
		words = input.next();
		
		//Ask user if they want to translate another line
		System.out.println("Translate another line? (y/n): ");
	
			yes = input.nextLine();	
			yes = input.nextLine();
		}
			while(yes.equalsIgnoreCase ("y"));
	}
	
}


