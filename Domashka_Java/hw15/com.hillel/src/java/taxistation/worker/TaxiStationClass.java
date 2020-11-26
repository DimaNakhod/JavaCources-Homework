package taxistation.worker;

import taxistation.car_classification.Car;

import java.util.ArrayList;
import java.util.*;

public class TaxiStationClass {

    private List<Car> cars;

    public TaxiStationClass(List<Car> cars) {
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
        cars.sort(comparator);
    }
//
    public List<Car> CarsSpeedRange(int minSpeed, int maxSpeed) {
        List<Car> result = new ArrayList<>();
        for (Car car : cars) {
            if (car.getMaxSpeed() >= minSpeed && car.getMaxSpeed() <= maxSpeed) {
                result.add(car);
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
                "cars=" + cars +
                '}';
    }
}