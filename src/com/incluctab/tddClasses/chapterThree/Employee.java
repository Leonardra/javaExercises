package com.incluctab.tddClasses.chapterThree;

public class Employee {
    private String firstName;
    private String lastName;
    private double salary;

    public Employee(String firstName, String lastName, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }


    public void setEmployeeFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setEmployeeLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setEmployeeSalary(double salary) {
        if(salary <= 0.00){
        } else {
            this.salary = salary;
        }
    }

    public Object getEmployeeSalary() {
        return salary;
    }



    public double getEmployeeYearlySalary() {
        final int NUMBER_OF_MONTHS = 12;
        return salary * NUMBER_OF_MONTHS;
    }


    public void setSalaryIncrease(double salaryIncrease) {
        final int NUMBER_OF_MONTHS =12;
        salaryIncrease = ( salary + (salary * salaryIncrease /100));
        salary = salaryIncrease;
    }
}
