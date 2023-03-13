import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] num = {1, 45, 37, 56};
        massiv(num);
    }

    public static void massiv(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        System.out.println(sum);
    }
}