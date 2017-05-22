package algorithms;

/**
 * Created by doramedgyasszay on 2017. 05. 15..
 */
public class BubbleSort {

    int[] array;
    int n;
    int temp = 0;

    public void sort(int[] inputArr){
        this.array = inputArr;
        this.n = inputArr.length;
        for (int i =0; i< n; i++){ //going through the whole length of the array
            for (int j=1; j < n-1; j++){  // "j" starts from 1, because when j=0 it's the state before the first comparison in each rounds
                                          // and it stops before the last element in the array, because there's no swap for just 1 element (which is at the last index)
                if (array[j-1] > array[j]){ //if the first in the row is smaller than the next one, SWAP!!
                    temp = array[j-1]; //set up a temporary integer to hold value
                    System.out.println("Temp is: " + temp);
                    System.out.println("Array[j] is: " + array[j]);
                    System.out.println("Array[j-1] is: " + array[j-1]);
                    array[j-1] = array[j]; //swap elements
                    System.out.println("After swapping Array[j-1] is: " + array[j-1]);
                    System.out.println("After swapping Temp is: " + temp);
                    array[j] = temp;
                    System.out.println("Lastly Temp now is: " + temp);
                }
            }
        }
    }

    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();
        int[] array = {23, 1, 45, 77, 8, 53, 91};
        bs.sort(array);
        for (int i: array){
            System.out.println(i);
        }
    }
}
