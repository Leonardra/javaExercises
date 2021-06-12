package com.incluctab.tddClasses.chapterThree;

import java.time.LocalDate;
import java.time.Year;

public class HeartRate {
    public final static int CURRENT_YEAR = Year.now().getValue();
    private String firstName;
    private String lastName;
    private Date dateOfBirth;


    public HeartRate() {

    }

    public HeartRate(String firstName, String lastName, Date dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String enterFirstName) {
        firstName = enterFirstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String enterLastName) {
        lastName = enterLastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int calculateAge(int dateOfBirth) {
        return CURRENT_YEAR - dateOfBirth;
    }

    public int calculateMaximumHeartRate(int birthYear) {
        int age = calculateAge(birthYear);
        int maximumHeartRate = 220 - age;
        return maximumHeartRate;
    }

    public String calculateTargetHeartRate(int birthYear) {
        int maximumHeartHeartRate = calculateMaximumHeartRate(birthYear);
        double lowRange = maximumHeartHeartRate * 0.50;
        double highRange = maximumHeartHeartRate * 0.80;

        String range = "Target heart rate is between "+ lowRange + " and " + highRange+".";

        return range;
    }
}
