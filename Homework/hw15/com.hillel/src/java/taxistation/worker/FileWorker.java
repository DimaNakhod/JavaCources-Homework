package taxistation.worker;

import taxistation.car_classification.Car;
import taxistation.car_classification.PassengerCar;
import taxistation.car_classification.TruckCar;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileWorker {
    private String ByteTaker;
    private String StartFile;
    private String FinalFile;

    public FileWorker(String StartFile, String FinalFile) {
        this.StartFile = StartFile;
        this.FinalFile = FinalFile;
    }

    public List<Car> readFile() {
        try (FileInputStream inputStream = new FileInputStream(StartFile)) {
            byte[] bytesArray = inputStream.readAllBytes();
            ByteTaker = new String(bytesArray);
        } catch (IOException e) {
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

    private List<Car> createCars() {
        List<Car> result = new ArrayList<>();
        String[] linesArray = ByteTaker.split(";\r\n");
        for (
                String line : linesArray) {
            String[] element = line.split(",");
            switch (element[0]) {
                case "PassengerCar":
                    result.add(new PassengerCar(element[1], Double.parseDouble(element[2]), Double.parseDouble(element[3]),
                            Integer.parseInt(element[4])));
                    break;

                case "Truck":
                    result.add(new TruckCar(element[1], Double.parseDouble(element[2]),
                            Double.parseDouble(element[3]),
                            Integer.parseInt(element[4])));
                    break;
            }
        }
        return result;
    }
}