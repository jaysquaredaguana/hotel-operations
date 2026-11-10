package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    void checkInRoom() { // room should be occupied and dirty
        // arrange
        Room room = new Room();
        // act
        boolean checkInResult = room.checkIn();
        // assert
        assertTrue(checkInResult);
        assertTrue(room.isOccupied());
        assertTrue(room.isDirty());
        assertFalse(room.isAvailable());
    }

    @Test
    public void checkInOccupiedRoom() {
        // arrange
        Room room = new Room();
        room.checkIn();
        // act
        boolean checkInResult = room.checkIn();
        // assert
        assertFalse(checkInResult);
        assertTrue(room.isOccupied());
    }

    @Test
    public void checkInDirtyRoom() {
        // arrange
        Room room = new Room();
        room.checkIn();
        room.checkOut();
        // act
        boolean checkInResult = room.checkIn();
        // assert
        assertFalse(checkInResult);
        assertFalse(room.isOccupied());
        assertTrue(room.isDirty());
    }

    @Test
    void checkOutRoom() { // room should be unoccupied, still dirty
        // arrange
        Room room = new Room();
        room.checkIn();
        // act
        room.checkOut();
        // assert
        assertFalse(room.isOccupied());
        assertTrue(room.isDirty());
        assertFalse(room.isAvailable());
    }

    @Test
    void cleanRoom() { // room should no longer be dirty
        // arrange
        Room room = new Room();
        room.checkIn();
        room.checkOut();
        // act
        boolean cleanRoomResult = room.cleanRoom();
        // assert
        assertTrue(cleanRoomResult);
        assertFalse(room.isDirty());
        assertTrue(room.isAvailable());
    }

    @Test
    public void cleanOccupiedRoom() {
        // arrange
        Room room = new Room();
        room.checkIn();
        // act
        boolean cleanRoomResult = room.cleanRoom();
        // assert
        assertFalse(cleanRoomResult);
        assertTrue(room.isOccupied());
        assertTrue(room.isDirty());
    }
}