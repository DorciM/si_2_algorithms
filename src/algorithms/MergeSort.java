package algorithms;

/**
 * Created by doramedgyasszay on 2017. 05. 15..
 */

public class MergeSort {

    int[] array;

    public void mergeSort(int[] array, int low, int high){
        this.array =  array;
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(array, low, mid);
            mergeSort(array, mid + 1, high);
            //Combine the arrays together
            merge(low, mid, high);
        }
    }

    public void merge(int low, int mid, int high){
        int[] temp = new int[array.length];
        for (int i =0; i < array.length; i++){
            temp[i] = array[i];
        }
        int k = low;
        int l = low;
        int r = mid+1;
        while  (l <= mid && r <= high){
            if (temp[l] < temp[r]){
                array[k] = temp[l];
                l++;
            } else {
                array[k]= temp[r];
                r++;
            }
            k++;
        }
        while (l <= mid){
            array[k] = temp[l];
            l++;
            k++;
        }
    }



    public static void main(String[] args) {
        MergeSort ms = new MergeSort();
        int[] testArray = {23, 1, 45, 77, 8, 53, 91};
        ms.mergeSort(testArray, 0, 6);
        for (int i=0;i< testArray.length; i++){
            System.out.println(testArray[i]);
        }
    }

}