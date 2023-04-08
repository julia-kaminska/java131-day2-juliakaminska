package exerciseTwelve;

import java.time.Year;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
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
                .filter(car -> Year.of(1999).isAfter(car.getManufactureYear())) //rok 1999 jest pozniej niz rok produkcji auta
                .collect(Collectors.toList());
    }

    public Car getMostExpensive() {
        Car mostExpensiveCar = null;

        for (Car car : cars) {
            if (mostExpensiveCar == null) {
                mostExpensiveCar = car;
            }
            if (mostExpensiveCar.getPrice().compareTo(car.getPrice()) < 0) {

            }
        }
        return mostExpensiveCar;
    }

    public Car getMostExpensive2() {
        //posortowanie po cenie malejąco
        final var sortedCars = cars.stream()
                .sorted(Comparator.comparing(Car::getPrice).reversed())
                .collect(Collectors.toList());
        //pobranie iteratora skoczka dla posortowanej listy
        final var carsIterator = sortedCars.iterator();
        //jesli iterator widzi pierwszy element to go zwraca, jesli nie to null
        if (carsIterator.hasNext()) {
            return carsIterator.next();
        } else {
            return null;
        }
    }

    public Optional<Car> getMostExpensive3() {
        return Optional.ofNullable(cars.stream()
                .reduce((car1, car2) -> {
                    if (car1.getPrice().compareTo(car2.getPrice()) < 0) {
                        return car2;
                    } else {
                        return car1;
                    }
                }).orElse(null));
    }

    public List<Car> getWithAtLeastThreeManufacturers() {
        List<Car> result = cars.stream()
                .filter(car -> car.getManufacturers().size() >= 3)
                .collect(Collectors.toList());
        return result;
    }

    // pierwszy sposob
    public List<Car> getSortedByTrener(SortOrder sortOrder) {
        Comparator<Car> comparator;
        if (SortOrder.DESCENDING == sortOrder) {
            comparator = Comparator.comparing(Car::getManufactureYear).reversed();
        } else {
            comparator = Comparator.comparing(Car::getManufactureYear);
        }
        return cars.stream()
                .sorted(comparator)
                .collect(Collectors.toList());
    }

    //drugi sposob
    public List<Car> getSortedBy2(SortOrder sortOrder) {
        Comparator<Car> comparator = Comparator.comparing(Car::getManufactureYear);
        if (SortOrder.DESCENDING == sortOrder) {
            comparator = comparator.reversed();
        }
        return cars.stream()
                .sorted(comparator)
                .collect(Collectors.toList());
    }

    public boolean isCarOnTheList(Car car) {
        return cars.contains(car);

    }

    public List<Car> getALLProducedBy(Manufacturer manufacturer) {
        List<Car> result = cars.stream()
                .filter(car -> car.getManufacturers().contains(manufacturer))
                .collect(Collectors.toList());
        return result;
    }

    //ostatni task
//    public List<Car> producedByManufacturersYear(Year ageOfEstablishment, ComparisonType comparisonType) {
//        if (ComparisonType.EQUAL == comparisonType) {
//            return cars.stream()
//                    .filter(car -> yearsOfCreation(car).contains(ageOfEstablishment))
//                    .collect(Collectors.toList());
//        } else if (ComparisonType.IS_NOT_EQUAL == comparisonType) {
//            return cars.stream()
//                    .filter(car -> !yearsOfCreation(car).contains(ageOfEstablishment))
//                    .collect(Collectors.toList());
//        } else if (ComparisonType.HIGHER == comparisonType) {
//            return cars.stream()
//                    .filter(car -> yearsOfCreation(car).stream().anyMatch(year -> year.isAfter(ageOfEstablishment)))
//                    .collect(Collectors.toList());
//        } else if (ComparisonType.HIGHER_AND_EQUAL == comparisonType) {
//            return cars.stream()
//                    .filter(car -> yearsOfCreation(car).stream().anyMatch(year -> year.isAfter(ageOfEstablishment) || year.equals(ageOfEstablishment)))
//                    .collect(Collectors.toList());
//        } else if (ComparisonType.LOWER == comparisonType) {
//            return cars.stream()
//                    .filter(car -> yearsOfCreation(car).stream().anyMatch(year -> year.isBefore(ageOfEstablishment)))
//                    .collect(Collectors.toList());
//        } else if (ComparisonType.LOWER_AND_EQUAL == comparisonType) {
//            return cars.stream()
//                    .filter(car -> yearsOfCreation(car).stream().anyMatch(year -> year.isBefore(ageOfEstablishment) || year.equals(ageOfEstablishment)))
//                    .collect(Collectors.toList());
//        }
//        return null;
//
//    }
}




