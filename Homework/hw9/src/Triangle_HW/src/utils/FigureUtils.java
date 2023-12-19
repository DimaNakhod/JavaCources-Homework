package utils;

import Triangle.Point;

public class FigureUtils {
    public static double calcSideLength(Point p1, Point p2) {
        return Math.sqrt((Math.pow(Math.abs(p2.getX()) - Math.abs(p1.getX()), 2) +
                Math.pow(Math.abs(p2.getY()) - Math.abs(p1.getY()), 2)));
    }
}
