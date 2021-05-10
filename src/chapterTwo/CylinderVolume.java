package chapterTwo;

import	java.util.Scanner;

public	class	CylinderVolume{

	public	static	void	main(String... args){

		Scanner input = new Scanner(System.in);

	System.out.println("Enter the radius and length of a cylinder. Press enter on your keyboard to continue");
	
	System.out.print("Radius: ");
		double radius = input.nextDouble();
	
	System.out.print("Length: ");
		double length = input.nextDouble();

		double area = radius * radius * Math.PI;

		double volume = area * length;

	
	System.out.println("The  area is " +area);

	System.out.println("The  volume is " +volume);




		
}

}


