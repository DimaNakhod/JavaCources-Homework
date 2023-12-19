package implementsTriangle.Value.Perimeter;

import Triangle.Triangle;
import triangleFunction.Value;

public class Perimeter implements Value {

    @Override
    public double getValue(Triangle triangle) {
        return triangle.findPerimeter();
    }
}