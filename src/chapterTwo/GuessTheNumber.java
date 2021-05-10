package chapterTwo;

import java.util.Scanner;

public	class	GuessTheNumber{

	public	static	void	main(String... args){

		Scanner input = new Scanner(System.in);

		String question = ("Guess the mystery number, Genius:");

		int mysteryNumber = 67;

		
	System.out.println(question);

		int firstUserInput = input.nextInt();

		if(firstUserInput == mysteryNumber){
			System.out.println("correct maestro");
			System.exit(1);
			} 
		else if(firstUserInput != mysteryNumber)
			{System.out.println("Duh...Try again");}

	System.out.println(question);

		int secondUserInput = input.nextInt();

		if(secondUserInput == mysteryNumber){
			System.out.println("correct");
			System.exit(1);
			} 
		else if(secondUserInput != mysteryNumber)
			{System.out.println("Try Again");}

	System.out.println(question);

		int thirdUserInput = input.nextInt();

		if(thirdUserInput == mysteryNumber){
			System.out.println("correct");
			} 
		else if(thirdUserInput != mysteryNumber)
			{System.out.println("Game Over, thanks for trying");}

	



	}

}