package AUSTOJ.S1003;

public class Main {
    public static void main(String[] args) {
        int A = 0;
        int B = 0;
        for (int i = 1; i <= 1000; i++) {
            int n1 = 0;
            int n2 = 0;
            int n;
            int j = i;
            while (j != 0) {
                n = j & 1;
                if (n == 0) {
                    n2++;
                } else {
                    n1++;
                }
                j >>= 1;
            }
            if (n1 > n2) A++;
            else B++;
        }
        System.out.println(A + " " + B);
    }
}
