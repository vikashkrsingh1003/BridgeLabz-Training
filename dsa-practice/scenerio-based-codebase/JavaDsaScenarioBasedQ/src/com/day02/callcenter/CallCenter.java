package com.day02.callcenter;

import java.util.*;

public class CallCenter {

    private Queue<Customer> normalQueue = new LinkedList<>();
    private PriorityQueue<Customer> vipQueue =
            new PriorityQueue<>((a, b) -> a.name.compareTo(b.name));

    private HashMap<String, Integer> callCountMap = new HashMap<>();

    // Incoming call
    public void receiveCall(Customer customer) {

        // Update call count
        callCountMap.put(
                customer.customerId,
                callCountMap.getOrDefault(customer.customerId, 0) + 1
        );

        // Add to appropriate queue
        if (customer.isVIP) {
            vipQueue.offer(customer);
            System.out.println("VIP Call received from: " + customer.name);
        } else {
            normalQueue.offer(customer);
            System.out.println("Normal Call received from: " + customer.name);
        }
    }

    // Handle next call
    public void handleCall() {
        Customer customer;

        if (!vipQueue.isEmpty()) {
            customer = vipQueue.poll();
            System.out.println("Handling VIP customer: " + customer.name);
        } else if (!normalQueue.isEmpty()) {
            customer = normalQueue.poll();
            System.out.println("Handling normal customer: " + customer.name);
        } else {
            System.out.println("No calls in queue.");
        }
    }

    // Display call count
    public void displayCallCount() {
        System.out.println("\nCustomer Call Count:");
        for (Map.Entry<String, Integer> entry : callCountMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}

