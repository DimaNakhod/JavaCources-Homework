package car_classification;

public class Car {
    private String model;
    private String brand;
    private int year;
    private double fuelConsumption;
    private double maxSpeed;
    private double price;


    public Car(String model, String brand, int year, double fuelConsumption, double maxSpeed, double price) {
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.fuelConsumption = fuelConsumption;
        this.maxSpeed = maxSpeed;
        this.price = price;
    }


    public double getPrice() {
        return price;
    }

    public double getSpeed() {
        return maxSpeed;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ":\n" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", year=" + year +
                ", fuelConsumption=" + fuelConsumption +
                ", speed=" + maxSpeed +
                ", price=" + price;
    }
}
