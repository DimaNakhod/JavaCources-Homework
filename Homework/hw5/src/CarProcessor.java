 //CLASS PROCESSOR//
public class CarProcessor {
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
     //METHOD 3//
     public void highCostedCar(Car[] cars, int yearOfProduction, int price) {
         int i = 0;
         for (Car currentCar : cars) {
             if (currentCar.yearOfProduction == yearOfProduction & currentCar.price > price) {
                 printCars(currentCar);
             }
         }
     }
     //METHOD 4 FOR PRINT//
     public void printCars(Car car) {
         System.out.println(car.id + " " + car.brand + " " + car.yearOfProduction + " " + car.color + " " + car.price + " "
                 + car.registrationNumber + " " + car.model + " ");
     }
 }