package com.day09.bagnball;

public class Main {

    public static void main(String[] args) {

        Bag bag1 = new Bag("BAG01", "Red", 2);

        Ball ball1 = new Ball("BALL01", "Blue", "Small");
        Ball ball2 = new Ball("BALL02", "Green", "Medium");
        Ball ball3 = new Ball("BALL03", "Yellow", "Large");

        bag1.addBall(ball1);
        bag1.addBall(ball2);

        // This will fail (bag full)
        bag1.addBall(ball3);

        bag1.displayBalls();

        // Remove a ball
        bag1.removeBall("BALL01");
        bag1.displayBalls();

        // Display bag summary
        System.out.println(bag1.getDescription());
    }
}

