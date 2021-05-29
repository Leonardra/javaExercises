package com.incluctab.tddClasses.chapterFive;


public class ChristmasSong {
    public static void main(String[] args) {

        int dayInChristmas = 1;
        int  verses = 1;

        do{

            switch (dayInChristmas) {
                case 1 -> System.out.println("On the first day of christmas my true love gave to me,");
                case 2 -> System.out.println("On the second day of christmas my true love gave to me,");
                case 3 -> System.out.println("On the third day of christmas my true love gave to me,");
                case 4 -> System.out.println("On the fourth day of christmas my true love gave to me,");
                case 5 -> System.out.println("On the fifth day of christmas my true love gave to me,");
                case 6 -> System.out.println("On the sixth day of christmas my true love gave to me,");
                case 7 -> System.out.println("On the seventh day of christmas my true love gave to me,");
                case 8 -> System.out.println("On the eighth day of christmas my true love gave to me,");
                case 9 -> System.out.println("On the ninth day of christmas my true love gave to me,");
                case 10 -> System.out.println("On the tenth day of christmas my true love gave to me,");
                case 11 -> System.out.println("On the eleventh day of christmas my true love gave to me,");
                case 12 -> System.out.println("On the twelfth day of christmas my true love gave to me,");
            }
            switch (verses) {
                case 12:
                    System.out.println("Twelve drummers drumming,");

                case 11:
                    System.out.println("Eleven pipers piping,");
                case 10:
                    System.out.println("Ten lords a leaping,");

                case 9:
                    System.out.println("Nine ladies dancing,");

                case 8:
                    System.out.println("Eight maids a milking,");

                case 7:
                    System.out.println("Seven swans a swimming,");

                case 6:
                    System.out.println("Six geese are laying,");

                case 5:
                    System.out.println("Five gold rings,");

                case 4:
                    System.out.println("Four calling birds,");

                case 3:
                    System.out.println("Three french hens,");

                case 2:
                    System.out.println("Two turtle doves and");
                case 1:
                    System.out.println("a partridge in a pear tree.");

            }
            System.out.println(" ");
            dayInChristmas +=1;
            verses +=1;

        }while(dayInChristmas >= 1 && verses <= 12);
    }
}
