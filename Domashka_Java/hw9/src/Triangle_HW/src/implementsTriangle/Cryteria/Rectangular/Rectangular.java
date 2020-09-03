package implementsTriangle.Cryteria.Rectangular;

import Triangle.Triangle;
import triangleFunction.Criteria;

public class Rectangular implements Criteria {

    @Override
    public boolean check(Triangle triangle) {
        return triangle.isRectangular();
    }
}