package com.day05.parkease;

public class ParkingSlot {
    private String slotId;
    private boolean isOccupied;
    private String vehicleTypeAllowed;
    private String location;

    public ParkingSlot(String slotId, String location, String vehicleTypeAllowed) {
        this.slotId = slotId;
        this.location = location;
        this.vehicleTypeAllowed = vehicleTypeAllowed;
        this.isOccupied = false;
    }

    public boolean isAvailable() {
        return !isOccupied;
    }

    public String getVehicleTypeAllowed() {
        return vehicleTypeAllowed;
    }

    public boolean assignSlot() {
        if (!isOccupied) {
            isOccupied = true;
            return true;
        }
        return false;
    }

    public void releaseSlot() {
        isOccupied = false;
    }

    public String getSlotDetails() {
        return "Slot ID: " + slotId + ", Location: " + location;
    }
}

