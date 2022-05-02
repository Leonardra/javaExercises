package com.incluctab.tddClasses.chapterThree;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Date(){

    }

    public void setDay(int day) {

        if(day >= 1 && day <=31){
            this.day = day;
        }

    }

    public int getDay() {
        return day;
    }

    public void setMonth(int month) {
        if(month > 1 && month <= 12){
            this.month = month;
        }
    }

    public int getMonth() {
        return month;
    }

    public void setYear(int year) {
        if(year > 999 && year <=9999) {
            this.year = year;
        }
    }

    public int getYear() {
        return year;
    }

    public String displayDate() {
        System.out.printf(" %s/%s/%s", day,month, year);
        return String.format("%s/%s/%s", day,month, year);
    }
}
