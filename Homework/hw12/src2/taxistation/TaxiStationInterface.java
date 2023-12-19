package taxistation;

import car.classifications.Car;

public interface TaxiStationInterface {
    public Car[] cars = new Car[0];

    void TaxiStationPark(Car[] cars);

    public int priceOfTaxiStation();

    public void sortingCarsByFuelConsumption();

    public Car[] CarsSpeedRange(int minSpeed, int maxSpeed);

    default Car[] ExtendedArrayOfCars(Car carsToAdd, Car[] cars) {
        return cars;
    }

    public Car[] getCars();

    public void setCars(Car[] cars);

    @java.lang.Override
    public java.lang.String toString();

}