package com.day01.ambulanceroute;

public class AmbulanceRoute {

    private Node head = null;

    // Add hospital unit
    public void addUnit(String unitName, boolean available) {
        Node newNode = new Node(unitName, available);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }

        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = head;
    }

    // Find nearest available unit
    public void findAvailableUnit() {
        if (head == null) {
            System.out.println("No hospital units available.");
            return;
        }

        Node temp = head;
        do {
            if (temp.available) {
                System.out.println("Redirect patient to: " + temp.unitName);
                return;
            }
            temp = temp.next;
        } while (temp != head);

        System.out.println("No available units at the moment.");
    }

    // Remove unit under maintenance
    public void removeUnit(String unitName) {
        if (head == null) return;

        Node current = head;
        Node previous = null;

        do {
            if (current.unitName.equals(unitName)) {

                // Only one node
                if (current == head && current.next == head) {
                    head = null;
                    return;
                }

                // Removing head
                if (current == head) {
                    Node last = head;
                    while (last.next != head) {
                        last = last.next;
                    }
                    head = head.next;
                    last.next = head;
                } else {
                    previous.next = current.next;
                }

                System.out.println(unitName + " removed (Under Maintenance)");
                return;
            }
            previous = current;
            current = current.next;
        } while (current != head);
    }
}

