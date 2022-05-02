package com.incluctab.tddClasses.chapterThree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeTest {
    private Employee newEmployee;

    //        String dateString = String.format("%d/%d/%d", 8,23,2008);
//        System.out.println(dateString);
    @BeforeEach
    public void startEveryMethodWithThis(){
        newEmployee = new Employee("Oluwatobi", "Jolayemi", 5000.00);
    }

    @Test
    public void testThatEmployeeCanSetFirstName(){
        newEmployee.setEmployeeFirstName("Tolulope");
        assertEquals("Tolulope", newEmployee.getFirstName());
    }

    @Test
    public void testThatEmployeeCanSetLastName(){
        newEmployee.setEmployeeLastName("Kolawole");
        assertEquals("Kolawole", newEmployee.getLastName());
    }

    @Test
    public void testThatEmployeeCanSetMonthlySalary(){
        newEmployee.setEmployeeSalary(10000.00);
        assertEquals(10000.0, newEmployee.getEmployeeSalary());
    }

    @Test
    public void testThatSalaryDoesNotSetNegativeValue(){
        newEmployee.setEmployeeSalary(-10000.0);
        assertEquals(5000.0, newEmployee.getEmployeeSalary());
    }

    @Test
    public void testThatTwoEmployeesSalariesCanBeDisplayed(){
        Employee newEmployee2 = new Employee("Oluwatobi", "Jolayemi", 5000.00);
        Employee newEmployee3 = new Employee("Oluwatobi", "Jolayemi", 15000.00);
        assertEquals(60000.0, newEmployee2.getEmployeeYearlySalary());
        assertEquals(180000.0, newEmployee3.getEmployeeYearlySalary());
    }

    @Test
    public void testThatEmployeesSalaryCanIncreaseByTenPercent(){
        Employee newEmployee2 = new Employee("Oluwatobi", "Jolayemi", 5000.00);
        Employee newEmployee3 = new Employee("Oluwatobi", "Jolayemi", 15000.00);
        newEmployee2.setSalaryIncrease(10.00);
        newEmployee3.setSalaryIncrease(10.00);
        assertEquals(66000.0,newEmployee2.getEmployeeYearlySalary());
        assertEquals(198000.0, newEmployee3.getEmployeeYearlySalary());
    }
}
