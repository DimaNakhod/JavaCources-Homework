package car_classification;

public class PassengerCar extends Car{

    private String color;

    public PassengerCar(String model, String brand, int year, double fuelConsumption, double maxSpeed, double price) {
        super(model, brand, year, fuelConsumption, maxSpeed, price);

        this.color = color;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "PassengerCar{" +
                "color='" + color + '\'' +
                '}';
    }
}
