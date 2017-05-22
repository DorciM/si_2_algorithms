package algorithms;

/**
 * Created by doramedgyasszay on 2017. 05. 22..
 */


public class BSTNode {

    BSTNode left, right;
    private int value;


    public BSTNode() {
        left = null;
        right = null;
        value = 0;
    }

    public BSTNode(int n) {
        left = null;
        right = null;
        value = n;
    }

    public void setLeft(BSTNode n) {
        left = n;
    }

    public void setRight(BSTNode n) {
        right = n;
    }

    public BSTNode getLeft() {
        return left;
    }


    public BSTNode getRight() {
        return right;
    }


    public void setValue(int d) {
        value = d;
    }

    public int getValue() {
        return value;
    }
}
