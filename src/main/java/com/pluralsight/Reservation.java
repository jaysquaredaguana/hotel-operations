package com.pluralsight;

public class Reservation {
    private String roomType;
    private double price;
    private int numberOfNights;
    private boolean weekend;

    public Reservation(String roomType, int numberOfNights, boolean weekend) {
        this.roomType = roomType;
        this.price = getPrice();
        this.numberOfNights = numberOfNights;
        this.weekend = weekend;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getPrice() {
        double kingRate = 139.00;
        double doubleRate = 124.00;
        if (weekend) {
            return switch (roomType) {
                case "king" -> kingRate * 1.1;
                case "double" -> doubleRate * 1.1;
                default -> 0.00;
            };
        } else {
            return switch (roomType) {
                case "king" -> kingRate;
                case "double" -> doubleRate;
                default -> 0.00;
            };
        }
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return weekend;
    }

    public void setWeekend(boolean weekend) {
        this.weekend = weekend;
    }

    public double getReservationTotal() {
        return numberOfNights * getPrice();
    }
}
