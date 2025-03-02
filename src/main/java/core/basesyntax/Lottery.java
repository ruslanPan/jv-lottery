package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_BOUND = 101;

    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        Color color = colorSupplier.getRandomColor();
        int randomNumber = random.nextInt(MAX_BOUND);
        return new Ball(color, randomNumber);
    }
}
