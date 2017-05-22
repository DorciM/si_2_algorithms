/**
 * Created by doramedgyasszay on 2017. 05. 03..
 */

var Queue = function () {
  this.count = 0;
  this.first = null;
  this.last = null;
};

var Node = function (data) {
  this.data = data;
  this.next = null;
  this.prev = null;
};

Queue.prototype.enqueue = function (data) {
    var node = new Node(data);
    if (this.first === null){
        this.first = this.last = node;
    } else {
        this.last.next = node;
        this.last = node;
    }
    this.count++;
};

Queue.prototype.dequeue = function () {
    if (this.last === null){
        return null;
    } else {
        var out = this.first;
        this.first = this.first.next;
        this.count--;
        return out;
    }
};

Queue.prototype.display = function () {
   if(this.last === null){
       return null;
   } else {
       var array = new Array();
       var arrLength = this.count;
       var current = this.first;
       for (var i = 0; i < arrLength; i++){
           array[i] = current.data;
           current = current.next;
       }
       return array;
   }
};

var q = new Queue();
q.enqueue(12);
q.enqueue(6);
q.enqueue(76);
console.log("Last element is: " + q.last.data);
console.log("Size: " + q.count);
q.dequeue();
console.log("New first element is: " + q.first.data);
console.log("Size: " + q.count);
console.log("Display: " + q.display());
