/**
 * Created by doramedgyasszay on 2017. 05. 02..
 */
public class LinkedList {

    private Node head;

    public void add(Object object){
        Node node = new Node(object);
        Node current = head;
        if (head == null){
            head = node;

        } else {
                while (current.getNext() != null){

                    current = current.getNext();
                }

                current.setNext(node);
            }
        }


    public Object get(int index) {
        if(index < 0){
            throw new IllegalArgumentException("index cannot be smaller than 0");
        }
        Node current = head;
        for (int i=0; i< index; i++){
            current = current.getNext();
        }
        return current.getItem();
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(123);
        list.add(3);
        list.add(877);
        System.out.println( list.get(1));
    }
}
