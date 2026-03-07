package Assignment;

import java.util.Arrays;

public class SelectionSort implements SortingStrategy{
    @Override
    public void processSorting(int[] numArray) {

        System.out.println("\nArray sorted in a Selection Sort way: ");

        for(int i = 0; i < numArray.length -1; i++){

            int min = i;

            for(int j = i + 1; j < numArray.length; j++){
                if(numArray[j] < numArray[min]){
                    min = j;
                }
            }

            // moving min element to its correct position in the array
            int temp = numArray[i];
            numArray[i] = numArray[min];
            numArray[min] = temp;

//            for(int num : numArray) {
//                System.out.print(num + " ");
//            }
//            System.out.println();
        }
        // Print the sorted array
        System.out.println(Arrays.toString(numArray));
    }



}
