import java.util.Scanner;
public class ControlFlowExercises {
    public static void main (String[] args){
//        1. Loop Basics
//        int i = 5;
//        while (i <= 15) {
//            System.out.println(i);
//            i++;
//        }
//        1. Do While
//        int i = 0;
//        do {
//            System.out.println(i);
//            i += 2;
//        } while (i <= 100);
//        int i = 100;
//        do {
//            System.out.println(i);
//            i -= 5;
//        } while (i >= -10);
//        int i = 2;
//        do {
//            System.out.println(i * i);
//            i++;
//        } while (i * i < 1000000);

//        1. For
//        for (int i = 5; i <= 15; i++) {
//System.out.println(i);

//                for (int i = 100; i >= -10; i -= 5) {
//System.out.println(i);

//                for (int i = 2; i * i < 1000000; i++) {
//System.out.println(i * i);
//        }

//        2. Fizzbuzz
//        for (int i = 1; i <= 100; i++) {
//            System.out.println(i);
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            }
//        }
//        3.Display a table of powers.
        Scanner input = new Scanner(System.in);
        String choice;
        do {
            System.out.print("Enter an integer: ");
            int n = input.nextInt();

            System.out.println("Number\tSquare\tCube");
            for (int i = 1; i <= n; i++) {
                System.out.println(i + "\t" + (i * i) + "\t" + (i * i * i));
            }

            System.out.print("Do you want to continue (Y/N)? ");
            choice = input.next();
        } while (choice.equalsIgnoreCase("Y"));
    }
}
