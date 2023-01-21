package exerciseTwelve;

import java.time.Year;
import java.util.Objects;

public class Manufacturer {
    private String name;
    private Year yearOfFundation;
    private String country;

    public Manufacturer(String name, int yearOfFundation, String country) {
        this.name = name;
        this.yearOfFundation = Year.of(yearOfFundation);
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manufacturer that = (Manufacturer) o;
        return Objects.equals(name, that.name) && Objects.equals(yearOfFundation, that.yearOfFundation) && Objects.equals(country, that.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, yearOfFundation, country);
    }

    public void setName(String name) {
        this.name = name;
    }
}
