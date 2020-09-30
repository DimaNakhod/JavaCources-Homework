package runner;

import car.clasifications.Car;
import car.clasifications.PassengerCar;
import car.clasifications.TruckCar;
import worker.TaxiStationClass;

public class Runner {
    public static void main(String[] args) {
        Car[] cars = new Car[3];
        cars[0] = new PassengerCar("Bmw" , 120000, 160.0, 24);
        cars[1] = new TruckCar("Scania", 200000, 80, 18);
        cars[2] = new PassengerCar("Mercedes", 100000, 160, 16);

        TaxiStationClass taxo = new TaxiStationClass(cars);
         taxo.sortingCarsByFuelConsumption();
        System.out.println(taxo);
    }
}
