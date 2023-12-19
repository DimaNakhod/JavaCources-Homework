package car.classifications;

public class PassengerCar extends Car {
    private int  maxNumberOfPassengers;
    private String roofExisting;
    private String passAbility;

    public PassengerCar(String brand,int price, int fuelConsumption, int maxSpeed, int maxNumberOfPassengers, String roofExisting, String passAbility){
        super(brand,price,fuelConsumption,maxSpeed);
        this.maxNumberOfPassengers = maxNumberOfPassengers;
        this.passAbility = passAbility;
        this.roofExisting = roofExisting;
    }

    public int getMaxNumberOfPassengers(){
        return maxNumberOfPassengers;
    }
    public void setMaxNumberOfPassengers(int maxNumberOfPassengers) {
        this.maxNumberOfPassengers = maxNumberOfPassengers;
    }

    public String getRoofExisting(){
        return roofExisting;
    }
    public void setRoofExisting(String roofExisting) {
        this.roofExisting = roofExisting;
    }

    public String getPassAbility() {
        return passAbility;
    }
    public void setPassAbility(String passAbility) {
        this.passAbility = passAbility;
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