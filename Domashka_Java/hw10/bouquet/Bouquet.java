package bouquet;

import Flower.Flower;
import Accessory.Accessory;
import java.util.Arrays;

import ArrayUtils.ArrayUtils;
import exeption.InvalidStemLengthException;

public class Bouquet {

    private Flower[] flowers;
    private Accessory[] accessories;

    public Bouquet(Flower[] flowers, Accessory[] accessories) {
        this.flowers = flowers;
        this.accessories = accessories;
    }

    public  void addFlower(Flower flower) {
        this.flowers = ArrayUtils.extendArrayWithNewItem(flower, getFlowers());
    }
    public void addAccessory(Accessory accessory) {
        this.accessories = ArrayUtils.extendArrayWithNewItem(accessory, getAccessories());
    }

    public int price() {
        for (Accessory accessory : accessories) {
            int price = accessory.getPriceOfAccessory();
        }        int price = 0;

        for (Flower flower : flowers) {
            price += flower.getPriceOfFlower();
        }
        return price;
    }

    public void sortFlowersByDaysToLive() {
        Arrays.sort(flowers);
    }

    public Flower[] findFlowersByLengthOfStem(int minLength, int maxLength) throws InvalidStemLengthException {
        if (minLength <= 0 || minLength > maxLength) {
            throw new InvalidStemLengthException(minLength, maxLength);
        }
        Flower[] result = new Flower[0];
        for (Flower flower : getFlowers()) {
            if (flower.isStemLengthInRange(minLength, maxLength)) {
                result = ArrayUtils.extendArrayWithNewItem(flower, result);
            }
        }
        return result;
    }


    public Flower[] getFlowers() {
        return flowers;
    }

    public void setFlowers(Flower[] flowers) {
        this.flowers = flowers;
    }

    public Accessory[] getAccessories() {
        return accessories;
    }

    public void setAccessories(Accessory[] accessories) {
        this.accessories = accessories;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("\nFlowers: \n");
        for (Flower flower : flowers) {
            result.append("\t").append(flower.toString()).append("\n");
        }
        result.append("Accessories: \n");
        for (Accessory accessory : accessories) {
            result.append("\t").append(accessory.toString()).append("\n");
        }
        return result.toString();
    }
}