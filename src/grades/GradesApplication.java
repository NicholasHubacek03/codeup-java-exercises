package grades;

import java.util.Scanner;
import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        Student student1 = new Student("Jeff_Gown");
        student1.addGrade(12);
        student1.addGrade(51);
        student1.addGrade(95);
        students.put("Jeff_Gown", student1);

        Student student2 = new Student("Bob_Smith");
        student2.addGrade(94);
        student2.addGrade(89);
        student2.addGrade(99);
        students.put("Bob_Smith", student2);

        Student student3 = new Student("John_will");
        student3.addGrade(71);
        student3.addGrade(60);
        student3.addGrade(82);
        students.put("John_will", student3);

        Student student4 = new Student("Sam_Willy");
        student4.addGrade(85);
        student4.addGrade(90);
        student4.addGrade(95);
        students.put("Sam_Willy", student4);

        Scanner scanner = new Scanner(System.in);
        String userChoice;

        do {
            // Print out the list of GitHub usernames
            System.out.println("Welcome!\nHere are the GitHub usernames of our students:");
            for (String username : students.keySet()) {
                System.out.println(username);
            }

            // Ask the user which student they want to see more information about
            System.out.print("\nEnter a GitHub username to see more information: ");
            String input = scanner.nextLine();

            // Check if the input matches a key in the map
            if (students.containsKey(input)) {
                // If it does, display information about the student
                Student student = students.get(input);
                System.out.println("\nName: " + student.getName());
                System.out.println("Grades: " + student.getGrades());
                System.out.println("Average grade: " + student.getGradeAverage());
            } else {
                // If it doesn't, tell the user that no users with that username were found
                System.out.println("\nSorry, no users with that username were found.");
            }

            // Ask the user if they want to continue
            System.out.print("\nWould you like to see another student? (y/n): ");
            userChoice = scanner.nextLine();

        } while (userChoice.equalsIgnoreCase("y"));
    }
}
