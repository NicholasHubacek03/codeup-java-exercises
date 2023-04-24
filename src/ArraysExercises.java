import java.util.Scanner;
import java.util.Arrays;

public class ArraysExercises {





    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
////        System.out.println(numbers);
//        System.out.println(Arrays.toString(numbers));


        Person[] people = new Person[3];
        people[0] = new Person("Alice");
        people[1] = new Person("Bob");
        people[2] = new Person("Jeff");
        System.out.println(people.length);

        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i].getName());
        }
    Person newPerson = new Person("Bobby");
        people = addPerson(people, newPerson);

        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i].getName());
        }

    }

    public static Person[] addPerson(Person[] people, Person newPerson) {
        Person[] newPeople = new Person[people.length + 1];
        for (int i = 0; i < people.length; i++) {
            newPeople[i] = people[i];
        }
        newPeople[newPeople.length - 1] = newPerson;
        return newPeople;
    }
}




