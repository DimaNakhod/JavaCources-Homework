package implementsTriangle.Cryteria.Isosceles;

import Triangle.Triangle;
import triangleFunction.Criteria;

public class Isosceles implements Criteria {

    @Override
    public boolean check(Triangle triangle) {
        return triangle.isIsosceles();
    }
}