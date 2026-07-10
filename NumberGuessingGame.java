public class NumberGuessingGame {
    public static void main(String[] args) {
        int secret = 7;
        int guess = 7;

        if (guess == secret)
            System.out.println("Correct Guess!");
        else
            System.out.println("Try Again!");
    }
}
