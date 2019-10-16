import java.security.SecureRandom;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        SecureRandom randomNumGenerator = new SecureRandom();

        int userGuessCount = 0;

        int compNum = randomNumGenerator.nextInt(10)+1;
        int userGuess=0;

        do{
            System.out.printf("Enter your guess (1-10): ");
            userGuess = keyboard.nextInt();
            userGuessCount++;

            if (userGuess<compNum)
                System.out.printf("higher%n");
            else if (userGuess>compNum)
                System.out.printf("lower%n");

        } while (userGuess != compNum);

        System.out.printf("You guessed it in %d attempts%n", userGuessCount);
    }
}
