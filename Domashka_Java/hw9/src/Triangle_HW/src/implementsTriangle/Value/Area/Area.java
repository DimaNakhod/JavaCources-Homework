package implementsTriangle.Value.Area;

import Triangle.Triangle;
import triangleFunction.Value;

public class Area implements Value {

    @Override
    public double getValue(Triangle triangle) {
        return triangle.findArea();
    }

}