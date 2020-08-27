package Flower;

public class Flower implements Comparable<Flower> {
    private String Name;
    private int PriceOfFlower;
    private int LengthOfStem;
    private int DaysToLive;

    public Flower(int PriceOfFlower, int LengthOfStem, String Name, int DaysToLive) {
        this.PriceOfFlower = PriceOfFlower;
        this.LengthOfStem = LengthOfStem;
        this.Name = Name;
        this.DaysToLive = DaysToLive;
    }

    public boolean isStemLengthInRange(int minLength, int maxLength) {
        return getLengthOfStem() >= minLength && getLengthOfStem() <= maxLength;
    }

    @Override
    public int compareTo(Flower another) {
        return Integer.compare(this.getDaysToLive(), another.getDaysToLive());
    }

    public int getPriceOfFlower() {
        return PriceOfFlower;
    }
    public void setPriseOfFlower(int PriceOfFlower) {
        this.PriceOfFlower = PriceOfFlower;
    }

    public int getLengthOfStem() {
        return LengthOfStem;
    }
    public void setLengthOfStem(int LengthOfStem) {
        this.LengthOfStem = LengthOfStem;
    }

    public int getDaysToLive() {
        return DaysToLive;
    }
    public void setDaysToLive(int DaysToLive) {
        this.DaysToLive = DaysToLive;
    }

    public String getName() {
        return Name;
    }
    public void setName(String Name) {
        this.Name = Name;
    }

    @Override
    public String toString() {
        return Name + " [price=" + PriceOfFlower + ", daysToLive="
                + DaysToLive + ", stemLength=" + LengthOfStem + "]";
    }

}