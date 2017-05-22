/**
 * Created by doramedgyasszay on 2017. 04. 19..
 */
public class Node {

    private Object item;
    private Node next;
    private Node prev;

    private Object key;
    private String value;

    public Node(Object object){
        this.item = object;
    }

    public Node(Object key, String value) {
        this.key = key;
        this.value = value;
    }

    public Object getItem() {
        return item;
    }

    public void setValue(Object value) {
        this.item = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public void setItem(Object item) {
        this.item = item;
    }

    public Object getKey() {
        return key;
    }

    public void setKey(Object key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
