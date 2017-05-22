/**
 * Created by doramedgyasszay on 2017. 05. 03..
 */

var Stack = function () {
    this.top = null;
    this.count = null;
};

var Node = function(data){
    this.data = data;
    this.next = null;
    this.prev = null;
};


Stack.prototype.push = function (data) {
    var node = new Node(data);
    if (this.top === null) {
        this.top = node;
    } else {
        node.prev = this.top;
        this.top.next = node;
        this.top = node;

    }
    this.count++;
};

Stack.prototype.pop = function () {
        if (this.top === null){
            return null;
        }
        else {
            var out = this.top;
            this.top = this.top.prev;
            if(this.top != null){
                this.top.next = null;
            }
            this.count--;
            return out;
        }
    };

Stack.prototype.displayAll = function () {
        if(this.top === null){
            return null;
        } else {
            var array = new Array();
            var arrLength = this.count;
            var current = this.top;
            for(var i = 0; i < arrLength; i++){
               array[i] = current.data;
                current = current.prev;
            }
            return array;
        }
};


var stack = new Stack();
stack.push(34);
stack.push(3224);
stack.push(11);
console.log("top element is: " + stack.top.data);
console.log("Size is: " + stack.count);
console.log("Display all: " + stack.displayAll());
stack.pop();
console.log("top element is: " + stack.top.data);


    
