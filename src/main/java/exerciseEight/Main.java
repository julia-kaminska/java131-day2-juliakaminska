package exerciseEight;

public class Main {
    public static void main(String[] args) {
        Parcel parcel1 = new Parcel(10, 100, 30,50,true);
        Parcel parcel2 = new Parcel(100, 100, 301,50,true);

        Validator validator = new Validator();
        validator.isDimensionViable(parcel1);
        validator.isDimensionViable(parcel2);
    }
}
