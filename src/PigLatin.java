import java.util.Scanner;

public class PigLatin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String words;
		String yes = "";
		
		System.out.println("Welcome to the Pig Latin Translator!");
		
		//Create scanner
		Scanner input = new Scanner(System.in);
		
		//Prompt the user to enter a line to be translated.
		System.out.println("Enter a line to be translated: this sentence exists here: ");
		words = input.next();
		
		//Ask user if they want to translate another line
		System.out.println("Translate another line? (y/n): ");
		while(yes.equalsIgnoreCase ("y")){
			yes = input.nextLine();	
			yes = input.nextLine();
		}
		
	}

}
