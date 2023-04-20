import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        boolean confirm;

        do {
            System.out.println("What would you like to ask Bob: ");
            input = sc.nextLine();

            if (input.contains("?")) {
                System.out.println("Sure");
            } else if (input.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (input.equals("")) { // can use the .isEmpty() method
                System.out.println("Fine. Be that way!");
            } else {
                System.out.println("Whatever.");
            }

            System.out.println("Would you like to continue chatting. [y/n]");
            confirm = sc.nextLine().equalsIgnoreCase("y");
        }while(confirm);
        System.out.println("Good talk!");



    }
}
