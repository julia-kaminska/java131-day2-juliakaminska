package exerciseTwelve;

import java.util.ArrayList;
import java.util.List;

public class CarServiceMain {
    public static void main(String[] args) {
        Manufacturer Audimanufacturer = new Manufacturer("Audi", 1984, "Germany");
        List<Manufacturer> manufacturers = new ArrayList<>();
        manufacturers.add(Audimanufacturer);
        CarService carService = new CarService();
        Car car1 = new Car("Audi", "A4", "30000", 2006, manufacturers, EngineType.V8);
        Car car2 = new Car("Audi", "A6", "30000", 2006, manufacturers, EngineType.V8);
        Car car3 = new Car("Audi", "A8", "30000", 1998, manufacturers, EngineType.V8);
        Car car4 = new Car("Audi", "A8", "30000", 2006, manufacturers, EngineType.V6);
        Car car5 = new Car("Audi", "A8", "30000", 1996, manufacturers, EngineType.V12);
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

        System.out.println(carService.getAllV12());
        System.out.println(carService.getAllBefore1999());
    }
}
