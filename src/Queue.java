/**
 * Created by doramedgyasszay on 2017. 05. 02..
 */
public class Queue {

    Node first, last;
    int size;

    public boolean isEmpty(){
        return first == null;
    }

    public void enqueue(Object object){
        Node node = new Node(object);
       if (isEmpty()){
           first = last = node;
       } else {
           last.setNext(node);
           last = node;
       }
    }

    public Object dequeue() {
        if (isEmpty()) {
            return null;
        } else {
            Object result = first.getItem();
            first = first.getNext(); //lép a következőre a sorban

            size--;
            return result;
        }
    }


    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue("valammi");
        queue.enqueue("hiányzik");
        queue.enqueue("megint");
        queue.enqueue("nahát");
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

    }
}
