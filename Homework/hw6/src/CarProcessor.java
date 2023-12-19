//CLASS PROCESSOR//
public class CarProcessor {
    Car[] proceedCars;

    public CarProcessor(Car[] cars) {
        proceedCars = cars;
    }

    public CarProcessor() {
        proceedCars = new Car[10];
    }

    private boolean isEmpty(Car[] cars) {
        boolean isEmpty = true;
        for (Car currentCar : cars) {
            if (currentCar != null) {
                isEmpty = false;
                break;
            }
        }
        return isEmpty;
    }

    //METHOD 1 //
    public void carBrandPrinter(Car[] cars, String brand) {
        int i = 0;
        for (Car currentCar : cars) {
            if (currentCar.brand.equals(brand)) {
                printCars(currentCar);
                i++;
            }
        }
    }

    //overload 1//
    public void carBrandPrinter(String brand) {
        if (isEmpty(proceedCars)) {
            printEmptyCarBase();
        } else {
            int i = 0;
            for (Car currentCar : proceedCars) {
                if (currentCar.brand.equals(brand)) {
                    printCars(currentCar);
                    i++;
                }
            }
        }
    }

    //METHOD 2//
    public void carExploitation(Car[] cars, String model, int age) {
        int i = 0;
        int thisYear = 2020;
        for (Car currentCar : cars) {
            if (currentCar.model.equals(model) & (thisYear - currentCar.yearOfProduction) > age) {
                printCars(currentCar);
                i++;
            }
        }
    }

    //overload 2//
    public void carExploitation(int i,String model, int age,int thisYear) {
        if (isEmpty(proceedCars)) {
            printEmptyCarBase();
        } else {
            for (Car currentCar : proceedCars) {
                if (currentCar.model.equals(model) & (thisYear - currentCar.yearOfProduction) > age) {
                    printCars(currentCar);
                    i++;

                }
            }
        }
    }

    //METHOD 3//
    public void highCostedCar(Car[] cars, int yearOfProduction, int price) {
        int i = 0;
        for (Car currentCar : cars) {
            if (currentCar.yearOfProduction == yearOfProduction & currentCar.price > price) {
                printCars(currentCar);
            }
        }
    }

    //overload 3//
    public void highCostedCar(int yearOfProduction, int price) {
        if (isEmpty(proceedCars)) {
            printEmptyCarBase();
        }
        else{
            int i = 0;
               for (Car currentCar : proceedCars) {
                   if (currentCar.yearOfProduction == yearOfProduction & currentCar.price > price) {
                       printCars(currentCar);
                   }
               }
               if (i == 0 ){
                   printNoCars();
               }
        }

    }
        //empty print//
    public void printNoCars(){
        System.out.println("There are not such cars like this");
    }

    //empty print 2///
    public void printEmptyCarBase() {
        System.out.println("Car base is empty");
    }

    //METHOD 4 FOR PRINT//
    public void printCars(Car Car) {
        System.out.println(Car.id + " " + Car.brand + " " + Car.yearOfProduction + " " + Car.color + " " + Car.price + " "
                + Car.registrationNumber + " " + Car.model + " ");
    }
}

