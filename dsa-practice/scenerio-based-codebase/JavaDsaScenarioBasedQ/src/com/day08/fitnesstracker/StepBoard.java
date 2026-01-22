package com.day08.fitnesstracker;

import java.util.ArrayList;
import java.util.List;

public class StepBoard {

    private List<Integer> stepCounts;

    public StepBoard() {
        stepCounts = new ArrayList<>();
    }

    public void addSteps(int steps) {
        stepCounts.add(steps);
    }

    public void sortSteps() {

        int n = stepCounts.size();

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                if (stepCounts.get(j) < stepCounts.get(j + 1)) {

                    int temp = stepCounts.get(j);
                    stepCounts.set(j, stepCounts.get(j + 1));
                    stepCounts.set(j + 1, temp);
                }
            }
        }
    }

    public void displaySteps() {
        for (int steps : stepCounts) {
            System.out.println("Steps: " + steps);
        }
    }
}
