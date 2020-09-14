package car.classifications;

public class TrackCar extends Car{
    private int liftingCapacity;

    public TrackCar(String brand, double price, double maxSpeed, int fuelConsumption, int liftingCapacity) {
        super(brand, price, maxSpeed, fuelConsumption);
        this.liftingCapacity = liftingCapacity;
    }

    public int getLiftingCapacity() {
        return liftingCapacity;
    }
    public void setLiftingCapacity(int liftingCapacity) {
        this.liftingCapacity = liftingCapacity;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "TrackCar{" +
                "liftingCapacity=" + liftingCapacity +
                '}';
    }
}