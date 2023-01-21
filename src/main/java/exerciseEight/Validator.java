package exerciseEight;

public class Validator {

    private void isDimensionViable(Parcel parcel){
        if ((parcel.getxLength() + parcel.getyLength() + parcel.getzLength()) <=300){
            System.out.println("Paczka " + parcel + " spełnia wymogi");
        }else {
            System.out.println("Paczka " + parcel + " nie spełnia wymogów");
        }
    }
    private void isWeightAlright(Parcel parcel){
        if (parcel.getWeight() <= 30 && !parcel.isExpress()){
            System.out.println("Paczka " + parcel + "jest dobrej wagi i nie jest ekspresowa");
        } else if (parcel.getWeight() <= 15 && parcel.isExpress()) {
            System.out.println("Paczka " + parcel + "jest dobrej wagi i jest ekspresowa");
        }else {
            System.out.println("Paczka " + parcel + "jest złej wagi");
        }
    }
    public void validate(Parcel parcel){
        isDimensionViable(parcel);
        isWeightAlright(parcel);
    }

}
