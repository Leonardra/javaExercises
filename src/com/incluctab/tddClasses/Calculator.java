package com.incluctab.tddClasses;

public class Calculator {
    public int divide;
    public int quotient;

    public int add(int firstNumber, int secondNumber) {
        int sum = firstNumber + secondNumber;
        return sum;
    }

    public int multiply(int firstInput, int secondInput) {
        int result = firstInput * secondInput;
        return result;
    }

    public double divide(double firstInput1, double secondInput2) {
        double quotient = firstInput1 / secondInput2;
        if(firstInput1 == 0){
            return 0;
        }else if(secondInput2 == 0){
            return 0;
        }else
            return quotient;

    }

    public int subtract(int valueOne, int value2) {
    int product = (valueOne - value2);

    if(product < 0){
        return 0;
    } else
        return product;
    }
}
