public class TrackCar extends Car{
    int liftingCapacity;

    public TrackCar(int price, int fuelConsumption, int maxSpeed, int liftingCapaсity){
        super(price,fuelConsumption,maxSpeed);
        this.liftingCapacity = liftingCapaсity;
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
