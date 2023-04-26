package util;

public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();

        System.out.print("Enter a string: ");
        String str = input.getString();
        System.out.printf("You entered: %s%n", str);

        System.out.print("Enter y or n: ");
        boolean yesNo = input.yesNo();
        System.out.printf("You entered: %b%n", yesNo);

        System.out.print("Enter an integer between 1 and 10: ");
        int numInRange = input.getInt(1, 10);
        System.out.printf("You entered: %d%n", numInRange);

        System.out.print("Enter an integer: ");
        int anyNum = input.getInt();
        System.out.printf("You entered: %d%n", anyNum);

        System.out.print("Enter a decimal number between 0 and 1: ");
        double dubInRange = input.getDouble(0, 1);
        System.out.printf("You entered: %f%n", dubInRange);

        System.out.print("Enter a decimal number: ");
        double anyDub = input.getDouble();
        System.out.printf("You entered: %f%n", anyDub);
    }
}
