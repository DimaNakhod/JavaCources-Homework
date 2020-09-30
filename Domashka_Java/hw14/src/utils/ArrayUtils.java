package utils;

import car.clasifications.Car;

public class ArrayUtils {
    public static Car[] increaseCarArray(Car[] cars) {
        Car[] tempArray = new Car[cars.length + 1];
        for(int i = 0; i < cars.length; i++) {
            tempArray[i] = cars[i];
        } return tempArray;
    }

    public static Car[] increaseCarArrayByOneItem(Car[] cars, Car car) {
        Car[] result =  increaseCarArray(cars);
        result[result.length - 1] = car;
        return result;
    }
}
