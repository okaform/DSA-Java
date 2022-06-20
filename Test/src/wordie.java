import java.util.HashMap;
import java.util.Scanner;

public class wordie {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int count = 1;
        String secretWord = "mosiah";
        HashMap<Character, Integer> hs = new HashMap<>();
        for (int i = 0; i < secretWord.length(); i++) {
            hs.put(secretWord.charAt(i), i);
        }
        String secretWordGuessed = "_".repeat(secretWord.length());

        System.out.println("Welcome to the word guessing game!");
        System.out.println("Your hint is : " +secretWordGuessed );
        System.out.print("What's your guess? ");

        String usersGuess = input.nextLine().toLowerCase();

        boolean canContinue = true;
        while(canContinue) {
            if (usersGuess.equals(secretWord)) {
                System.out.println("Congratulations! You guessed it!");
                System.out.println("It took you " + count + " guesses.");
                break;
            }
            else {
                count++;
                for (int i = 0; i < usersGuess.length(); i++) {
                    /*if (usersGuess.length() <secretWord.length()) { //less than
                        System.out.println("Your input should be the same length as the secret word");
                        break;
                    }

                    else { //greater than

                    }*/
                    if (i > secretWord.length() - 1) {

                        break;
                    }
                    if (secretWord.charAt(i) == usersGuess.charAt(i)) {
                        usersGuess = usersGuess.substring(0, i) + Character.toUpperCase(usersGuess.charAt(i)) + usersGuess.substring(i + 1);
                    }
                    else if (hs.containsKey(usersGuess.charAt(i))) {//if character here is not uppercase
                        usersGuess = usersGuess.substring(0, i) + usersGuess.charAt(i) + usersGuess.substring(i + 1);
                        hs.remove(usersGuess.charAt(i));
                    }

                    else {
                        usersGuess = usersGuess.substring(0, i) + '_' + usersGuess.substring(i + 1);
                    }
                }
                System.out.println("\nYour hint is : " +usersGuess );
                usersGuess = "_".repeat(secretWord.length());
                System.out.print("What's your guess? ");
                usersGuess = input.nextLine().toLowerCase();
            }

        }
    }
}
