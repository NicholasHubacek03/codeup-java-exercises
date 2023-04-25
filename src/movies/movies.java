//package movies;
//import java.util.Scanner;
//import java.util.ArrayList;
//
//public class movies {
//    private String name;
//    private String category;
//
//    public movies(String name, String category) {
//        this.name = name;
//        this.category = category;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getCategory() {
//        return category;
//    }
//
//    public void setCategory(String category) {
//        this.category = category;
//    }
//
//
//    public class MoviesApplication {
//
//        public static void main(String[] args) {
//
//            ArrayList<Movie> movies = MoviesArray.findAll();
//
//            System.out.println("What do you want to do today, boss?");
//            System.out.println("");
//
//            Scanner scanner = new Scanner(System.in);
//
//            String choice = "";
//
//            do {
//                System.out.println("0 - exit");
//                System.out.println("1 - view all movies");
//                System.out.println("2 - view movies by category");
//                System.out.println("Enter your choice: ");
//                choice = scanner.nextLine();
//
//                if (choice.equals("1")) {
//                    for (Movie movie : movies) {
//                        System.out.println("Movie Name: " + movie.getName() + "\nMovie Category: " + movie.getCategory() + "\n");
//                    }
//                } else if (choice.equals("2")) {
//                    System.out.println("Enter the category, boss:");
//                    String category = scanner.nextLine();
//                    for (Movie movie : movies) {
//                        if (movie.getCategory().equalsIgnoreCase(category)) {
//                            System.out.println("Movie Name: " + movie.getName() + "\nMovie Category: " + movie.getCategory() + "\n");
//                        }
//                    }
//                }
//            } while (!choice.equals("0"));
//
//        }
//    }
//
//
//}
//
