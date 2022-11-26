package AUSTOJ.DSOJ.eighth.C;

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
                    case 6:
                        if (scanner.nextInt() == 1) {
                            selectSort(arr, Student::compareTo);
                        } else {
                            selectSort(arr, Comparator.reverseOrder());
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

    //简单选择排序
    private static void selectSort(Student[] arr, Comparator<Student> com) {
        for (int i = 0; i < arr.length; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (com.compare(arr[index], arr[j]) > 0) {
                    index = j;
                }
            }
            Student tmp = arr[index];
            arr[index] = arr[i];
            arr[i] = tmp;
        }
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


