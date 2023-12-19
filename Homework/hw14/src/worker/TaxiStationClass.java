package worker;

import car.clasifications.Car;

import java.util.Arrays;
import java.util.Comparator;

public class TaxiStationClass {

    public Car[] cars;

    public TaxiStationClass(Car[] cars){
        this.cars = cars;
    }

    public int priceOfTaxiStation() {
        int price = 0;
        for (Car car : cars) {
            price += car.getPrice();
        }
        return price;
    }

    public void sortingCarsByFuelConsumption() {
        Comparator<Car> comparator = Comparator.comparingInt(Car::getFuelConsumption);
        Arrays.sort(cars, comparator);
    }

    public Car[] getCars() {
        return cars;
    }

    public Car[] CarsSpeedRange(int minSpeed, int maxSpeed) {
        Car[] result = {};
        for (Car car : getCars()) {
            if (car.getMaxSpeed() >= minSpeed && car.getMaxSpeed() <= maxSpeed) {
                result = ExtendedArrayOfCars(car, result);
            }
        }
        return result;
    }

    public Car[] ExtendedArrayOfCars(Car carsToAdd, Car[] cars) {
        if (cars.length == 0) {
            return new Car[]{carsToAdd};
        } else {
            Car[] newCarsArray = new Car[cars.length + 1];

            System.arraycopy(cars, 0, newCarsArray, 0, cars.length);
            newCarsArray[cars.length] = carsToAdd;
            return newCarsArray;
        }
    }

    @Override
    public String toString() {
        return "TaxiStationClass{" +
                "cars=" + Arrays.toString(cars) +
                '}';
    }
}