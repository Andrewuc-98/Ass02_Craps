import java.util.Random;
import java.util.Scanner;

public class CrapsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            System.out.println("Welcome to the game of Craps!");
            System.out.println("Press enter to roll the dice...");
            scanner.nextLine();

            int dice1 = random.nextInt(6) + 1;
            int dice2 = random.nextInt(6) + 1;
            int sum = dice1 + dice2;

            System.out.println("You rolled: " + dice1 + " and " + dice2);
            System.out.println("Sum of the roll: " + sum);

            if (sum == 2 || sum == 3 || sum == 12) {
                System.out.println("Craps! You lose!");
            } else if (sum == 7 || sum == 11) {
                System.out.println("Natural! You win!");
            } else {
                System.out.println("The point is: " + sum);
                System.out.println("Try to make the point...");

                int point = sum;
                boolean gameEnd = false;

                while (!gameEnd) {
                    System.out.println("Press enter to roll the dice...");
                    scanner.nextLine();

                    dice1 = random.nextInt(6) + 1;
                    dice2 = random.nextInt(6) + 1;
                    sum = dice1 + dice2;

                    System.out.println("You rolled: " + dice1 + " and " + dice2);
                    System.out.println("Sum of the roll: " + sum);

                    if (sum == point) {
                        System.out.println("Made the point! You win!");
                        gameEnd = true;
                    } else if (sum == 7) {
                        System.out.println("Got a seven! You lose!");
                        gameEnd = true;
                    } else {
                        System.out.println("Trying for point...");
                    }
                }
            }

            System.out.println("Do you want to play again? (yes/no)");
            String playAgain = scanner.nextLine().toLowerCase();
            if (!playAgain.equals("yes")) {
                break;
            }
        }

        scanner.close();
    }
}