package Accessory;

public class Accessory {
    private String NameOfAccessory;
    private int PriceOfAccessory;

    public Accessory(String NameOfAccessory, int PriceOfAccessory) {
        this.NameOfAccessory = NameOfAccessory;
        this.PriceOfAccessory = PriceOfAccessory;
    }

    public String getNameOfAccessory() {
        return NameOfAccessory;
    }
    public void setNameOfAccessory(String NameOfAccessory) {
        this.NameOfAccessory = NameOfAccessory;
    }

    public int getPriceOfAccessory() {
        return PriceOfAccessory;
    }
    public void setPriceOfAccessory(int PriceOfAccessory) {
        this.PriceOfAccessory = PriceOfAccessory;
    }

    @Override
    public String toString() {
        return NameOfAccessory + " [price=" + PriceOfAccessory + "]";
    }
}
