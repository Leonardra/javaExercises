package com.incluctab.tddClasses.bankApplication;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StaffTest {

    @Test
    void thatStaffCanHaveUserName(){
        Staff newStaff = new Staff();
        newStaff.setUserName("Tolulope");
        assertEquals("Tolulope", newStaff.getUserName());
    }

    @Test
    void thatStaffHavePin(){
        Staff newStaff = new Staff();
        newStaff.setPin(3444);
        assertTrue(newStaff.confirmPin(3444));
    }
}
