package com.pluralsight;

public class Room {
    private int numberOfBeds;
    private double price;
    private boolean occupied;
    private boolean dirty;
    private boolean available = !dirty && !occupied;

    // getters

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public boolean isDirty() {
        return dirty;
    }

    // clean and not currently occupied
    public boolean isAvailable() {
        return available;
    }

    // add checkIn(), checkOut() and cleanRoom()

    // checked in, it should be marked occupied and marked as dirty
    public void checkIn() {
        occupied = true;
        dirty = true;
    }

    // must first be cleaned by a housekeeper before another guest can check into the room
    public void checkOut() {
        occupied = false;
        dirty = true;
    }

    public void cleanRoom() {
        dirty = false;
    }
}
