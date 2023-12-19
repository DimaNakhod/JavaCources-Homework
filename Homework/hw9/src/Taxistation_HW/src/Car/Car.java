package Car;

public class Car {
    private final int price;
    private int fuelConsumption;
    private int maxSpeed;

    public Car(int price, int fuelConsumption, int maxSpeed) {
        this.price = price;
        this.fuelConsumption = fuelConsumption;
        this.maxSpeed = maxSpeed;
    }

    public Car( int price, int maxSpeed){
        this(price, 0, maxSpeed);
    }
    public int getPrice() {
        return price;
    }
    public void setPrise(int Prise){
    }
    public int getFuelConsumption() {
        return fuelConsumption;
    }
    public void setFuelConsumption(int fuelConsumption){
        this.fuelConsumption = fuelConsumption;
    }
    public int getMaxSpeed(){
        return maxSpeed;
    }
    public void setMaxSpeed(int maxSpeed){
        this.maxSpeed = maxSpeed;
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