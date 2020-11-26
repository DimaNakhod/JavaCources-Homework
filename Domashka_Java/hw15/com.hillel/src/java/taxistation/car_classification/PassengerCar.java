package taxistation.car_classification;

public class PassengerCar extends Car{

    private String color;

    public PassengerCar(String brand, double price, double maxSpeed, int fuelConsumption) {
        super(brand, price, maxSpeed, fuelConsumption);
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
        return super.toString() + "," + color + ";\r\n";
    }
}
