package algorithms;

/**
 * Created by doramedgyasszay on 2017. 05. 15..
 */


public class MergeSortV2 {

    private int[] array;
    private int[] tempArray;


    public void sort(int[] inputArr){
        this.array = inputArr;
        int length = inputArr.length;
        this.tempArray = new int[length]; //create a new array with the same length of our input array
        mergeSort(0, length-1);
    }

    private void mergeSort(int lowIndex, int highIndexIndex){
        if (lowIndex < highIndexIndex){ //check if lower index is smaller, if not, the array is already sorted
            int middleIndex = lowIndex + (highIndexIndex-lowIndex)/2; //get the middle index of the original array
            //sort the left side of the array
            mergeSort(lowIndex, middleIndex);
            //sort the right side of the array
            mergeSort(middleIndex + 1, highIndexIndex);
            //Combine them
            merge(lowIndex, middleIndex, highIndexIndex);
        }
    }

    private void merge(int lowIndex, int middleIndex, int highIndexIndex ){
        //copy the parts into a helper array
        for(int i = lowIndex; i <= highIndexIndex; i++){
            tempArray[i] = array[i];
        }
        int l = lowIndex;
        int r = middleIndex + 1;
        int k = lowIndex
                ;
        while (l <= middleIndex && r <= highIndexIndex){
            if (tempArray[l] <= tempArray[r]){ //if the value at the left array index is smaller than the value at the right array index...
                array[k] = tempArray[l];  //... then we copy the lower value to the smallest index available in the tempArray
                l++; //and move on, in the left array
            } else {
                array[k] = tempArray[r]; // if the value of the right array is smaller, then we copy it to the tempArray...
                r++; // and move on, in the right side array
            }
            k++; // we move the index in the tempArray in both cases (since we added a new value anyway)
        }
        while (l <= middleIndex){
            array[k] = tempArray[l]; // copy the rest of the left side array to the tempArray
            k++;
            l++;
        }
    }

    public static void main(String[] args) {
        MergeSortV2 ms = new MergeSortV2();
        int[] testArr = {23, 1, 45, 77, 8, 53, 91};
        ms.sort(testArr);
        for (int i: testArr){
            System.out.println(i);
        }
    }
}