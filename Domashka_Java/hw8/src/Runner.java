public class Runner {
    public static void main(String[] args) {
        Triangle[] triangles = {
                new Triangle(new Dot(1, 0), new Dot(2, Math.sqrt(3) / 2), new Dot(1, 0)),
                new Triangle(new Dot(0, 0), new Dot(1, Math.sqrt(3)), new Dot(2, 0)),
                new Triangle(new Dot(0, 3), new Dot(4, 0), new Dot(0, 3)),
                new Triangle(new Dot(2, 0), new Dot(10, 0), new Dot(0, 3)),
                new Triangle(new Dot(0, 1), new Dot(0, 0), new Dot(1, 0)),
                new Triangle(new Dot(5, 2), new Dot(7, 0), new Dot(4, 0)),
                new Triangle(new Dot(0, 0), new Dot(0, 3), new Dot(2, 1)),
                new Triangle(new Dot(4, 3), new Dot(15, 8), new Dot(15, 3))};

        TriangleProcessor triangleProcessor = new TriangleProcessor();

        System.out.println("Equilateral triangles: " + triangleProcessor.EquilateralCounter(triangles));
        Triangle[] equilateralTriangles = triangleProcessor.SortingEquilateral(triangles);
        System.out.println("Minimum equilateral triangles is: \n" + triangleProcessor.MinTriangle(equilateralTriangles));
        System.out.println("Maximum equilateral triangles is: \n" + triangleProcessor.MaxTriangle(equilateralTriangles));

        System.out.println("\nIsosceles triangles: " + triangleProcessor.IsoscelesCounter(triangles));
        Triangle[] isoscelesTriangles = triangleProcessor.SortingIsosceles(triangles);
        System.out.println("Minimum isosceles triangles: \n" + triangleProcessor.MinTriangle(isoscelesTriangles));
        System.out.println("Maximum isosceles triangles: \n" + triangleProcessor.MaxTriangle(isoscelesTriangles));

        System.out.println("\nRectangular triangles: " + triangleProcessor.RectangularCounter(triangles));
        Triangle[] rectangularTriangles = triangleProcessor.SortingRectangular(triangles);
        System.out.println("Minimum rectangular triangles: \n" + triangleProcessor.MinTriangle(rectangularTriangles));
        System.out.println("Maximum rectangular triangles: \n" + triangleProcessor.MaxTriangle(rectangularTriangles));

        System.out.println("\nDefault triangles: " + triangleProcessor.DefaultCounter(triangles));
        Triangle[] abilityTriangles = triangleProcessor.filterByAbility(triangles);
        System.out.println("Minimum default triangle: \n" + triangleProcessor.MinTriangle(abilityTriangles));
        System.out.println("Maximum default triangle: \n" + triangleProcessor.MaxTriangle(abilityTriangles));

    }
}