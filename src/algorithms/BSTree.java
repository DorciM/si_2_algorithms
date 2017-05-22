package algorithms;

/**
 * Created by doramedgyasszay on 2017. 05. 22..
 */
public class BSTree {

        private BSTNode root;


        public BSTree() {
            root = null;
        }

        public boolean isEmpty() {
            return root == null;
        }

        public void insert(int data) {
            root = insert(root, data);
        }

        private BSTNode insert(BSTNode node, int data) {
            if (node == null)
                node = new BSTNode(data);
            else
            {
                if (data <= node.getValue())
                    node.left = insert(node.left, data);
                else
                    node.right = insert(node.right, data);
            }
            return node;
        }

        private BSTNode delete(BSTNode root, int k) {
            BSTNode p;
            BSTNode p2;
            BSTNode n;

            if (root.getValue() == k) {
                BSTNode left, right;

                left = root.getLeft();
                right = root.getRight();
                if (left == null && right == null)
                    return null;
                else if (left == null) {
                    p = right;
                    return p;
                }
                else if (right == null) {
                    p = left;
                    return p;
                } else {
                    p2 = right;
                    p = right;
                    while (p.getLeft() != null)
                        p = p.getLeft();
                    p.setLeft(left);
                    return p2;
                }
            }
            if (k < root.getValue()) {
                n = delete(root.getLeft(), k);
                root.setLeft(n);
            } else {
                n = delete(root.getRight(), k);
                root.setRight(n);
            }
            return root;
        }


        private int countNodes(BSTNode r) {
            if (r == null)
                return 0;
            else {
                int l = 1;
                l += countNodes(r.getLeft());
                l += countNodes(r.getRight());
                return l;
            }
        }

        private boolean search(BSTNode root, int val) {
            boolean found = false;
            while ((root != null) && !found) {
                int rootVal = root.getValue();
                if (val < rootVal)
                    root = root.getLeft();
                else if (val > rootVal)
                    root = root.getRight();
                else
                {
                    found = true;
                    break;
                }
                found = search(root, val);
            }
            return found;
        }
}
