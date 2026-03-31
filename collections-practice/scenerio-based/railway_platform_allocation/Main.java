package railway_platform_allocation;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

        RailwayStation station = new RailwayStation(2);

        station.addTrain(new Train("T1",LocalDateTime.of(2026, 3, 3, 10, 0),LocalDateTime.of(2026, 3, 3, 10, 30)));
        station.addTrain(new Train("T2",LocalDateTime.of(2026, 3, 3, 10, 5),LocalDateTime.of(2026, 3, 3, 10, 20)));
        station.addTrain(new Train("T3",LocalDateTime.of(2026, 3, 3, 10, 35),LocalDateTime.of(2026, 3, 3, 10, 40)));
        try {
            station.allocatePlatforms();
        } catch (PlatformUnavailableException e) {
            System.out.println(e.getMessage());
        }
    }
}
