import java.util.Scanner;

public class Wordie {
    public static void main(String[] args) {
        String secretWord = "mosiah";
        boolean correct = false;
        String guessed = "______";
        int counter = 0;

        Scanner scanner = new Scanner(System.in);
        while(!correct) {
            System.out.println("Your hint is: "+guessed);
            System.out.print("What is your guess? ");
            String userInput = scanner.nextLine();

            for (int i = 0; i < secretWord.length(); i++) {
                for (int j = 0; j < userInput.length(); j++) {
                    if (userInput.charAt(j) == secretWord.charAt(i)) {
                        guessed = "";
                    }
                }
            }

            counter++;
        }
    }
}
