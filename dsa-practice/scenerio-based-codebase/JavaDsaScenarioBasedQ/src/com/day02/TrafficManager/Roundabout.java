package com.day02.TrafficManager;

public class Roundabout {
    private VehicleNode tail; 

    // Add vehicle to roundabout
    public void addVehicle(String number) {
        VehicleNode newNode = new VehicleNode(number);

        if (tail == null) {
            tail = newNode;
            tail.next = tail;
        } else {
            newNode.next = tail.next;
            tail.next = newNode;
            tail = newNode;
        }
        System.out.println(number + " entered the roundabout");
    }

    // Remove vehicle from roundabout
    public void removeVehicle() {
        if (tail == null) {
            System.out.println("Roundabout is empty");
            return;
        }

        VehicleNode head = tail.next;

        if (head == tail) {
            System.out.println(head.vehicleNumber + " exited the roundabout");
            tail = null;
        } else {
            System.out.println(head.vehicleNumber + " exited the roundabout");
            tail.next = head.next;
        }
    }

    // Display roundabout state
    public void display() {
        if (tail == null) {
            System.out.println("Roundabout is empty");
            return;
        }

        VehicleNode temp = tail.next;
        System.out.print("Roundabout: ");

        do {
            System.out.print(temp.vehicleNumber + " -> ");
            temp = temp.next;
        } while (temp != tail.next);

        System.out.println("(back to start)");
    }

    public boolean isEmpty() {
        return tail == null;
    }
}
