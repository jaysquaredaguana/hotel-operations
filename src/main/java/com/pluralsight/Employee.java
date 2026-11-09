package com.pluralsight;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

    public Employee(double payRate, double hoursWorked) {
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public double getTotalPay() {
        return payRate * hoursWorked;
    }

    public double getRegularHours() {
        if (hoursWorked > 40) {
            return 40;
        }
        return hoursWorked;
    }
    public double getOvertimeHours() {
        if (hoursWorked > 40) {
            return hoursWorked - 40;
        }
        return 0;
    }
}
