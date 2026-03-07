package Assignment;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        SortingContext sortingContext = new SortingContext(new SelectionSort());

        Random rand = new Random();

        int[] numArray = new int[30];
        //int[] numArray = new int[100000];

//        for (int i = 0; i < numArray.length; i++) {
//            numArray[i] = rand.nextInt(100); // generates a random number between 0-99
//        }
        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = rand.nextInt(100000); // generates a random number between 0-99
        }

        System.out.println("Array to be sorted: ");
        for(int num : numArray){
            System.out.println(num + " ");
        }
        System.out.println();

        System.out.println("Select sorting algorithm: ");
        System.out.println("1. Selection Sort");
        System.out.println("2. Bubble Sort");
        System.out.println("3. Insertion Sort");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                sortingContext.setSortingStrategy(new SelectionSort());
                sortingContext.processSorting(numArray);
                break;
            case 2:
                sortingContext.setSortingStrategy(new BubbleSort());
                sortingContext.processSorting(numArray);
                break;
            case 3:
                sortingContext.setSortingStrategy(new InsertionSort());
                sortingContext.processSorting(numArray);
                break;
            default:
                System.out.println("Invalid choice");
        }

    }

}
