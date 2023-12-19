package utils;

import car.classifications.Car;

public class ArrayUtils {

    public static Car[] increaseCarArray(Car[] cars) {
        Car[] tempArray = new Car[cars.length + 1];
        System.arraycopy(cars, 0, tempArray, 0, cars.length);
        return tempArray;
    }

    public static Car[] increaseCarArrayByOneItem(Car[] cars, Car car) {
        Car[] result =  increaseCarArray(cars);
        result[result.length - 1] = car;
        return result;
    }
}
