package com.parking.parkinglot.common;

public class CarDto {

    Long id;
    String licensePlate;
    String parkingSpot;
    String OwnerName;

    public CarDto(Long id, String parkingSpot, String licensePlate, String ownerName) {
        this.id = id;
        this.parkingSpot = parkingSpot;
        this.licensePlate = licensePlate;
        OwnerName = ownerName;
    }

    public Long getId() {
        return id;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getParkingSpot() {
        return parkingSpot;
    }

    public String getOwnerName() {
        return OwnerName;
    }
}
