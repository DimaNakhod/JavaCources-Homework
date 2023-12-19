package taxistation.car_classification;

public class TruckCar extends Car {

    private int weight;

    public TruckCar(String brand, double price, double maxSpeed, int fuelConsumption) {
        super(brand, price, maxSpeed, fuelConsumption);
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
        return super.toString() + "," + weight + ";\r\n";
    }
}
