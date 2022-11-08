//№6
/*Написать программу, в результате работы которой выводятся на экран
первые 10 чисел гармонического ряда (форматировать вывод).*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = 0;
        for (int i = 1; i < 11; i++) {
            a = 1./i;
            System.out.print(i);
            System.out.print(". ");
            System.out.format("%.3f",a);
            System.out.println();

        }
    }
}