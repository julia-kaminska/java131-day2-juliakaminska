package exerciseEight;

public class Parcel{

   private int xLength;

   public int getxLength() {
      return xLength;
   }

   public int getyLength() {
      return yLength;
   }

   public int getzLength() {
      return zLength;
   }

   public float getWeight() {
      return weight;
   }

   public boolean isExpress() {
      return express;
   }

   private int yLength;
   private int zLength;
   private float weight;
   private boolean express;


   public Parcel(int xLength, int yLength, int zLength, float weight, boolean express) {
      this.xLength = xLength;
      this.yLength = yLength;
      this.zLength = zLength;
      this.weight = weight;
      this.express = express;
   }

   @Override
   public String toString() {
      return "Parcel{" +
              "xLength=" + xLength +
              ", yLength=" + yLength +
              ", zLength=" + zLength +
              ", weight=" + weight +
              ", express=" + express +
              '}';
   }
}
