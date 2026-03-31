package railway_platform_allocation;

import java.time.LocalDateTime;

class Train implements Comparable<Train> {

    private String trainNumber;
    private LocalDateTime arrivalTime;
    private LocalDateTime departureTime;

    public Train(String trainNumber, LocalDateTime arrivalTime, LocalDateTime departureTime) {
        this.trainNumber = trainNumber;
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
    }

    public String getTrainNumber() {
        return trainNumber;
    }

    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    @Override
    public int compareTo(Train other) {
        return this.arrivalTime.compareTo(other.arrivalTime);
    }
}
