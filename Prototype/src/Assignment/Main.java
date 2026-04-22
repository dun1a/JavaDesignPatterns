package Assignment;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //String[] choice = {"1. Look at lists","2. Edit list"};

        Book book1 = new Book("Eiichiro Oda", "One Piece", "Adventure");
        Book book2 = new Book("Miyuki Abe", "Hakkenden", "Fantasy");
        Book book3 = new Book("Shuichi Aso", "Disastrous Life of Saiki K", "Comedy");
        Book book4 = new Book("Katsura Hoshino", "D.Gray-man", "Action");

        System.out.println("Choose an option:");
        System.out.println("1. Look at lists");
        System.out.println("2. Edit list");

        Recommendation recommendation1 = new Recommendation("Teenagers");
        recommendation1.addBook(book1);
        recommendation1.addBook(book2);

        Recommendation recommendation2 = recommendation1.clone();
        recommendation2.setTargetAudience("Adults");
        recommendation2.addBook(book3);
        recommendation2.addBook(book4);

//        System.out.println("Original recommendation: " + recommendation1);
//        System.out.println("Cloned recommendation: " + recommendation2);


        int option = scanner.nextInt();
        switch(option){
            case 1:
                System.out.println("Original recommendation: " + recommendation1);
                System.out.println("Cloned recommendation: " + recommendation2);
                break;

            case 2:
                System.out.println("Would you like to clone the original recommendation? (yes/no)");

                if(scanner.next().equalsIgnoreCase("yes")){
                    Recommendation newRecommendation = recommendation1.clone();

                    System.out.println("Would you like to add or remove books? (add/remove/no)");
                    String action = scanner.next();

                    if(action.equalsIgnoreCase("add")){
                        scanner.nextLine(); // clear buffer

                        System.out.println("Enter author:");
                        String author = scanner.nextLine();

                        System.out.println("Enter title:");
                        String title = scanner.nextLine();

                        System.out.println("Enter genre:");
                        String genre = scanner.nextLine();

                        Book newBook = new Book(author, title, genre);
                        newRecommendation.addBook(newBook);

                        System.out.println("Modified list: " + newRecommendation);

                    } else if(action.equalsIgnoreCase("remove")){
                        System.out.println("Enter book title to remove:");
                        scanner.nextLine();
                        String titleToRemove = scanner.next();

                        newRecommendation.getBooks()
                                .removeIf(book -> book.getTitle().equalsIgnoreCase(titleToRemove));

                        System.out.println("Modified list:\n " + newRecommendation);

                    } else {
                        System.out.println("No changes made.");
                    }
                } else {
                    System.out.println("No cloning performed.");
                }
                break;

            default:
                System.out.println("Invalid option. Please choose 1 or 2.");
        }

    }
}
