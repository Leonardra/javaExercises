package com.incluctab.tddClasses;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTest {

        @Test
        public void testThatCalculatorCanAddTest(){
            //given
            Calculator myCalculator = new Calculator();
            //when
            int sum = myCalculator.add(2,6);
            //check /assert
            assertEquals(8, sum);


        }

        @Test
        public void testThatCalculatorCanMuliptply(){
            //given
            Calculator myCalculator = new Calculator();
            //when
            int result = myCalculator.multiply(3,4);
            //confirm
            assertEquals(12, result);
        }
        @Test
        public void testThatCalculatorCanDivide(){
            Calculator myCalculator = new Calculator();
            double myQuotient = myCalculator.divide(54,0);
            assertEquals(0, myQuotient);

        }
        @Test
        public void testThatCalculatorReturnPosititveValueWhenSubtracted(){
            Calculator myCalculator = new Calculator();
            int product = myCalculator.subtract(23,50);
            assertEquals(0, product);

        }
    }

