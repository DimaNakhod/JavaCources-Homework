package Flowershop;

import Accessory.Accessory;
import Flower.Flower;
import ArrayUtils.ArrayUtils;
import java.util.Arrays;
import bouquet.Bouquet;


public class FlowerShop {

    private static Bouquet[] bouquets;


    public FlowerShop() {
        bouquets = new Bouquet[0];
    }

    public void addBouquet(Bouquet bouquetToAdd) {
        bouquets = ArrayUtils.extendArrayWithNewItem(bouquetToAdd, bouquets);
    }

    public void addFlowerToBouquet(Flower flowerToAdd, Bouquet existingBouquet) {
        existingBouquet.addFlower(flowerToAdd);
    }

    public void addAccessoryToBouquet(Accessory accessoryToAdd, Bouquet existingBouquet){
        existingBouquet.addAccessory(accessoryToAdd);
}
    public static Bouquet[] getBouquets(){
        return bouquets;
    }
    public void setBouquets(Bouquet[] bouquets) {
        FlowerShop.bouquets = bouquets;
    }

    @Override
    public String toString() {
        return "FlowerShop{" +
                "bouquets=" + Arrays.toString(bouquets) +
                '}';
    }
}
