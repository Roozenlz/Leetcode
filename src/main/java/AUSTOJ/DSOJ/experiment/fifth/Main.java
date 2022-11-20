package AUSTOJ.DSOJ.experiment.fifth;

import java.util.Scanner;

/**
 * @author Roozen
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree('#');
        Scanner scanner = new Scanner(System.in);
        int option;
        while ((option = scanner.nextInt()) != -1) {
            switch (option) {
                case 0:
                    return;
                case 1:
                    tree.createBinaryTree(scanner.next().toCharArray());
                    break;
                case 2:
                    tree.preOrderTraverse();
                    break;
                case 3:
                    tree.inOrderTraverse();
                    break;
                case 4:
                    tree.postOrderTraverse();
                    break;
                case 5:
                    System.out.println(tree.binaryTreeDepth());
                    break;
                case 6:
                    System.out.println(tree.leaf());
                    break;
                case 7:
                    System.out.println(tree.nodeCount());
                    break;
            }
        }

    }
}

/**
 * 二叉树
 *
 * @author Roozen
 * @version 1.0
 */
class BinaryTree {

    private Node root;
    private int size;
    private char emptySign;
    private char[] str;
    private int index;

    public BinaryTree(char emptySign) {
        this.emptySign = emptySign;
    }

    public void createBinaryTree(char[] str) {
        if (str == null) {
            root = null;
            return;
        }
        this.str = str;
        root = put(root);
    }

    private Node put(Node n) {
        if (index >= str.length || str[index] == emptySign) {
            index++;
            return null;
        } else {
            size++;
            n = new Node(str[index++], null, null);
            n.left = put(n.left);
            n.right = put(n.right);
        }
        return n;
    }


    public void preOrderTraverse() {
        preOrderTraverse(root);
        System.out.println();
    }

    private void preOrderTraverse(Node n) {
        if (n == null) {
            return;
        }
        System.out.print(n.elem + " ");
        preOrderTraverse(n.left);
        preOrderTraverse(n.right);
    }


    public void inOrderTraverse() {
        inOrderTraverse(root);
        System.out.println();
    }

    private void inOrderTraverse(Node n) {
        if (n == null) {
            return;
        }
        inOrderTraverse(n.left);
        System.out.print(n.elem + " ");
        inOrderTraverse(n.right);
    }


    public void postOrderTraverse() {
        postOrderTraverse(root);
        System.out.println();
    }

    private void postOrderTraverse(Node n) {
        if (n == null) {
            return;
        }
        postOrderTraverse(n.left);
        postOrderTraverse(n.right);
        System.out.print(n.elem + " ");
    }

    public int binaryTreeDepth() {
        return binaryTreeDepth(root);
    }

    private int binaryTreeDepth(Node n) {
        if (n == null) {
            return 0;
        }
        return Math.max(binaryTreeDepth(n.left), binaryTreeDepth(n.right)) + 1;
    }

    public int leaf() {
        return leaf(root);
    }

    private int leaf(Node n) {
        if (n == null) {
            return 0;
        }
        if (n.left == null & n.right == null) {
            return 1;
        }
        return leaf(n.left) + leaf(n.right);
    }

    public int nodeCount() {
        return size;
    }

    private class Node {
        public char elem;
        public Node left;
        public Node right;

        public Node(char elem, Node left, Node right) {
            this.elem = elem;
            this.left = left;
            this.right = right;
        }
    }
}

