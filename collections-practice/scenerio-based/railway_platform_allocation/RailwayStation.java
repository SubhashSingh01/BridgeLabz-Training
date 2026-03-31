package railway_platform_allocation;

import java.util.*;

class RailwayStation {

    private Map<Integer, Platform> platforms = new TreeMap<>();
    private PriorityQueue<Train> trainQueue = new PriorityQueue<>();

    public RailwayStation(int numberOfPlatforms) {
        for (int i = 1; i <= numberOfPlatforms; i++) {
            platforms.put(i, new Platform(i));
        }
    }

    public void addTrain(Train train) {
        trainQueue.offer(train);
    }

    public void allocatePlatforms() throws PlatformUnavailableException {

        while (!trainQueue.isEmpty()) {

            Train train = trainQueue.poll();
            boolean allocated = false;

            for (Platform platform : platforms.values()) {

                if (platform.isAvailable(train.getArrivalTime())) {

                    platform.allocate(train.getDepartureTime());
                    System.out.println("Train "+train.getTrainNumber()+" allocated to Platform "+platform.getPlatformNumber());
                    allocated = true;
                    break;
                }
            }

            if (!allocated) {
                throw new PlatformUnavailableException("No platform available for Train "+ train.getTrainNumber());
            }
        }
    }
}