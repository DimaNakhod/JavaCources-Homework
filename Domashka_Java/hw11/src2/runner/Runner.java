package runner;

import car.classifications.Car;
import file.worker.FileWorker;

import static taxistation.TaxiStationInterface.cars;

public class Runner {
    public static void main(String[] args) {

        FileWorker fileWorker = new FileWorker("StartFile.txt", "FinalFile.txt");
        Car[] cars = fileWorker.readFile();
        fileWorker.writeFile(cars);
    }
}
