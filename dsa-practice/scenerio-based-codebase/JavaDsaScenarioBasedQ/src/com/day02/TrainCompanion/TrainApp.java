package com.day02.TrainCompanion;

public class TrainApp {
    public static void main(String[] args) {
        TrainCompanion train = new TrainCompanion();

        train.addCompartment("Engine");
        train.addCompartment("Sleeper");
        train.addCompartment("Pantry");
        train.addCompartment("AC Coach");
        
        
        train.traverseForward();
        System.out.println("------------------------------------");
        train.traverseBackward();
        System.out.println("------------------------------------");
        
        
        System.out.println("\n------------------------------------");
        train.showAdjacent("Pantry");
        System.out.println("------------------------------------");
        
        train.removeCompartment("Sleeper");

       
    }
}

