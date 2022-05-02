package com.incluctab.tddClasses.kataWithDimeji;

public class StringArray {
    public static void main(String[] args) {
        String phoneNumber = "68573565 432+";
        double x = 2.0;
        System.out.println(String.valueOf(x));

        String reversedNumber = "";
        for (int i = phoneNumber.length()-1; i >= 0 ; i--) {
            reversedNumber += phoneNumber.charAt(i);
            if(i < 8 && (i+1) %3==0){
            reversedNumber += " ";
            }
        }
        System.out.println(reversedNumber);
    }
}
