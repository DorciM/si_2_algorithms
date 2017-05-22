/**
 * Created by doramedgyasszay on 2017. 05. 18..
 */

var search = function (key, array) {
  var start = 0;
  var end = (array.length - 1);
  var mid = Math.floor(array.length/2);
  while (start <= end && key != array[mid]){
        if (key < array[mid]){
            end = mid - 1;
        } else if (key > array[mid]){
            start = mid + 1;
        }
        mid = Math.floor((start + end)/2);

  }
  return (array[mid] != key) ? -1 : mid;

};
var testarray =[2, 4, 6, 8, 10, 12, 14, 16];
console.log("Index is: " + search(12, testarray));