package implementsTriangle.Cryteria.Arbitrary;

import Triangle.Triangle;
import triangleFunction.Criteria;
public class Arbitrary implements Criteria {

    @Override
    public boolean check(Triangle triangle) {
        return triangle.isArbitrary();
    }
}