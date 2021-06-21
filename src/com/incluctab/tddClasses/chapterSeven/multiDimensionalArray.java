package com.incluctab.tddClasses.chapterSeven;

public class multiDimensionalArray {
    public static void main(String[] args) {
        int[][] arrayMatrix = {{2,3,5}, {0,5,9}, {1,2,1}};

        int counter = 0;

        while(counter < arrayMatrix.length){
            int innerCounter = 0;
            while (innerCounter <= arrayMatrix[counter].length - 1) {
                System.out.print(arrayMatrix [counter][innerCounter]);
                System.out.print(" ");
                innerCounter++;
            }
            System.out.println();
            counter++;
        }
    }
}
