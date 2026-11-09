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
        Employee employee1 = new Employee(1.75, 10.0);

        System.out.println("EMPLOYEE INFORMATION");
        System.out.printf("Total pay: $%.2f%n", employee1.getTotalPay());
        System.out.println("Regular hours: " + employee1.getRegularHours());
        System.out.println("Overtime hours: " + employee1.getOvertimeHours());

        employee1.punchTimeCard(10, 14);
        System.out.println("Hours after punch: " + employee1.getRegularHours());

        Employee employee2 = new Employee(25.00, 0);

        // Test manual punch in and punch out
        employee2.punchIn(900);
        employee2.punchOut(1700);

        System.out.println("Manual punch:");
        System.out.println("Hours worked: " + employee2.getHoursWorked());
        System.out.printf("Total pay: $%.2f%n", employee2.getTotalPay());
    }
}