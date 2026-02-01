package com.medinventory;

import java.util.*;

public class MedInventoryApp {

    public static void main(String[] args) {

        try {
            Set<Item<String>> items = InventoryReader.read("/Users/apple/Desktop/Java-Programming-Workspace/java-collection-practice/scenario-based-codebase/CollectionScenarioBased/SampleFile/inventory.csv");

            InventoryProcessor.checkCritical(items);

            System.out.println(InventoryProcessor.expired(items));

            System.out.println(InventoryProcessor.categorize(items));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

