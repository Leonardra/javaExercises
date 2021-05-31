package com.incluctab.tddClasses.chapterFour;

public class Kata {

    public String grade(int score) {
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


    public int numberOfCopies(int copies) {
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

    public int countNumberOfFactors(int factor) {
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

    public int reverseNumber(int numberReversed) {

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
}
