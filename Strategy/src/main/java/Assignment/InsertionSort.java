package Assignment;

import java.util.Arrays;

public class InsertionSort implements SortingStrategy{
    @Override
    public void processSorting(int[] numArray) {

        System.out.println("\nArray sorted in an Insertion Sort way: ");

        for(int i = 0; i < numArray.length; i++){

            int num = numArray[i];
            int j = i - 1;

            while(j >=0 && numArray[j] > num){
                numArray[j+1] = numArray[j];
                j--;
            }
            numArray[j+1] = num;
        }
        System.out.println(Arrays.toString(numArray));

    }
}
