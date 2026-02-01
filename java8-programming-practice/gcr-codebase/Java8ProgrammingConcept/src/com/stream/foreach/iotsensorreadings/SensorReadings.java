package com.stream.foreach.iotsensorreadings;

import java.util.List;

public class SensorReadings {

    public static void main(String[] args) {

        List<Double> readings = List.of(
                22.5, 45.0, 18.2, 60.5, 30.0, 75.3, 25.1
        );

        //double threshold = 40.0;

        readings.forEach(System.out::println);

    }
}
