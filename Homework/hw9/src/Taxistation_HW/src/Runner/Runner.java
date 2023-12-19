package Runner;
import Car.Car;
import TaxiStation.TaxiStationClass;
import java.util.Arrays;
import PassengerCar.*;
import TrackCar.*;
public class Runner {
    public static void main(String[] args) {
        Car[] cars = {new PassengerCar(111111, 32, 100, 8, true, "low"),
                new TrackCar(200000, 35, 150, 8),
                new PassengerCar(150000, 12, 350, 4, false, "middle"),
                new TrackCar(300000, 17, 120, 20),
                new PassengerCar(1000000, 25, 400, 2, false, "high"),
                new TrackCar(2000000, 45, 178, 40)};
        TaxiStationClass prc = new TaxiStationClass(cars);

        System.out.println(prc.priceOfTaxiStation());
        System.out.println();

        System.out.println(prc);
        System.out.println();

        prc.sortingCarsByFuelConsumption();
        System.out.println();

        System.out.println(Arrays.toString(prc.CarsSpeedRange(140, 200)));
        System.out.println(Arrays.toString(prc.cars));
    }
}

