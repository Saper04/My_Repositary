//№4
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[100];
        int sum = 0;
        int i = 1;
        int max = 0;
        int min = 100000;
        int v = 0;
        System.out.println("Выберете тип");
        System.out.println("1. While");
        System.out.println("2. Do while");
        v = scanner.nextInt();
        if (v == 1) {
            System.out.println("Вводите элементы массива");
            while (i <= 5) {
                i++;
                a[i] = scanner.nextInt();
                sum = sum + a[i];
                if (a[i] >= max) max = a[i];
                if (a[i] <= min) min = a[i];
            }
        }
        else {
        if (v == 2) {
            System.out.println("Вводите элементы массива");
            do {
                a[i] = scanner.nextInt();
                sum = sum + a[i];
                if (a[i] >= max) max = a[i];
                if (a[i] <= min) min = a[i];
                i++;
            } while (i<=5);
        }
        else System.out.print("Нет такого варианта");
        }
        System.out.print("Sum = ");
        System.out.println(sum);
        System.out.print("Max = ");
        System.out.println(max);
        System.out.print("Min = ");
        System.out.println(min);
    }
}