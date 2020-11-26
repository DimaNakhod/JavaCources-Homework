package taxistation.car_classification;

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

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "," + brand + "," + price + "," + maxSpeed + "," + fuelConsumption;
    }
}