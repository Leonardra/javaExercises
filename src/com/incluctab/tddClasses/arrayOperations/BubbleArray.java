package com.incluctab.tddClasses.arrayOperations;

public class BubbleArray implements ArraySorter {

    public int[] sortAscending(int[] number) throws ArraySorterException{
       validateArray(number);
        int tempValue = -1;

        for(int i= 0; i<number.length-1; i++){
            for(int j= i+1; j < number.length; j++){
                if(number[j] < number[i]){
                    tempValue = number[i];
                    number[i] = number[j];
                    number[j] = tempValue;
                }
            }
        }
        return number;
    }

    public int[] sortDescending(int[] number) throws ArraySorterException{
       validateArray(number);
        int tempValue = -1;

        for(int i= 0; i<number.length-1; i++){ //loop to the second to the last value
            for(int j= i+1; j < number.length; j++){ //in the inner loop, loop from the second index
                if(number[j] > number[i]){ //if the value in index 0 is greater than the value in index 1
                    tempValue = number[i]; //index 0 value needs to be stored in another variable.
                    number[i] = number[j];//then index 1 value is stored in index 0;
                    number[j] = tempValue;// then index 1 is updated with the variable value
                }
            }
        }
        return number;
    }
}
