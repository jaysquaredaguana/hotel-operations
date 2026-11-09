package com.pluralsight;

import java.time.LocalDateTime;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private int startTime;

    public Employee(double payRate, double hoursWorked) {
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getTotalPay() {
        return payRate * hoursWorked;
    }

    public double getRegularHours() {
        return Math.min(hoursWorked, 40);
    }

    public double getOvertimeHours() {
        if (hoursWorked > 40) {
            return hoursWorked - 40;
        }
        return 0;
    }

    public void punchTimeCard(int startTime, int endTime) {
        hoursWorked += endTime - startTime;
    }

    // Punch in using a manually provided time
    public void punchIn(int time) {
        startTime = time;
    }

    // Punch in using the current time
    public void punchIn() {
        LocalDateTime now = LocalDateTime.now();

        int hour = now.getHour(); // hour will be represented as hundreds
        int minute = now.getMinute(); // minute gets represented 0 to 59
        // sum hour representation, 13:34 -> 1334
        startTime = (hour * 100) + minute;
    }

    // Punch out using a manually provided time
    public void punchOut(int time) {
        hoursWorked += (time - startTime) / 100.0; // preserves minutes double calculation
    }

    // Punch out using the current time
    public void punchOut() {
        LocalDateTime now = LocalDateTime.now();

        int hour = now.getHour();
        int minute = now.getMinute();

        int endTime = (hour * 100) + minute;

        hoursWorked += (endTime - startTime) / 100.0;
    }
}
