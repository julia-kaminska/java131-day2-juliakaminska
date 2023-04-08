package exerciseTwentyFour;

import java.io.IOException;

public class BasketFullException extends RuntimeException {
    public BasketFullException() {
        super("Twój koszyk jest pełny!");
    }

    public BasketFullException(String message) {
        super(message);
    }
}
