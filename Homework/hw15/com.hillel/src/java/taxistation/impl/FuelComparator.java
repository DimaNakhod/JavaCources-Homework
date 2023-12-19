package taxistation.impl;

import taxistation.car_classification.Car;

import java.util.Comparator;

public class FuelComparator implements Comparator<Car> {
    @Override
    public int compare(Car carOne, Car carTwo) {
        return Integer.compare(carOne.getFuelConsumption(),carTwo.getFuelConsumption());
    }

}