package exerciseTwelve;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarService {
    private List<Car> cars = new ArrayList<>();

    public void addCar(Car car) {
        cars.add(car);
        System.out.println(cars);
    }

    public void removeCar(Car car) {
        cars.remove(car);
        System.out.println(cars);
    }

    public List<Car> getAllCars() {
        List<Car> result = new ArrayList<>();
        result.addAll(cars);
        return cars;
    }
        public List<Car> getAllV12() {
            return cars.stream()
                    .filter(car -> EngineType.V12 == car.getEngineType())
                    .collect(Collectors.toList());
        }

    public List<Car> getAllBefore1999() {
        return cars.stream()
                .filter(car -> Year.of(1999).isAfter(car.getManufactureYear()))
                .collect(Collectors.toList());
    }
    }





