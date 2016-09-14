import java.util.Scanner;

public class PigLatin {
	
	//Method to check for vowels
			public static void AVowel(){
			
			String words = "";
			//char[] vowelArray = {'a', 'e', 'i', 'o', 'u'};
			if(words.startsWith("a") || words.startsWith("e")|| words.startsWith("i")|| words.startsWith("o")|| words.startsWith("u")){
				}else{
				
								
			}
		}

	public static void main(String[] args) {

		String words;
		String yes = "";
		
		System.out.println("Welcome to the Pig Latin Translator!");
		
		do{
		//Create scanner
		Scanner input = new Scanner(System.in);
		
		//Prompt the user to enter a line to be translated.
		System.out.println("Enter a line to be translated:");
		words = input.next();
		System.out.println(words.toLowerCase());
		words = words.concat("way");
		System.out.println(words.toLowerCase());
		
		//Ask user if they want to translate another line
		System.out.println("Translate another line? (y/n): ");
	
			yes = input.nextLine();	
			yes = input.nextLine();
		}
			while(yes.equalsIgnoreCase ("y"));
	}
	
}


