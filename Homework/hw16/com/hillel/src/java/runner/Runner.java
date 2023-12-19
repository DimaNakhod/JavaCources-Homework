package runner;

import car_classification.Car;
import car_classification.PassengerCar;
import car_classification.TruckCar;
import taxipark.TaxiPark;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

        List<Car> list = new ArrayList<>();
        list.add(new Car("Audi", "R8", 2014, 6, 250, 20000));
        list.add(new PassengerCar("Ford", "Raptor", 2010, 10, 180, 25000));
        list.add(new TruckCar("Suzu Ataman", "A4205", 2008, 15, 130, 15000, 25));
        list.add(new PassengerCar("Dodge", "Craiz", 2017, 17, 200, 35000));
        list.add(new TruckCar("Icarus", "T3242", 2003, 10, 120, 7000, 20));

        TaxiPark tx = new TaxiPark();

        System.out.println("1. Total cars' price sum");
        System.out.println(tx.calculatePrice(list) + " $");

        System.out.println("2.Sort by fuel consumption");
        tx.sortFuel(list);

        System.out.println("3.Find cars by speed range");
        tx.findCarsBySpeed(list,120,200);

    }
}
