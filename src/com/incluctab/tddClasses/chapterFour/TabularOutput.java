package com.incluctab.tddClasses.chapterFour;

public class TabularOutput {
    public static void main(String[] args) {
        int counter = 1;

        System.out.println("N\t\t10*N\t100*N\t1000*N\n");
        while(counter <= 5){
            System.out.print(counter+"\t\t"+10*counter+"\t\t"+ 100*counter+ "\t\t"+ 1000*counter+"\n");
            counter++;
        }
    }
}
