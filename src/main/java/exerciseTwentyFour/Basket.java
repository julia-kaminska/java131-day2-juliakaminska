package exerciseTwentyFour;

public class Basket {
    private int itemsCount = 0;

     void addToBasket() throws BasketFullException{
         if (itemsCount < 10) {
             itemsCount++;
         } else {
             throw new BasketFullException("Wyjmij produkty z koszyka i spróbuj ponownie");
         }
     }

     void removeFromBasket() {
         if (itemsCount > 0) {
             itemsCount--;
         }else {
             throw new BasketEmptyException();
         }
     }

    @Override
    public String toString() {
        return "Basket{" +
                "itemsCount=" + itemsCount +
                '}';
    }
}
