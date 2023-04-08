package exerciseTwelve;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceMain {
    public static void main(String[] args) {
        Manufacturer audiManufacturer = new Manufacturer("Audi", 1984, "Germany");
        Manufacturer fordManufacturer = new Manufacturer("Ford", 1984, "USA");
        Manufacturer toyotaManufacturer = new Manufacturer("Toyota", 1984, "Japan");
        List<Manufacturer> manufacturers = new ArrayList<>();
        List<Manufacturer> manufacturers2 = new ArrayList<>();
        manufacturers2.add(fordManufacturer);
        manufacturers2.add(toyotaManufacturer);
        manufacturers2.add(audiManufacturer);
        CarService carService = new CarService();
        Car car1 = new Car("Audi", "A4", "30000", 2006, manufacturers, EngineType.V8);
        Car car2 = new Car("Audi", "A6", "30000", 2009, manufacturers2, EngineType.V8);
        Car car3 = new Car("Audi", "A8", "30000", 1998, manufacturers, EngineType.V8);
        Car car4 = new Car("Audi", "A8", "30000", 2006, manufacturers2, EngineType.V6);
        Car car5 = new Car("Audi", "A8", "30000", 1996, manufacturers, EngineType.V12);
        Car car6 = new Car("Ferrari", "A8", "30000", 1996, manufacturers, EngineType.V12);
        carService.addCar(car1);
        carService.addCar(car2);
        carService.addCar(car4);
        carService.addCar(car5);

//        List<Car> allCars = carService.getAllCars();
//        carService.getAllCars().forEach(car -> System.out.println(car));
//        carService.getAllCars().add(car3);
//
//        carService.removeCar(car1);
//        carService.removeCar(car2);

 //       System.out.println(carService.getAllV12());
 //       System.out.println(carService.getAllBefore1999());
//        System.out.println(carService.getWithAtLeastThreeManufacturers());
//        System.out.println(carService.getSortedByTrener(SortOrder.DESCENDING));
        System.out.println(carService.isCarOnTheList(car1));
        System.out.println(carService.isCarOnTheList(car6));
        System.out.println("**************************");
        carService.getALLProducedBy(audiManufacturer).forEach(car -> System.out.println());
        var carNames = carService.getALLProducedBy(audiManufacturer).stream()
                .map(car -> car.getName())
                .map(carName -> "Nazwa samochodu: " + carName)
                .map(carName -> carName.length())
                .collect(Collectors.toList());
        System.out.println(carNames);


    }
}
