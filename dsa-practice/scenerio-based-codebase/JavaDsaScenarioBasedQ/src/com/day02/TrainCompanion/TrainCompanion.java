package com.day02.TrainCompanion;

public class TrainCompanion {
	
    private Compartment head;
    private Compartment tail;

    public void addCompartment(String name) {
        Compartment newNode = new Compartment(name);

        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void removeCompartment(String name) {
        Compartment temp = head;

        while (temp != null) {
            if (temp.name.equals(name)) {

                if (temp.prev != null)
                    temp.prev.next = temp.next;
                else
                    head = temp.next;

                if (temp.next != null)
                    temp.next.prev = temp.prev;
                else
                    tail = temp.prev;

                System.out.println(name + " removed");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Compartment not found");
    }

    public void traverseForward() {
        Compartment temp = head;
        System.out.print("Forward: ");
        while (temp != null) {
            System.out.print(temp.name + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void traverseBackward() {
        Compartment temp = tail;
        System.out.print("Backward: ");
        while (temp != null) {
            System.out.print(temp.name + " -> ");
            temp = temp.prev;
        }
        System.out.println();
    }

    public void showAdjacent(String name) {
        Compartment temp = head;

        while (temp != null) {
            if (temp.name.equals(name)) {
                System.out.println("Current: " + temp.name);
                System.out.println("Previous: " + (temp.prev != null ? temp.prev.name : "None"));
                System.out.println("Next: " + (temp.next != null ? temp.next.name : "None"));
                return;
            }
            temp = temp.next;
        }
        System.out.println("Compartment not found");
    }
}
