package railway_platform_allocation;

import java.time.LocalDateTime;

class Platform {

    private int platformNumber;
    private LocalDateTime occupiedTill;

    public Platform(int platformNumber) {
        this.platformNumber = platformNumber;
        this.occupiedTill = null; 
    }

    public boolean isAvailable(LocalDateTime arrivalTime) {
        return occupiedTill == null || 
               !arrivalTime.isBefore(occupiedTill);
    }

    public void allocate(LocalDateTime departureTime) {
        this.occupiedTill = departureTime;
    }

    public int getPlatformNumber() {
        return platformNumber;
    }
}