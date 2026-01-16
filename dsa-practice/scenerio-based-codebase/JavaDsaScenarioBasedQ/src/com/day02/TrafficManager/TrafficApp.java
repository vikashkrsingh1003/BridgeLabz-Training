package com.day02.TrafficManager;

public class TrafficApp {
    public static void main(String[] args) {
        Roundabout roundabout = new Roundabout();
        VehicleQueue waitingQueue = new VehicleQueue(3);

        // Vehicles arriving
        waitingQueue.enqueue("CAR-101");
        waitingQueue.enqueue("CAR-102");
        waitingQueue.enqueue("CAR-103");
        waitingQueue.enqueue("CAR-104"); // overflow

        // Move vehicles from queue to roundabout
        while (!waitingQueue.isEmpty()) {
            String vehicle = waitingQueue.dequeue();
            if (vehicle != null)
                roundabout.addVehicle(vehicle);
        }

        roundabout.display();

        // Vehicles exiting
        roundabout.removeVehicle();
        roundabout.display();

        roundabout.removeVehicle();
        roundabout.removeVehicle();
        roundabout.removeVehicle(); // empty case
    }
}
