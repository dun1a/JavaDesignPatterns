package Assignment;

import java.util.Arrays;

public class BubbleSort implements SortingStrategy{
    @Override
    public void processSorting(int[] numArray) {

        System.out.println("\nArray sorted in a Bubble Sort way: ");

        int temp;
        boolean swapped;
        for(int i = 0; i < numArray.length -1; i++){
            swapped = false;

            for(int j =0; j < numArray.length - i - 1; j++){
                if(numArray[j] > numArray[j+1]){
                    // swap numArray[j] and numArray[j+1]
                    temp = numArray[j];
                    numArray[j] = numArray[j+1];
                    numArray[j+1] = temp;
                    swapped = true;
                }
            }
            if(swapped == false){
                break;
            }
//            for(int num : numArray) {
//                System.out.print(num + " ");
//            }
//            System.out.println();
        }

        System.out.println(Arrays.toString(numArray));

    }

//    public  static void main(String[] args) {
//
//        int[] numArray = {20, 32, 12, 5, 16};
//
//        System.out.println("Original array: ");
//        for(int num : numArray) {
//            System.out.print(num + " ");;
//        }
//        System.out.println();
//        System.out.println("Sorted array: ");
//
//        BubbleSort bubbleSort = new BubbleSort();
//        bubbleSort.processSorting(numArray);
//
//    }
}
