package com.day09.geoMeasuresolutions;

public class Line {

    // Encapsulated fields
    private double x1, y1, x2, y2;

    // Constructor using this keyword
    public Line(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    // Method to calculate length of the line
    public double calculateLength() {
        return Math.sqrt( Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) );
    }
}
