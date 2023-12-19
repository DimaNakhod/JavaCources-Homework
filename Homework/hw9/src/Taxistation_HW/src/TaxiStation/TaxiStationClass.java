package TaxiStation;
import Car.Car;

public class TaxiStationClass implements TaxiStation{

    public Car[] cars;

    public TaxiStationClass(Car[] cars){
        this.cars = cars;
    }

    @Override
    public void TaxiStationPark(Car[] cars) {
        this.cars = cars;
    }

    @Override
    public int priceOfTaxiStation() {
        int price = 0;
        for (Car car : cars) {
            price += car.getPrice();
        }
        return price;
    }

    @Override
    public void sortingCarsByFuelConsumption() {
        for (int i = 0; i < cars.length; i++) {
            for (int j = 1; j < cars.length; j++) {
                if (cars[ j- 1].getFuelConsumption() > cars[i].getFuelConsumption()){
                    Car temp = cars[j - 1];
                    cars[j - 1] = cars[j];
                    cars[j] = temp;
                }
            }
        }
    }

    @Override
    public Car[] getCars() {
        return cars;

    }

    @Override
    public void setCars(Car[] cars) {
        this.cars = cars;
    }

    @Override
    public Car[] CarsSpeedRange(int minSpeed, int maxSpeed) {
        Car[] result = {};
        for (Car car : getCars()) {
            if (car.getMaxSpeed() >= minSpeed && car.getMaxSpeed() <= maxSpeed) {
                result = ExtendedArrayOfCars(car, result);
            }
        }
        return result;
    }

    @Override
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
    @java.lang.Override
    public java.lang.String toString() {
        return "TaxiStation{" + "cars=" + java.util.Arrays.toString(cars) + '}';
    }
}
