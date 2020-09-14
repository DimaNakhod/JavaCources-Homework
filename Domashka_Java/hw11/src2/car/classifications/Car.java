package car.classifications;

public class Car {
    private String brand;
    private double price;
    private double maxSpeed;
    private int fuelConsumption;

    public Car(String brand, double price, double maxSpeed, int fuelConsumption) {
        this.brand = brand;
        this.price = price;
        this.maxSpeed = maxSpeed;
        this.fuelConsumption = fuelConsumption;
    }
    public String getBrand() {
        return brand;
    }
    public double getPrice() {
        return price;
    }
    public int getFuelConsumption() {
        return fuelConsumption;
    }
    public double getMaxSpeed(){
        return maxSpeed;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Car{" +
                "price=" + price +
                ", fuelConsumption=" + fuelConsumption +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}