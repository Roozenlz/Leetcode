package AUSTOJ.DSOJ.seventh.B;

import java.util.Scanner;

/**
 * @author Roozen
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opt, target;
        BinaryTree tree = new BinaryTree();
        while ((opt = scanner.nextInt()) != 0) {
            switch (opt) {
                case 1:
                    int n = scanner.nextInt();
                    for (int i = 0; i < n; i++) {
                        tree.add(scanner.nextInt());
                    }
                    break;
                case 2:
                    tree.inOrderPrint();
                    break;
                case 3:
                    System.out.println(tree.find(scanner.nextInt()) ? 1 : 0);
                    break;
            }
        }
    }


    private static class BinaryTree {
        private Node root;

        public void add(int value) {
            root = add(root, value);
        }

        private Node add(Node n, int value) {
            if (n == null) {
                return new Node(null, null, value);
            }
            if (value < n.value) {
                n.left = add(n.left, value);
            } else if (value > n.value) {
                n.right = add(n.right, value);
            }
            return n;
        }

        public void inOrderPrint() {
            inOrderPrint(root);
            System.out.println();
        }

        private void inOrderPrint(Node n) {
            if (n == null) {
                return;
            }
            inOrderPrint(n.left);
            System.out.print(n.value + " ");
            inOrderPrint(n.right);
        }

        public boolean find(int target) {
            return find(root, target);
        }

        private boolean find(Node n, int target) {
            if (n == null) {
                return false;
            }
            if (target < n.value) {
                return find(n.left, target);
            } else if (target > n.value) {
                return find(n.right, target);
            } else {
                return true;
            }
        }

        private class Node {
            Node left;
            Node right;
            int value;

            public Node(Node left, Node right, int value) {
                this.left = left;
                this.right = right;
                this.value = value;
            }
        }
    }
}
