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

        int totals[] = new int [8];


        if (counter == 0 || counter == 4 || counter == 8 || counter == 12 || counter == 16) {
            int sumCounter = 0;
            sumCounter++;
            totals[0] += sumCounter;
        }

        if (counter == 1 || counter == 5 || counter == 9 || counter == 13 || counter == 17) {
            int sumCounter = 0;
            sumCounter++;
            totals[2] += sumCounter;
        }

        if (counter == 2 || counter == 6 || counter == 10 || counter == 14 || counter == 18) {
            int sumCounter = 0;
            sumCounter++;
            totals[4] += sumCounter;
        }

        if (counter == 3 || counter == 7 || counter == 11 || counter == 15 || counter == 19) {
            int sumCounter = 0;
            sumCounter++;
            totals[6] += sumCounter;
        }


        if (counter == 0 || counter == 4 || counter == 8 || counter == 12 || counter == 16) {
            int sumCounter = 0;
            sumCounter++;
            totals[1] += sumCounter;
        }

        if (counter == 1 || counter == 5 || counter == 9 || counter == 13 || counter == 17) {
            int sumCounter = 0;
            sumCounter++;
            totals[3] += sumCounter;
        }

        if (counter == 2 || counter == 6 || counter == 10 || counter == 14 || counter == 18) {
            int sumCounter = 0;
            sumCounter++;
            totals[5] += sumCounter;
        }

        if (counter == 3 || counter == 7 || counter == 11 || counter == 15 || counter == 19) {
            int sumCounter = 0;
            sumCounter++;
            totals[7] += sumCounter;
        }
    }
}
