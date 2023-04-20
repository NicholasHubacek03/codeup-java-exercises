import java.util.Scanner;


public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("The value of pi is %.2f", pi);

        Scanner sc = new Scanner(System.in);
        System.out.println("Give me a number: ");
        int userNum = sc.nextInt();
        System.out.println(userNum);

        System.out.println("Give me three words: ");
        String wordOne = sc.next();
        String wordTwo = sc.next();
        String wordThree = sc.next();

        System.out.printf("The three words are %n %s %n %s %n %s %n", wordOne, wordTwo, wordThree);


        System.out.println("Give me a sentence: ");
//        String sentence = sc.next(); // if we enter "Today is monday" will return "Today" only aka first word
        String sentence = sc.nextLine();
        System.out.println(sentence);

        System.out.println("Enter a length: ");
        String lengthStr = sc.nextLine();
        int lengthNum = Integer.parseInt(lengthStr);



        System.out.println("Enter a width:");
        String widthStr = sc.nextLine();
        int widthNum = Integer.parseInt(widthStr);

        //        a = l * w
        int area = lengthNum * widthNum;

        //        p = (2 * l) + (2 * w)
        int perimeter = (2 * lengthNum) + (2 * widthNum);

//        display the area and perimeter
        System.out.printf("Area: %s %n Perimeter: %s %n", area, perimeter);




//      the scanner defaults its delimiter to white space
        sc.useDelimiter("\n");


    }
}
