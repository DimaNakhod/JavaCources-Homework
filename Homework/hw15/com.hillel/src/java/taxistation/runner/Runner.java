package taxistation.runner;

import taxistation.car_classification.Car;
import taxistation.car_classification.PassengerCar;
import taxistation.car_classification.TruckCar;
import taxistation.worker.TaxiStationClass;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<Car> list = new ArrayList<>();
        list.add (new PassengerCar("Bmw" , 120000, 160.0, 24));
        list.add (new TruckCar("Scania", 200000, 80, 18));
        list.add (new PassengerCar("Mercedes", 100000, 160, 16));

        TaxiStationClass taxo = new TaxiStationClass(list);
        taxo.sortingCarsByFuelConsumption();
        System.out.println(taxo);
    }
}
