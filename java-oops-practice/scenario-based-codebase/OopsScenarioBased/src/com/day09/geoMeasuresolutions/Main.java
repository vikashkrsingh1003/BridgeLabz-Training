package com.day09.geoMeasuresolutions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Line> lines = new ArrayList<>();

        System.out.print("Enter number of lines to compare: ");
        int n = scanner.nextInt();

        // Input multiple lines
        for (int i = 0; i < n; i++) {
            System.out.println("Enter coordinates for Line " + (i + 1));
            double x1 = scanner.nextDouble();
            double y1 = scanner.nextDouble();
            double x2 = scanner.nextDouble();
            double y2 = scanner.nextDouble();

            lines.add(new Line(x1, y1, x2, y2));
        }

        // Compare consecutive lines
        for (int i = 0; i < lines.size() - 1; i++) {
            System.out.println("\nComparing Line " + (i + 1) + " and Line " + (i + 2));
            LineComparator.compareLines(lines.get(i), lines.get(i + 1));
        }

        scanner.close();
    }
}

