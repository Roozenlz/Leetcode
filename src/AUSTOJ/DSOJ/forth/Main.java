package AUSTOJ.DSOJ.forth;

import java.util.Scanner;

/**
 * @author Roozen
 * @version 1.0
 */

public class Main {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(10);
        Scanner scanner = new Scanner(System.in);

        int option;
        while ((option = scanner.nextInt()) != -1) {
            try {
                switch (option) {
                    case 0:
                        queue.printAll();
                        break;
                    case 1:
                        queue.offer(scanner.nextInt());
                        break;
                    case 2:
                        System.out.println(queue.poll());
                        break;
                    case 3:
                        System.out.println(queue.getFirst());
                        break;
                    case 4:
                        System.out.println(queue.size());
                        break;
                    case 5:
                        System.out.println(queue.isEmpty() ? 1 : 0);
                        break;

                    case -1:
                        return;
                }
            } catch (RuntimeException e) {
                System.out.println(-1);
            }

        }

    }

    static class ArrayQueue {
        private int size;
        private int head;
        private int last;
        private int[] queue;

        public ArrayQueue(int size) {
            this.size = size;
            head = 0;
            last = 0;
            queue = new int[size];
        }

        public void offer(int n) {
            if (isFull()) {
                throw new RuntimeException("满了");
            }
            queue[last] = n;
            last = (last + 1) % size;
        }

        public int poll() {
            if (isEmpty()) {
                throw new RuntimeException("空的");
            }
            int val = queue[head];
            head = (head + 1) % size;
            return val;
        }

        public int getFirst() {
            if (isEmpty()) {
                throw new RuntimeException("空的");
            }
            return queue[head];
        }

        public boolean isEmpty() {
            return head == last;
        }

        public boolean isFull() {
            return head == (last + 1) % size;
        }

        public void printAll() {
            for (int i = head; i < head + size(); i++) {
                System.out.printf("%d\n", queue[i % size]);
            }
        }

        public int size() {
            return (last + size - head) % size;
        }

    }

}

