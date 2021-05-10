package chapterTwo;

import java.util.Scanner;

public	class	BitFlipper{

	public	static	void	main(String... args){

	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter a number");

	int userInput = input.nextInt();
			
	
	int outcome1 = 0;
	int outcome2 = 1;
	

	if(userInput == outcome2){
	System.out.println("0");}

	if(userInput != outcome2){
		System.out.println("1");}



	

}

}