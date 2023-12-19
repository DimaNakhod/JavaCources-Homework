public class Runner {

    public static void main(String[] args) {

        Car[] cars = {new Car(197, "Audi", 2010, "Black", 30000, "AX7777KH", "A7"),
                new Car(531, "BMW", 2000, "White", 7200, "AX6666XA", "530 Diesel"),
                new Car(252, "Chevrolet", 1999, "Yellow", 200000, "AX1234KH", "Camaro"),
                new Car(367, "Audi", 2017, "Grey", 1000000, "AX5533KH", "q8"),
                new Car(484, "Audi", 2011, "Green", 70000, "AX0000XA", "RS6"),
                new Car(976, "Honda", 2009, "Red", 17667, "AX2527XA", "Civic"),
                new Car(123, "Ferrari ", 2009, "Black", 2000000, "AX1111XA", "Aperta"),
                new Car(555, "Bugatti", 2009, "blue", 2700000, "AX1502XA", "Chiron")};

        CarProcessor proc = new CarProcessor();
        System.out.println("A list of cars of a given brand: ");
        proc.carBrandPrinter(cars, "Audi");
        System.out.println("A list of cars of a given model that have been in operation for more than 2 years: ");
        proc.carExploitation(cars, "q8", 2);
        System.out.println("A list of cars of a given year of model, the price of which is higher than the specified one: ");
        proc.highCostedCar(cars,2009, 1000000);
    }
}
