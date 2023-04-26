package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        scanner = new Scanner(System.in);
    }

    public String getString() {
        return scanner.nextLine();
    }

    public boolean yesNo() {
        String input = scanner.nextLine();
        return input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes");
    }

    public int getInt(int min, int max) {
        while (true) {
            try {
                int num = Integer.parseInt(getString());
                if (num < min || num > max) {
                    System.out.printf("Please enter an integer between %d and %d%n", min, max);
                } else {
                    return num;
                }
            } catch (NumberFormatException ex) {
                System.out.println("Invalid input, please enter an integer");
            }
        }
    }

    public int getInt() {
        while (true) {
            try {
                return Integer.parseInt(getString());
            } catch (NumberFormatException ex) {
                System.out.println("Invalid input, please enter an integer");
            }
        }
    }

    public double getDouble(double min, double max) {
        while (true) {
            try {
                double num = Double.parseDouble(getString());
                if (num < min || num > max) {
                    System.out.printf("Please enter a decimal number between %f and %f%n", min, max);
                } else {
                    return num;
                }
            } catch (NumberFormatException ex) {
                System.out.println("Invalid input, please enter a decimal number");
            }
        }
    }

    public double getDouble() {
        while (true) {
            try {
                return Double.parseDouble(getString());
            } catch (NumberFormatException ex) {
                System.out.println("Invalid input, please enter a decimal number");
            }
        }
    }

}
