package chapterTwo;

import java.util.Scanner;

public	class	Guess{

public	static	void	main(String... args){

Scanner input = new Scanner(System.in);

String question = ("Guess the mystery number, Genius:");

int mysterynumber = 67;

System.out.println(question);

int firstuserinput = input.nextInt();

if(firstuserinput == mysterynumber){
System.out.print("correct");} 

if(firstuserinput != mysterynumber) {
if (firstuserinput < mysterynumber)
{System.out.println("Try Again");}
if (firstuserinput > mysterynumber)
{System.out.println("Try Again");}
}

int seconduserinput = input.nextInt();
if(seconduserinput == mysterynumber){
System.out.println("correct");} 
if(seconduserinput != mysterynumber) {
if (seconduserinput < mysterynumber)
{System.out.println("Try Again");}
if (seconduserinput > mysterynumber)
{System.out.println("Try Again");}
}

int thirduserinput = input.nextInt();
if(thirduserinput == mysterynumber){
System.out.println("correct");} 
if(thirduserinput != mysterynumber) {
if (thirduserinput < mysterynumber)
{System.out.println("Try Again");}
if (thirduserinput > mysterynumber)
{System.out.println("Game Over, thanks for trying");}
}

	
}

}