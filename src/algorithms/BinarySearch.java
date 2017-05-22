package algorithms;

/**
 * Created by doramedgyasszay on 2017. 03. 30..
 */
public class BinarySearch {

   public int search(int key, int[] array){
       int start = 0;
       int end = array.length - 1;
       while (start <= end){
           int mid = (start+end)/2;
           if (key == array[mid]){
               return mid;
           } else if(key < array[mid]) { //if the key is in the lower half of the array, eliminate the upper half by defining a new end
               end = mid - 1;
           } else {
               start = mid + 1; //if the key is in the upper half, eliminate the lower by defining a new start
           }
       }
       return -1;
   }

    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        int[] test = {1, 2, 4, 7, 10, 20, 32, 55, 78, 90};

        System.out.println("Element is at index: "+ bs.search(10, test));
    }
}

