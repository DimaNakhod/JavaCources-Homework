package worker;

import car.clasifications.Car;
import car.clasifications.PassengerCar;
import car.clasifications.TruckCar;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import static utils.ArrayUtils.increaseCarArrayByOneItem;

public class FileWorker {
    private String ByteTaker;
    private String StartFile;
    private String FinalFile;

    public FileWorker(String StartFile,String FinalFile){
        this.StartFile = StartFile;
        this.FinalFile = FinalFile;
    }

    public Car[] readFile() {
        try(FileInputStream inputStream = new FileInputStream(StartFile)) {
            byte[] bytesArray = inputStream.readAllBytes();
            ByteTaker = new String(bytesArray);
        }catch (FileNotFoundException e){
                System.out.println(e.getMessage());
            }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return createCars();
    }

    public void writeFile(Car[] cars) {
        try (FileOutputStream outputStream = new FileOutputStream(FinalFile)) {
            for (Car car : cars) {
                ByteTaker = car.toString();
                byte[] bytesArray = FinalFile.getBytes();
                outputStream.write(bytesArray);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(FinalFile);
        System.out.println(StartFile);

    }
    private Car[] createCars () {
        Car[] result = new Car[0];
        String[] linesArray = ByteTaker.split(";\r\n");
        for (String line : linesArray) {
            String[] element = line.split(",");
            switch (element[0]) {
                case "PassengerCar":
                    result = increaseCarArrayByOneItem(result, new PassengerCar(element[1], Double.parseDouble(element[2]), Double.parseDouble(element[3]),
                           Integer.parseInt(element[4])));
                    break;

                case "Truck":
                    result = increaseCarArrayByOneItem(result, new TruckCar(element[1], Double.parseDouble(element[2]),
                            Double.parseDouble(element[3]),
                            Integer.parseInt(element[4])));
                    break;
            }
        }
        return result;
    }
}
