package com.incluctab.tddClasses.chapterTwo;

import java.util.Scanner;

public class LargestAndSmallest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int firstDigit = input.nextInt();

        System.out.println("Enter second number: ");
        int secondDigit = input.nextInt();

        System.out.println("Enter third digit: ");
        int thirdDigit = input.nextInt();

        System.out.println("Enter fourth digit: ");
        int fourthDigit = input.nextInt();

        System.out.println("Enter fifth digit: ");
        int fifthDigit = input.nextInt();

        if ((firstDigit < secondDigit) && (firstDigit < thirdDigit)
                && (firstDigit < fourthDigit) && (firstDigit < fifthDigit)){
            System.out.println("Smallest is " + firstDigit);
        }
        else {
            if((secondDigit < firstDigit) && (secondDigit < thirdDigit)
                && (secondDigit < fourthDigit) && (secondDigit < fifthDigit)){
                System.out.println("Smallest is " +secondDigit);
            }
            else {
                if((thirdDigit < firstDigit) && (thirdDigit < secondDigit)
                && (thirdDigit < fourthDigit) && (thirdDigit < fifthDigit)){
                    System.out.println("Smallest is " +thirdDigit);
                }
                else {
                    if ((fourthDigit < firstDigit) && (fourthDigit < secondDigit)
                            && (fourthDigit < thirdDigit) && (fourthDigit < fifthDigit)) {
                        System.out.println("Smallest is " +fourthDigit);
                    }
                    else {
                        if ((fifthDigit < firstDigit) && (fifthDigit < secondDigit)
                                && (fifthDigit < thirdDigit) && (fifthDigit < fourthDigit)){
                            System.out.println("Smallest is "+fifthDigit);
                        }
                    }
                }
            }
        }
        if ((firstDigit > secondDigit) && (firstDigit > thirdDigit)
                && (firstDigit > fourthDigit) && (firstDigit > fifthDigit)){
            System.out.println("Largest is " + firstDigit);
        }
        else {
            if((secondDigit > firstDigit) && (secondDigit > thirdDigit)
                    && (secondDigit > fourthDigit) && (secondDigit > fifthDigit)){
                System.out.println("Largest is " +secondDigit);
            }
            else {
                if((thirdDigit > firstDigit) && (thirdDigit > secondDigit)
                        && (thirdDigit > fourthDigit) && (thirdDigit > fifthDigit)){
                    System.out.println("Largest is " +thirdDigit);
                }
                else {
                    if ((fourthDigit > firstDigit) && (fourthDigit > secondDigit)
                            && (fourthDigit > thirdDigit) && (fourthDigit > fifthDigit)) {
                        System.out.println("Largest is " +fourthDigit);
                    }
                    else {
                        if ((fifthDigit > firstDigit) && (fifthDigit > secondDigit)
                                && (fifthDigit > thirdDigit) && (fifthDigit > fourthDigit)){
                            System.out.println("Largest is "+fifthDigit);
                        }
                    }
                }
            }
        }
    }
}
