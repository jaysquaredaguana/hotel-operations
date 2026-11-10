package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void punchIn() {
        // arrange
        Employee employee = new Employee(0);
        int expectedStartTime = 8;
        // act
        employee.punchIn(8);
        // assert
        int actualStartTime = employee.getStartTime();
        assertEquals(expectedStartTime, actualStartTime);
    }

    @Test
    void punchOut() {
        // arrange
        Employee employee = new Employee(0);
        employee.punchIn(8);
        int expectedHoursWorked = 8;
        // act
        employee.punchOut(16);
        // assert
        assertEquals(expectedHoursWorked, employee.getHoursWorked());
    }
}