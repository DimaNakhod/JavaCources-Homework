package runner;
import Triangle.Point;
import Triangle.*;
import processor.TriangleProcessor;

public class Runner {

    public static void main(String[] args) {
        Point p1 = new Point(2,1);
        Point p2 = new Point(3,3);
        Point p3 = new Point(4,1);
        Triangle t1 = new Triangle(p1,p2,p3);
        Point p4 = new Point(2,1);
        Point p5 = new Point(2,6);
        Point p6 = new Point(6,1);
        Triangle t2 = new Triangle(p4,p5,p6);
        Point p7 = new Point(2,2);
        Point p8 = new Point(6,6);
        Point p9 = new Point(7,0);
        Triangle t3 = new Triangle(p7,p8,p9);
        Point p10 = new Point(0,0);
        Point p11 = new Point(5,8.6602540378443865);
        Point p12 = new Point(10,0);
        Triangle t4 = new Triangle(p10,p11,p12);
        Triangle t5 = new Triangle(p1, p5, p11);
        Triangle t6 = new Triangle(p12, p9, p5);

        System.out.println(t6.findPerimeter());
        System.out.println(t1.findArea());

        Triangle[] triangles = new Triangle[6];
        triangles[0] = t1;
        triangles[1] = t2;
        triangles[2] = t3;
        triangles[3] = t4;
        triangles[4] = t5;
        triangles[5] = t6;

        TriangleProcessor proc = new TriangleProcessor(triangles);
        System.out.println(proc.countIsosceles());
        System.out.println(proc.countArbitrary());
        System.out.println(proc.countEquilateral());
        System.out.println(proc.countRectangular());
        System.out.println(proc.showBiggestPerimeterOfEquilateral());
    }
}
