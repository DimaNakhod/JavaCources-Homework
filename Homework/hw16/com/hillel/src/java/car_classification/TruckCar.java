package car_classification;

public class TruckCar extends Car {

    private int weight;

    public TruckCar(String model, String brand, int year, double fuelConsumption, double maxSpeed, double price, int passengerSeats) {
        super(model, brand, year, fuelConsumption, maxSpeed, price);

        this.weight = weight;
    }
    public double getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "TruckCar{" +
                "weight=" + weight +
                '}';
    }
}
