package exerciseTwelve;

import java.time.Year;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Manufacturer manufacturer1 = new Manufacturer("Ford",  1940, "USA");
        Manufacturer manufacturer2 = new Manufacturer("Ford", 1940, "USA");
        System.out.println(manufacturer1.equals(manufacturer2));
        System.out.println(manufacturer1);
        System.out.println(manufacturer2);

 //       manufacturer2.setName("Mercedes");
        System.out.println(manufacturer1.equals(manufacturer2));
        System.out.println(manufacturer1);
        System.out.println(manufacturer2);

List<Manufacturer> manufacturers1 = List.of(manufacturer1,manufacturer2);
List<Manufacturer> manufacturers2 = List.of(manufacturer1,manufacturer2);
        Car car1 = new Car("Opel", "Vectra", "46000", 2009, manufacturers1, EngineType.V8);
        Car car2 = new Car("Opel", "Vectra", "46000", 2009, manufacturers2, EngineType.V8);
        System.out.println(car1.equals(car2));
    }
}
