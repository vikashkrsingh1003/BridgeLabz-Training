package com.day08.fitnesstracker;

public class FitnessTrackerMain {

    public static void main(String[] args) {

        StepBoard board = new StepBoard();

        board.addSteps(5000);
        board.addSteps(12000);
        board.addSteps(8000);
        board.addSteps(15000);
        board.addSteps(9500);

        board.sortSteps();

        System.out.println("=== Daily Step Leaderboard ===\n");
        board.displaySteps();
    }
}
