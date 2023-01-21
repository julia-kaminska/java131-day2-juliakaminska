package exerciseTwelve;

import java.math.BigDecimal;
import java.time.Year;
import java.util.List;
import java.util.Objects;

public class Car {
    private String name;
    private String model;
    private BigDecimal price;
    private Year manufactureYear;
    private List<Manufacturer> manufacturers;
    private EngineType engineType;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(name, car.name) && Objects.equals(model, car.model) && Objects.equals(price, car.price) && Objects.equals(manufactureYear, car.manufactureYear) && Objects.equals(manufacturers, car.manufacturers) && engineType == car.engineType && manufacturers.containsAll(car.manufacturers) && car.manufacturers.containsAll(manufacturers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model, price, manufactureYear, manufacturers, engineType);
    }

    public Car(String name, String model, String price, int manufactureYear, List<Manufacturer> manufacturers, EngineType engineType) {
        this.name = name;
        this.model = model;
        this.price = new BigDecimal(price);
        this.manufactureYear = Year.of(manufactureYear);
        this.manufacturers = manufacturers;
        this.engineType = engineType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", manufactureYear=" + manufactureYear +
                ", manufacturers=" + manufacturers +
                ", engineType=" + engineType +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Year getManufactureYear() {
        return manufactureYear;
    }

    public List<Manufacturer> getManufacturers() {
        return manufacturers;
    }

    public EngineType getEngineType() {
        return engineType;
    }
}
