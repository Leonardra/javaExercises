package com.incluctab.tddClasses.chapterFour;

public class Kata {

    public static String getBinaryNumber(int input) {
        int quotient = input;
        String binaryResult = "";
        while(quotient != 0) {
            int remainder = quotient % 2;
            quotient = quotient / 2;
            binaryResult += remainder;
        }
        String result = "";
        for (int i = binaryResult.length() - 1; i >= 0; i--) {
            result += binaryResult.charAt(i);
        }
        return result;
    }

    public static String numberBaseConverter(int input, int baseNumber) {
        int quotient = input;
        String binaryResult = "";
        while(quotient != 0) {
            int remainder = quotient % baseNumber;
            quotient = quotient / baseNumber;
            binaryResult += remainder;
        }
        String result = "";
        for (int i = binaryResult.length() - 1; i >= 0; i--) {
            result += binaryResult.charAt(i);
        }
        return result;
    }

    public static int findMaximumNumberFrom(int[] numberSeries) {
        int counter = 0;
        int maximumNumber = 0;
        while(counter < numberSeries.length){
            if (numberSeries[counter] > maximumNumber) {
                maximumNumber = numberSeries[counter];
            }
            counter++;
        }
        return maximumNumber;
    }

    public static int findMinimumNumberFrom(int[] numberSeries) {
        int counter = 0;
        int minimumNumber = numberSeries[0];
        while(counter < numberSeries.length){
            if(numberSeries[counter] < minimumNumber){
                minimumNumber = numberSeries[counter];
            }
            counter++;
        }
        return minimumNumber;
    }

    public static double findAverageFrom(int[] numberSeries) {
        int counter = 0;
        double sum = 0;
        double average = 0.0;

        while(counter < numberSeries.length){
            sum += numberSeries[counter];
            counter++;
        }
        average = sum / numberSeries.length;

        return Math.round(average * 100.0)/100.0;
    }


    public static String grade(int score) {
        if (score >= 90) {
            return "A";
        } else {
            if (score >= 80) {
                return "B";
            } else {
                if (score >= 70) {
                    return "C";
                } else {
                    if (score >= 60) {
                        return "D";
                    } else {
                        return "F";
                    }
                }

            }
        }
    }


    public static int numberOfCopies(int copies) {
        if (copies > 0 && copies <= 4) {
            return 1500;
        } else {
            if (copies <= 9) {
                return 1400;
            } else {
                if (copies <= 29) {
                    return 1200;
                } else {
                    if (copies <= 49) {
                        return 1100;
                    } else {
                        if (copies <= 99) {
                            return 1000;
                        } else {
                            if (copies <= 199) {
                                return 900;
                            } else {
                                return 800;
                            }
                        }
                    }
                }
            }
        }
    }

    public static int countNumberOfFactors(int factor) {
        int minimumNumber = 1;
        int countOfFactors = 0;

        while (minimumNumber <= factor) {
            boolean isFactor = factor % minimumNumber == 0;
            if (isFactor) {
                countOfFactors++;
            }
            minimumNumber++;
        }
        return countOfFactors;
    }

    public static int reverseNumber(int numberReversed) {

        if (numberReversed >= 10000 && numberReversed <= 99999) {
            int firstNumber = numberReversed / 10000;
            int secondNumber = (numberReversed % 10000) / 1000;
            int thirdNumber = (numberReversed % 1000) / 100;
            int fourthNumber = (numberReversed % 100) / 10;
            int fifthNumber = numberReversed % 10;

            int reverse = fifthNumber * 10000 + fourthNumber * 1000 +
                    thirdNumber * 100 + secondNumber * 10 + firstNumber;

            return reverse;
        } else {
            return 0;
        }


    }

    public static int findFactorialOf(int number) {
        int factorial = 1;
        while(number > 1){
                factorial = factorial * number;
                number -= 1;
        }
        return factorial;
    }

    public static int waterIsFull(int waterVolume){
        int litreOfBucket = 20;
        while(litreOfBucket >= waterVolume){
            System.out.println("Water is Pouring" +waterVolume++);
            if(waterVolume > litreOfBucket){
                System.out.println("Water is full");
            }
//            waterVolume++;
        }
        return litreOfBucket;
    }

    public static int findMaximumFromSumOf(int[] numberSeries) {
        int counter = 0;
        int maximumNumber = 0;
        int sum = 0;
        while (counter < numberSeries.length) {
            sum += numberSeries[counter];
            counter++;
        }
        counter = 0;
        int total;
        while(counter < numberSeries.length) {
            total = sum;
            total = total - numberSeries[counter];
            if(total > maximumNumber) {
                maximumNumber = total;
            }
            counter++;
        }
        return maximumNumber;
    }

    public static int findMinimumFromSumOf(int[] numberSeries) {
        int counter = 0;
        int sum = 0;

        while(counter < numberSeries.length){
            sum+=numberSeries[counter];
            counter++;
        }
        counter = 0;
        int minimumNumber = sum;
        int total;
        while(counter < numberSeries.length){
            total = sum;
            total = total - numberSeries[counter];
            if(total < minimumNumber){
                minimumNumber = total;
            }
            counter++;
        }
        return minimumNumber;
    }

    public static int getNextSequence(int firstNumber, int secondNumber, int thirdNumber) {
        int commonDifference = thirdNumber - secondNumber;
        int nextNumber = thirdNumber + commonDifference;

        return nextNumber;
    }
}
