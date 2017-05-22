/**
 * Created by doramedgyasszay on 2017. 04. 19..
 */
public class Stack {

    Node top;

    public void push(Object object){
        Node node = new Node(object);
        if(top == null) {
            top = node;
        } else {
            node.setPrev(top);
            top.setNext(node);
            top = node;
        }
    }

    public Object pop(){
        if(top == null){
            return null;
        } else {
            Object result = top.getItem();
            top = top.getPrev();
            if(top != null){
                top.setNext(null);
            }
            return result;
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(5);
        stack.push(52);
        stack.push(511);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}
