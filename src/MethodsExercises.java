import java.util.Scanner;
public class MethodsExercises {
    public static void main(String[] args) {

                int number1 = 10;
        int number2 = 2;

        System.out.println(addition(number1,number2));      //12
        System.out.println(subtraction(number1,number2));   //8
        System.out.println(multiplication(number1,number2)); //20
        System.out.println(division(number1,number2));      // 5
        System.out.println(modulus(number1,number2));      // 0

        getInteger(1, 10);
        System.out.println(factorial());

        addition(1, 2);
        addition(1.1, 1.2);
        System.out.println(addition(1, 2));
        System.out.println(dice());

    }

    public static int addition(int number1, int number2){
        return number1 + number2;
    }

    public static double addition(double num1, double num2){
        return num1 + num2;
    }

    public static int subtraction(int number1, int number2){
        return number1 - number2;
    }

    public static int multiplication(int number1, int number2){
        return number1 * number2;
    }

    public static int division(int number1, int number2){
        return number1/number2;
    }

    public static int modulus(int number1, int number2){
        return number1%number2;
    }

    public static int getInteger(int min, int max){
        System.out.print("Enter a number between 1 and 10: ");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        if (userInput >= min && userInput <= max){
            return userInput;
        }
        return getInteger(min, max);

    }

    public static long factorial(){
        int userFactorial = getInteger(1,10);
        long startNumber = 1;
        for (int i = 1; i <= userFactorial; i++){
            startNumber *= i;
        }
        boolean choice = userContinue();
        if (choice){
            factorial();
        }
        System.out.print(startNumber);
        return startNumber;
    }

    //check if the user wants to continue
    public static boolean userContinue(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to continue? (enter y or n");
        String answer = scanner.nextLine();
        if (answer.equals("y")){
            return true;
        }
        else{
            return false;
        }
    }

    public static String dice(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many sides does your dice have?");
        int sides = scanner.nextInt();
        int dice1 = (int) ((Math.random() * sides) + 1);
        int dice2 = (int) ((Math.random() * sides) + 1);

        return "dice #1 = " + dice1 + " dice #2 = " + dice2;
    }
}
