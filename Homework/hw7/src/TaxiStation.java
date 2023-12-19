public class TaxiStation {

    private Car[] cars;

    public TaxiStation(Car[] cars) {
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
        for (int i = 0;i < cars.length; i++) {
            for (int j = i + 1; j < cars.length; i++) {
                if (cars[j].getFuelConsumption() < cars[i].getFuelConsumption()){
                    Car temp = cars[j];
                    cars[j] = cars[i];
                    cars[i] = temp;
                }
            }
        }
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

    private Car[] ExtendedArrayOfCars(Car carsToAdd, Car[] cars) {
        if (cars.length == 0) {
            return new Car[]{carsToAdd};
        } else {
            Car[] newCarsArray = new Car[cars.length + 1];

            for (int i = 0; i < cars.length; i++) {
                newCarsArray[i] = cars[i];
            }
            newCarsArray[cars.length] = carsToAdd;
            return newCarsArray;
        }
    }

    public Car[] getCars() {
        return cars;
    }

    public void setCars(Car[] cars) {
        this.cars = cars;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "TaxiStation{" + "cars=" + java.util.Arrays.toString(cars) + '}';
    }

}