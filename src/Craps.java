import java.security.SecureRandom;

public class Craps {

    /**
     * enums can be used to hold the status of the game.  They are easier to read than using
     * things like integers and restricts the number of possible outcomes.
     */
    private enum Status {CONTINUE, WON, LOST};

    //defining some constants so we can sound like Vegas kingpins
    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEL = 11;
    private static final int BOX_CARS =12;

    public static void main(String[] args)
    {
        Status gameStatus;
        int sumOfDice = rollDice();

        if (sumOfDice==SEVEN || sumOfDice==YO_LEVEL)
            gameStatus=Status.WON;

        else if (sumOfDice==SNAKE_EYES || sumOfDice==TREY || sumOfDice==BOX_CARS)
            gameStatus=Status.LOST;

        else
            gameStatus=Status.CONTINUE;

        int myPoint = sumOfDice;

        while (gameStatus==Status.CONTINUE)
        {
            sumOfDice=rollDice();

            if (sumOfDice==myPoint)
                gameStatus=Status.WON;
            else if (sumOfDice==SEVEN)
                gameStatus=Status.LOST;
        }

        if (gameStatus==Status.WON)
            System.out.printf("Player wins!!");
        else
            System.out.printf("House wins!!");
    }

    /**
     * This method simulates rolling 2x 6 sided dice and returns
     * their sum
     */
    public static int rollDice()
    {
        SecureRandom rng = new SecureRandom();
        int die1 = rng.nextInt(6)+1;
        int die2 = rng.nextInt(6)+1;
        System.out.printf("die1: %d    die2: %d%n", die1, die2);
        return die1+die2;
    }
}
