import java.util.Scanner;

public class ArrayQueueDemo02 {
    public static void main(String[] args) {
        ChangeArray changeArray = new ChangeArray(3);
        int NEXT;
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;
        while (loop) {
            NEXT = scanner.nextInt();
            switch (NEXT) {
                case 1:
                    try {
                        int X = scanner.nextInt();
                        changeArray.addArray(X);
                    } catch (Exception e) {
                        System.out.println(-1);
                    }
                    break;
                case 2:
                    try {
                        System.out.println(changeArray.getArray());
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    break;
                case 0:
                    changeArray.showArray();
                    break;
                case 3:
                    System.out.println(changeArray.popArray());
                    break;
                case 4:
                    System.out.println(changeArray.LengthArray());
                    break;
                case 5:
                    if (changeArray.isEmpty()) {
                        System.out.println(1);
                    } else
                        System.out.println(0);
                    break;
                case -1:
                    loop = false;
            }
        }
    }
}

class ChangeArray {
    public int head;
    public int end;
    public int maxSize;
    public int[] arr;

    public ChangeArray(int maxSize) {
        this.maxSize = maxSize;
        arr = new int[maxSize];
        head = 0;
        end = 0;
    }

    public boolean isFull() {
        return (end + 1) % maxSize == head;
    }

    public boolean isEmpty() {
        return end == head;
    }

    public void addArray(int n) {
        if (isFull()) {
            throw new RuntimeException("-1");
        }
        arr[end] = n;
        end = (end + 1) % maxSize;
    }

    public int getArray() {
        if (isEmpty()) {
            return -1;
        }
        int shortTimeNum = arr[head];
        head = (head + 1) % maxSize;
        return shortTimeNum;
    }

    public void showArray() {
        for (int i = head; i < head + (end + maxSize - head) % maxSize; i++) {
            System.out.println(arr[i % maxSize]);
        }
    }

    public int popArray() {
        if (isEmpty()) {
            return -1;
        }
        return arr[head];
    }

    public int LengthArray() {
        return (end + maxSize - head) % maxSize;
    }
}
