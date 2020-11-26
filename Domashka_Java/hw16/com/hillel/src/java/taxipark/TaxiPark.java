package taxipark;

import car_classification.Car;
import comparator.FuelComparator;

import java.util.List;

public class TaxiPark {
    public double calculatePrice(List<Car> list) {
        double totalPrice = list.stream().mapToDouble(car -> car.getPrice()).sum();

        return totalPrice;
    }

    public void sortFuel(List<Car> list) {
        list.stream().sorted(new FuelComparator()).forEach(System.out::println);
    }

    public void findCarsBySpeed(List<Car> list, int min, int max) {

        list.stream().filter(car -> car.getSpeed() >= min && car.getSpeed() <= max).forEach(System.out::println);
    }
}
