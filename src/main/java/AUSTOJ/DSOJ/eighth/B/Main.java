package AUSTOJ.DSOJ.eighth.B;

import java.util.Comparator;
import java.util.Scanner;

/**
 * @author Roozen
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            int option;
            Student[] arr = null;
            while ((option = scanner.nextInt()) != 0) {
                switch (option) {
                    case 1:
                        int n = scanner.nextInt();
                        arr = new Student[n];
                        for (int i = 0; i < n; i++) {
                            arr[i] = new Student(scanner.nextInt(), scanner.nextInt(), scanner.next());
                        }
                        break;
                    case 4:
                        if (scanner.nextInt() == 1) {
                            bubbleSort(arr, Student::compareTo);
                        } else {
                            bubbleSort(arr, Comparator.reverseOrder());
                        }
                        printArr(arr);
                        break;
                    case 5:
                        if (scanner.nextInt() == 1) {
                            quickSort(arr, Student::compareTo);
                        } else {
                            quickSort(arr, Comparator.reverseOrder());
                        }
                        printArr(arr);
                        break;
                }
            }
        } catch (Exception e) {
        }
    }

    private static void printArr(Student[] arr) {
        for (Student i : arr) {
            System.out.println(i);
        }
    }

    //冒泡排序
    private static void bubbleSort(Student[] arr, Comparator<Student> com) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (com.compare(arr[j], arr[j + 1]) > 0) {
                    Student tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }

    //快速排序
    private static void quickSort(Student[] arr, Comparator<Student> com) {
        int lo = 0;
        int hi = arr.length - 1;
        sort(arr, lo, hi, com);
    }

    private static void sort(Student[] a, int lo, int hi, Comparator<Student> com) {
        if (hi <= lo) {
            return;
        }
        //对a数组中，从lo到hi的元素进行切分
        int partition = partition(a, lo, hi, com);
        //对左边分组中的元素进行排序
        //对右边分组中的元素进行排序
        sort(a, lo, partition - 1, com);
        sort(a, partition + 1, hi, com);
    }

    public static int partition(Student[] a, int lo, int hi, Comparator<Student> com) {
        Student key = a[lo];//把最左边的元素当做基准值
        int left = lo;//定义一个左侧指针，初始指向最左边的元素
        int right = hi + 1;//定义一个右侧指针，初始指向左右侧的元素下一个位置
        //进行切分
        while (true) {
            //先从右往左扫描，找到一个比基准值小的元素
            while (com.compare(key, a[--right]) < 0) {//循环停止，证明找到了一个比基准值小的元素
                if (right == lo) {
                    break;//已经扫描到最左边了，无需继续扫描
                }
            }
            //再从左往右扫描，找一个比基准值大的元素
            while (com.compare(a[++left], key) < 0) {//循环停止，证明找到了一个比基准值大的元素
                if (left == hi) {
                    break;//已经扫描到了最右边了，无需继续扫描
                }
            }
            if (left >= right) {
                //扫描完了所有元素，结束循环
                break;
            } else {
                //交换left和right索引处的元素
                Student tmp = a[left];
                a[left] = a[right];
                a[right] = tmp;
            }
        }
        //交换最后right索引处和基准值所在的索引处的值
        Student tmp = a[lo];
        a[lo] = a[right];
        a[right] = tmp;
        return right;//right就是切分的界限
    }


    private static class Student implements Comparable<Student> {
        private int id;
        private int age;
        private String name;

        public Student(int id, int age, String name) {
            this.id = id;
            this.age = age;
            this.name = name;
        }

        @Override
        public String toString() {
            return id + " " + age + " " + name;
        }

        @Override
        public int compareTo(Student o) {
            return this.id - o.id;
        }
    }
}

