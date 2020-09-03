package TrackCar;

import Car.Car;

public class TrackCar extends Car {
    int liftingCapacity;

    public TrackCar(int price, int fuelConsumption, int maxSpeed, int liftingCapaсity){
        super(price,fuelConsumption,maxSpeed);
        this.liftingCapacity = liftingCapaсity;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "TrackCar{" +
                "liftingCapacity=" +
                liftingCapacity +
                '}';
    }
}
