package exerciseEight;

public class Validator {

    public void isDimensionViable(Parcel parcel){
        if ((parcel.getxLength() + parcel.getyLength() + parcel.getzLength()) <=300){
            System.out.println("Paczka " + parcel.toString() + " spełnia wymogi");
        }else {
            System.out.println("Paczka " + parcel.toString() + " nie spełnia wymogów");
        }
    }

}
