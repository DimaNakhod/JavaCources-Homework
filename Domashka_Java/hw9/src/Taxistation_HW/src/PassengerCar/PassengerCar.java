package PassengerCar;
import Car.Car;

public class PassengerCar extends Car {
    private final int  maxNumberOfPassengers;
    private final boolean roofExisting;
    private final String passAbility;

    public PassengerCar( int price, int fuelConsumption, int maxSpeed, int maxNumberOfPassengers, boolean roofExisting,String passAbility){
        super(price,fuelConsumption,maxSpeed);
        this.maxNumberOfPassengers = maxNumberOfPassengers;
        this.passAbility = passAbility;
        this.roofExisting = roofExisting;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "PassengerCar{" +
                "maxNumberOfPassengers=" + maxNumberOfPassengers +
                ", roofExisting=" + roofExisting +
                ", passAbility='" + passAbility + '\'' +
                '}';
    }
}