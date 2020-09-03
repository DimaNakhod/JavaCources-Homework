package Triangle;
import utils.FigureUtils;

public class Triangle extends Figure {
    private Point A;
    private Point B;
    private Point C;

    public Triangle(Point A, Point B, Point C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }

    @Override
    public double findPerimeter() {
        return sideAB() + sideBC() + sideAC();
    }

    @Override
    public double findArea() {
        double halfPerimeter = findPerimeter() / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - sideAB()) * (halfPerimeter - sideAC()) * (halfPerimeter - sideBC()));
    }

    public double sideAB() {
        return FigureUtils.calcSideLength(A, B);
    }

    public double sideBC() {
        return FigureUtils.calcSideLength(B, C);
    }

    public double sideAC() {
        return FigureUtils.calcSideLength(A, C);
    }

    public boolean isEquilateral() {
        return sideAB() == sideAC() && sideAC() == sideBC();
    }

    public boolean isIsosceles() {
        return sideAB() == sideAC() || sideAC() == sideBC() || sideAB() == sideBC();
    }

    public boolean isRectangular() {
        return sideAB() * sideAB() == sideAC() * sideAC() + sideBC() * sideBC()
                || sideAC() * sideAC() == sideAB() * sideAB() + sideBC() * sideBC()
                || sideBC() * sideBC() == sideAC() * sideAC() + sideAB() * sideAB();
    }

    public boolean isArbitrary() {
        return !isEquilateral() && !isIsosceles() && isRectangular();
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "A=" + A +
                ", B=" + B +
                ", C=" + C +
                '}';
    }
}