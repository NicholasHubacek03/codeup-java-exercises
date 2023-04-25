import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        userGuess();
    }

    public static void userGuess(){
        int randNumber = (int) (Math.random() * 100) + 1;
        Scanner scanner = new Scanner(System.in);
        int userGuess;
        do{
            System.out.println("Guess a number between 1 and 100");
            userGuess = scanner.nextInt();

            if (userGuess < randNumber){
                System.out.println("HIGHER");
            }
            else if (userGuess > randNumber){
                System.out.println("LOWER");
            }
            else {
                System.out.println("STOP CHEATING, GOOD GUESS");
            }
        }
        while(userGuess != randNumber);

    }
}
