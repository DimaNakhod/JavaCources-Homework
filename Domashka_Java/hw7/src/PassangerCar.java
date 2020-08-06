public class PassangerCar extends Car {
    private int  maxNumberOfPassengers;
    private boolean roofExisting;
    private String passAbility;

    public PassangerCar( int price, int fuelConsumption, int maxSpeed, int maxNumberOfPassengers, boolean roofExisting,String passAbility){
        super(price,fuelConsumption,maxSpeed);
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

    public boolean getRoofExisting(){
        return roofExisting;
    }
    public void setRoofExisting(boolean roofExisting) {
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
        return "PassangerCar{" +
                "maxNumberOfPassengers=" + maxNumberOfPassengers +
                ", roofExisting=" + roofExisting +
                ", passAbility='" + passAbility + '\'' +
                '}';
    }
}
