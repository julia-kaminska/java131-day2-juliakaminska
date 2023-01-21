package exerciseEight;

public class Main {
    public static void main(String[] args) {
        Parcel parcel1 = new Parcel(10, 100, 10,40.4f,true);
        Parcel parcel2 = new Parcel(10, 100, 10,12f,true);
        Parcel parcel3 = new Parcel(10, 100, 10,30.5f,false);
        Parcel parcel4 = new Parcel(100, 100, 101,17,false);

        Validator validator = new Validator();


        validator.validate(parcel1);
        validator.validate(parcel2);
        validator.validate(parcel3);
        validator.validate(parcel4);
    }
}
