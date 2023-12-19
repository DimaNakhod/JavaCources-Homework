package processor;

import Triangle.Triangle;
import implementsTriangle.Cryteria.Arbitrary.Arbitrary;
import implementsTriangle.Cryteria.Equilateral.Equilateral;
import implementsTriangle.Cryteria.Isosceles.Isosceles;
import implementsTriangle.Cryteria.Rectangular.Rectangular;
import implementsTriangle.Value.Perimeter.Perimeter;
import triangleFunction.Criteria;
import triangleFunction.Value;

public class TriangleProcessor {

    private Triangle[] triangles;
    Criteria criteria;
    Value value;

    public TriangleProcessor(Triangle[] triangles) {
        this.triangles = triangles;
    }

    public int countEquilateral() {
        criteria =  new Equilateral();
        return countByType(criteria);
    }

    public int countIsosceles() {
        criteria =  new Isosceles();
        return countByType(criteria);
    }

    public int countRectangular() {
        criteria =  new Rectangular();
        return countByType(criteria);
    }

    public int countArbitrary() {
        criteria =  new Arbitrary();
        return countByType(criteria);
    }

    public Triangle showBiggestPerimeterOfEquilateral() {
        criteria =  new Equilateral();
        value = new Perimeter();
        return findBiggest(criteria,value);
    }

    public Triangle showBiggestPerimeterOfIsosceles() {
        criteria =  new Isosceles();
        value =  new Perimeter();
        return findBiggest(criteria,value);
    }

    public Triangle showBiggestPerimeterOfRectangular() {
        criteria = new Rectangular();
        value = new Perimeter();
        return findBiggest(criteria, value);
    }

    private int countByType(Criteria criteria) {
        int count = 0;
        for (int i = 0; i < triangles.length; i++) {
            if(criteria.check(triangles[i]))
                count++;
        }
        return count;
    }

    private Triangle findSmallest(Criteria criteria, Value value) {
        Triangle result = triangles[0];
        for(int i = 0; i < triangles.length; i++){
            if (criteria.check(triangles[i]) && value.getValue(triangles[i]) < value.getValue(result)) {
                result = triangles[i];
            }
        }
        return result;
    }

    private Triangle findBiggest(Criteria criteria, Value value) {
        Triangle result = triangles[0];
        for(int i = 0; i < triangles.length; i++){
            if (criteria.check(triangles[i]) && value.getValue(triangles[i]) > value.getValue(result)) {
                result = triangles[i];
            }
        }
        return result;
    }
}
