package com.incluctab.tddClasses.arrayOperations;

public interface ArraySorter {
    int[] sortAscending(int[] array)throws ArraySorterException ;
    int[] sortDescending(int[] array)throws ArraySorterException ;

    default void validateArray(int[] array) throws ArraySorterException {
        if(array == null){
            throw new ArraySorterException("Array cannot be null");
        }
    }
}
