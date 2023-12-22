package com.company;

public class Shape {
    private Point[] points;

    public Shape(Point[] points) {
        this.points = points;
    }

    public double perimeter() {
        double perimeter = 0;
        for (int i = 0; i < points.length - 1; i++) {
            perimeter += points[i].distanceTo(points[i + 1]);
        }
        perimeter += points[points.length - 1].distanceTo(points[0]);
        return perimeter;
    }

    public double longestSide() {
        double longest = 0;
        for (int i = 0; i < points.length - 1; i++) {
            double currentDistance = points[i].distanceTo(points[i + 1]);
            if (currentDistance > longest) {
                longest = currentDistance;
            }
        }
        longest = Math.max(longest, points[points.length - 1].distanceTo(points[0]));
        return longest;
    }

    public double averageSide() {
        double sum = 0;
        for (int i = 0; i < points.length - 1; i++) {
            sum += points[i].distanceTo(points[i + 1]);
        }
        sum += points[points.length - 1].distanceTo(points[0]);
        return sum / points.length;
    }
}
