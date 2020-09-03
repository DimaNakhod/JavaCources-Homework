package implementsTriangle.Cryteria.Equilateral;

import Triangle.Triangle;
import triangleFunction.Criteria;

public class Equilateral implements Criteria {

    @Override
    public boolean check(Triangle triangle) {
        return triangle.isEquilateral();
    }
}