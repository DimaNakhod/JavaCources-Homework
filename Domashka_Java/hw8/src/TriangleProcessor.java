public class TriangleProcessor {

    public Triangle[] SortingEquilateral(Triangle[] triangles) {
        Triangle[] result = new Triangle[EquilateralCounter(triangles)];
        int counter = 0;
        for (Triangle triangle : triangles) {
            if (triangle.Equilateral()) {
                result[counter] = triangle;
                counter++;
            }
        }
        return result;
    }

    public int EquilateralCounter(Triangle[] triangles) {
        int result = 0;
        for (Triangle triangle : triangles) {
            if (triangle.Equilateral()) {
                result++;
            }
        }
        return result;
    }

    public Triangle[] SortingIsosceles(Triangle[] triangles) {
        Triangle[] result = new Triangle[IsoscelesCounter(triangles)];
        int counter = 0;
        for (Triangle triangle : triangles) {
            if (triangle.Isosceles()) {
                result[counter] = triangle;
                counter++;
            }
        }
        return result;
    }

    public int IsoscelesCounter(Triangle[] triangles) {
        int result = 0;
        for (Triangle triangle : triangles) {
            if (triangle.Isosceles()) {
                result++;
            }
        }
        return result;
    }

    public Triangle[] SortingRectangular(Triangle[] triangles) {
        Triangle[] result = new Triangle[RectangularCounter(triangles)];
        int counter = 0;
        for (Triangle triangle : triangles) {
            if (triangle.Rectangular()) {
                result[counter] = triangle;
                counter++;
            }
        }
        return result;
    }

    public int RectangularCounter(Triangle[] triangles) {
        int result = 0;
        for (Triangle triangle : triangles) {
            if (triangle.Rectangular()) {
                result++;
            }
        }
        return result;
    }

    public Triangle[] filterByAbility(Triangle[] triangles) {
        Triangle[] result = new Triangle[DefaultCounter(triangles)];
        int counter = 0;
        for (Triangle triangle : triangles) {
            if (!triangle.Rectangular() && !triangle.Isosceles() && !triangle.Equilateral()) {
                result[counter] = triangle;
                counter++;

            }
        }
        return result;
    }

    public int DefaultCounter(Triangle[] triangles) {
        int result = 0;
        for (Triangle triangle : triangles) {
            if (!triangle.Rectangular() && !triangle.Isosceles() && !triangle.Equilateral()) {
                result++;
            }
        }
        return result;
    }

    public Triangle MinTriangle(Triangle[] triangles) {
        Triangle maxTriangle = MaxTriangle(triangles);
        double minSquare = maxTriangle.Area();
        double minPerimeter = maxTriangle.Perimeter();
        Triangle result = null;

        for (Triangle triangle : triangles) {
            if (triangle.Area() <= minSquare && triangle.Perimeter() <= minPerimeter) {
                minSquare = triangle.Area();
                minPerimeter = triangle.Perimeter();
                result = triangle;
            }
        }
        return result;
    }

    public Triangle MaxTriangle(Triangle[] triangles) {
        double maxArea = 0;
        double maxPerimeter = 0;
        Triangle result = null;
        for (Triangle triangle : triangles) {
            if (triangle.Area() >= maxArea && triangle.Perimeter() >= maxPerimeter) {
                maxArea = triangle.Area();
                maxPerimeter = triangle.Perimeter();
                result = triangle;
            }
        }
        return result;
    }
}