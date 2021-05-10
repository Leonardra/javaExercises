package chapterTwo;

import java.util.Scanner;

public class Arithmetic{

	public static void main(String[] args){
		
		Scanner imput = new Scanner(System.in);
		int number1;
		int number2;
		int sum;

		System.out.print("Enter First Number: ");
		number1 =imput.nextInt();


		System.out.print("Enter Second Number: ");
		number2 =imput.nextInt();

		sum = number1 + number2;

		System.out.printf("Sum is %d%n", sum);

}

}