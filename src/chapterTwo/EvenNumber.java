package chapterTwo;

import java.util.Scanner;

public class EvenNumber{

	public	static	void	main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter any integer and let's determine if it's odd or even number: ");

		int userInput = input.nextInt();
		
		if(userInput % 2==0){
		System.out.println("Even Number");
		}

		else if(userInput % 2!=0){
		System.out.println("Odd Number");
		}


}

}