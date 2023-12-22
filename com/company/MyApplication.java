package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MyApplication {
    public static void main(String[] args) {
        Point[] points = readCoordinatesFromFile("coordinates.txt");

        if (points.length >= 3) {
            Shape shape = new Shape(points);

            System.out.println("Perimeter: " + shape.perimeter());
            System.out.println("Longest Side: " + shape.longestSide());
            System.out.println("Average Side: " + shape.averageSide());
        } else {
            System.out.println("Not enough points to form a shape.");
        }
    }

    private static Point[] readCoordinatesFromFile(String fileName) {
        Point[] points = new Point[10];

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            int index = 0;

            while ((line = reader.readLine()) != null && index < points.length) {
                String[] coordinates = line.split(",");
                if (coordinates.length == 2) {
                    double x = Double.parseDouble(coordinates[0].trim());
                    double y = Double.parseDouble(coordinates[1].trim());
                    points[index++] = new Point(x, y);
                } else {
                    System.out.println("Invalid coordinates format in line: " + line);
                }
            }

        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }

        return points;
    }

}
