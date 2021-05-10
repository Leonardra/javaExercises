package chapterTwo;

import	java.util.Scanner;

public	class	CelsiusConverter {

	public	static	void	main(String... args){

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a degree in celsius and press enter to convert to Fahrenheit: ");

		int celsius = input.nextInt();			


		double fahrenheit = (9.0/5) * celsius + 32;


		System.out.println("Fahrenheit: " +fahrenheit);

		


}



}