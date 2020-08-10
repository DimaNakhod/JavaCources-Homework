public class Triangle {
    //Dots//
    private Dot A;
    private Dot B;
    private Dot C;

    private double sideA;
    private double sideB;
    private double sideC;
    public Triangle(Dot A, Dot B, Dot C) {
        this.A = A;
        this.B = B;
        this.C = C;
        SidesOfTriangle();
    }
    public void SidesOfTriangle(){

        this.sideA = RoundedBwDotsDistance(A, B);
        this.sideB = RoundedBwDotsDistance(B, C);
        this.sideC = RoundedBwDotsDistance(C, A);
    }

    public double BwDotsDistance(Dot A, Dot B) {
        return Math.sqrt(Math.pow(A.getX() - B.getX(), 2) + Math.pow(A.getY() - B.getY(), 2));
    }

    public double RoundedBwDotsDistance(Dot A, Dot B) {
        return Math.round(Math.sqrt(Math.pow(A.getX() - B.getX(), 2) + Math.pow(A.getY() - B.getY(), 2)));
    }

    public double Area() {
        double halfP = (sideA + sideB + sideC) / 2;
        double Area;
        return Area = (sideA / 2) * Math.sqrt(halfP * (halfP - sideA) * (halfP - sideB) * (halfP - sideC));
    }

    public double Perimeter() {
        if (Equilateral()) {
            return Math.pow(BwDotsDistance(A, B), 3);
        } else {
            return sideA + sideB + sideC;
        }
    }
    public boolean Isosceles() {
        double a = BwDotsDistance(A, B);
        double b = BwDotsDistance(B, C);
        double c = BwDotsDistance(C, A);

        if (Equilateral() || Rectangular()) {
            return false;
        }
        return (a == b) || (b == c) || (c == a);
    }

    public boolean Equilateral() {
        if (Rectangular()) {
            return false;
        }
        return (sideA == sideB) && (sideB == sideC) && (sideC == sideA);
    }

    public boolean Rectangular() {
        double sideA = BwDotsDistance(A, B);
        double sideB = BwDotsDistance(B, C);
        double sideC = BwDotsDistance(C, A);
        double aSquare = Math.pow(sideA, 2);
        double bSquare = Math.pow(sideB, 2);
        double cSquare = Math.round(Math.pow(sideC, 2));
        return aSquare + bSquare == cSquare;
    }
    @Override
    public String toString() {
        return "Triangle: \n" + A.toString() + "\n" +
                B.toString() + "\n" +
                C.toString() + "\n" +
                "Equilateral: " + Equilateral() +
                "\nIsosceles: " + Isosceles() +
                "\n" + "Rectangular: " + Rectangular();
    }
}
