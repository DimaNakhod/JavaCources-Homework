package ConsoleWork;

import Accessory.Accessory;
import Flowershop.FlowerShop;
import bouquet.Bouquet;
import java.util.Arrays;
import java.util.Scanner;
import Flower.Flower;
import exeption.InvalidStemLengthException;

import static ArrayUtils.ArrayUtils.extendArrayWithNewItem;

public class ConsoleWork {

    private FlowerShop flowerShop;
    private Scanner scan;

    public ConsoleWork(FlowerShop flowerShop) {
        this.flowerShop = flowerShop;
        scan = new Scanner(System.in);
    }

    public static void main(String[] args) {
        FlowerShop shop = new FlowerShop();
        ConsoleWork flowersWorker = new ConsoleWork(shop);
        flowersWorker.start();
        flowersWorker.stop();
    }

    public void start() {

        int choiсe = 0;
        do {
            System.out.println("1. Create bouquet ");
            System.out.println("2. Bouquet operations ");
            System.out.println("3. Print current bouquet ");
            System.out.println("0. Exit ");

            choiсe = scan.nextInt();

            switch (choiсe) {
                case 0:
                    return;
                case 1:
                    Bouquet createdBouquet = createBouquet();
                    flowerShop.addBouquet(createdBouquet);
                    System.out.println("Created bouquet price " + createdBouquet.price());
                    break;
                case 2:
                    bouquetChoosing();
                    break;
                case 3:
                    System.out.println("flowersShop");
            }
        }
        while (true);
    }

    private void operationsUnderBouquet(Bouquet bouquet) {
        int choice = 0;
        do {
            System.out.println(bouquet);
            System.out.println("1. Sort flowers by days to live");
            System.out.println("2. Find flowers by  length of stem");
            System.out.println("3. Price of Bouquet");
            System.out.println("4. Add flower");
            System.out.println("5. Add accessory");
            System.out.println("0. Exit");

            choice = scan.nextInt();

            switch (choice) {
                case 1:
                    bouquet.sortFlowersByDaysToLive();
                    break;
                case 2:
                    findFlowers(bouquet);
                    break;
                case 3:
                    System.out.println("Price: " + bouquet.price());
                    break;
                case 4:
                    bouquet.addFlower(createFlower());
                    break;
                case 5:
                    bouquet.addAccessory(createAccessory());
                    break;
                case 0:
                    return;
            }
        } while (choice != -1);
    }

    private void bouquetChoosing() {
        int choice = 0;
        do {
            System.out.println("Choose your bouquet");
            for (int i = 0; i < FlowerShop.getBouquets().length; i++) {
                System.out.println(i + " -> " + FlowerShop.getBouquets()[i]);
            }
            System.out.println("Enter 0 to exit");

            choice = scan.nextInt();

            if (choice == 0) {
                return;
            } else {
                operationsUnderBouquet(FlowerShop.getBouquets()[choice]);
            }
        } while (true);
    }

    private void findFlowers(Bouquet bouquet) {
        System.out.println("Min length: ");
        int minLength = scan.nextInt();

        System.out.println("Max length: ");
        int maxLength = scan.nextInt();

        try {
            Flower[] found = bouquet.findFlowersByLengthOfStem(minLength, maxLength);
            System.out.println("Found flowers: ");
            System.out.println(Arrays.toString(found));
        } catch (InvalidStemLengthException e) {
            e.printStackTrace();
        }
    }

    private Bouquet createBouquet() {
        Flower[] flowers = new Flower[0];
        Accessory[] accessories = new Accessory[0];

        int choice = 0;
        do {
            System.out.println("1. Create flowers");
            System.out.println("2. Create accessories");
            System.out.println("0. Back");

            choice = scan.nextInt();

            switch (choice) {
                case 1:
                    flowers = createFlowersArray();
                    break;
                case 2:
                    accessories = createAccessoriesArray();
                    break;
                case 0:
                    break;
            }
        } while (choice != 0);

        return new Bouquet(flowers, accessories);
    }

    private Flower createFlower() {
        System.out.println("Name -> ");
        String name = scan.next();

        System.out.println("Price -> ");
        int price = scan.nextInt();

        System.out.println("Days to live -> ");
        int daysToLive = scan.nextInt();

        System.out.println("Stem length -> ");
        int stemLength = scan.nextInt();

        return new Flower(daysToLive, price, name, stemLength);
    }

    private Accessory createAccessory() {
        System.out.println("Name -> ");
        String name = scan.next();

        System.out.println("Price -> ");
        int price = scan.nextInt();

        return new Accessory(name, price);
    }



    private Flower[] createFlowersArray() {
        Flower[] result = new Flower[0];

        int choice = 0;
        do {
            System.out.println("1. New flower");
            System.out.println("0. Back");

            choice = scan.nextInt();

            switch (choice) {
                case 1:
                    result = extendArrayWithNewItem(createFlower(), result);
                    break;
                case 0:
                    break;
            }
        } while (choice != 0);

        return result;
    }

    private Accessory[] createAccessoriesArray() {
        Accessory[] result = new Accessory[0];

        int choise = 0;
        do {
            System.out.println("1. New accessory");
            System.out.println("0. Back");

            choise = scan.nextInt();

            switch (choise) {
                case 1:
                    result = extendArrayWithNewItem(createAccessory(), result);
                    break;
                case 0:
                    break;
            }
        } while (choise != 0);

        return result;
    }
    public void stop() {
        scan.close();
    }

    public FlowerShop getFlowersShop() {
        return flowerShop;
    }

    public void setFlowersShop(FlowerShop flowersShop) {
        this.flowerShop = flowersShop;
    }

    public Scanner getScanner() {
        return scan;
    }

    public void setScanner(Scanner scanner) {
        this.scan = scanner;
    }


}