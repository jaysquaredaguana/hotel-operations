package com.pluralsight;

public class Room {
    private int numberOfBeds;
    private double price;
    private boolean occupied;
    private boolean dirty;

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
        return !dirty && !occupied;
    }

    // add checkIn(), checkOut() and cleanRoom()

    // checked in, it should be marked occupied and marked as dirty
    public boolean checkIn() {
        if (!isAvailable()) {
            return false;
        }

        occupied = true;
        dirty = true;

        return true;
    }

    // must first be cleaned by a housekeeper before another guest can check into the room
    public boolean checkOut() {
        if (!occupied) {
            return false;
        }

        occupied = false;
        dirty = true;

        return true;
    }

    public boolean cleanRoom() {
        if (occupied) {
            return false;
        }
        dirty = false;
        return true;
    }
}
