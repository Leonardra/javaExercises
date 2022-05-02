package com.incluctab.tddClasses.arrayOperations;

public class BinarySorter implements ArraySorter {
    @Override
    public int[] sortAscending(int[] array) throws ArraySorterException {
        validateArray(array);


        int startPoint = array[0];
        int endPoint = array[array.length-1];

        int midPoint = (startPoint + endPoint)/2; //Find a mid-point//Break the array into two
        int tempValue = -1;
        for(int i = 0; i < midPoint; i++) {
            if(array[i] > array[midPoint]){
                tempValue = array[i];
                array[i] = array[midPoint];

            }
        }
        return array;
    }

    @Override
    public int[] sortDescending(int[] array) throws ArraySorterException {
        return new int[0];
    }
}
