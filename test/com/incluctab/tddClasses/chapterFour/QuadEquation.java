package com.incluctab.tddClasses.chapterFour;

import java.util.Scanner;

public class QuadEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("First Input: ");
      int a = input.nextInt();

        System.out.println("Second Input: ");
      int b = input.nextInt();

        System.out.println("Third Input: ");
      int c = input.nextInt();

      double determinant = (b * b) - 4 * a * c;

      if(determinant > 0){
          double root1 = (-b + Math.sqrt(determinant)) / (2 * a);
          System.out.println("Root 1 is "+root1);
          double root2 = (-b - Math.sqrt(determinant)) / (2 * a);
          System.out.println("Root 2 is "+root2);
      }

      if(determinant == 0){
          double root = -b * 1.0 / (2 * a);
          System.out.println("Root is "+root);
      }

      if(determinant < 0){
          System.out.println("There is no root");
      }

    }
}
