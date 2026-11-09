package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        // Test the Reservation class
        Reservation reservation1 = new Reservation("king", 3, false);
        Reservation reservation2 = new Reservation("double", 2, true);

        System.out.println("RESERVATION INFORMATION");

        System.out.println("Room type: " + reservation1.getRoomType());
        System.out.printf("Price per night: $%.2f%n", reservation1.getPrice());
        System.out.println("Number of nights: " + reservation1.getNumberOfNights());
        System.out.println("Weekend: " + reservation1.isWeekend());
        System.out.printf("Total: $%.2f%n", reservation1.getReservationTotal());

        System.out.println();

        System.out.println("Room type: " + reservation2.getRoomType());
        System.out.printf("Price per night: $%.2f%n", reservation2.getPrice());
        System.out.println("Number of nights: " + reservation2.getNumberOfNights());
        System.out.println("Weekend: " + reservation2.isWeekend());
        System.out.printf("Total: $%.2f%n", reservation2.getReservationTotal());

        System.out.println("-------------------------");

        // Test the Employee class
        Employee employee = new Employee(1.75, 10.0);

        System.out.println("EMPLOYEE INFORMATION");

        // Employee currently has no setters or constructor,
        // so its fields will have their default values.

        System.out.println("Total pay: $" + employee.getTotalPay());
        System.out.println("Regular hours: " + employee.getRegularHours());
        System.out.println("Overtime hours: " + employee.getOvertimeHours());
    }
}