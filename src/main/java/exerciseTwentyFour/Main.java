package exerciseTwentyFour;

public class Main {
    public static void main(String[] args) {
        Basket basket = new Basket();
        try {
           basket.removeFromBasket();
        }catch (BasketFullException|BasketEmptyException e){
            System.out.println("Wyjątek");
            System.out.println(e.getMessage());
        }

        basket.addToBasket();
        basket.addToBasket();
        basket.addToBasket();
        basket.removeFromBasket();
        basket.removeFromBasket();
        basket.removeFromBasket();
        basket.removeFromBasket();
        System.out.println(basket);

    }
}
