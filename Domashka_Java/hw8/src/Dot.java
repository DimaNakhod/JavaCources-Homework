public class Dot {
    private double X;
    private double Y;

    public Dot(double X, double Y) {
        this.X = X;
        this.Y = Y;
    }

    public double getX() {
        return X;
    }

    public void setX(double X) {
        this.X = X;
    }

    public double getY() {
        return Y;
    }

    public void setY(double Y) {
        this.Y = Y;
    }

    @Override
    public String toString() {
        return "Dot{" + X + Y + '}';
    }
}
