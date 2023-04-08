package exerciseTwentyFour;

public class BasketEmptyException extends RuntimeException {
    public BasketEmptyException() {
        super("Uzupełnij koszyk!");
    }

    public BasketEmptyException(String message) {
        super(message);
    }
}
