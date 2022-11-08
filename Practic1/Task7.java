//№7
/*Написать программу, которая с помощью метода класса, вычисляет
факториал числа (использовать управляющую конструкцию цикла), проверить
работу метода.*/
import java.util.Scanner;
public class Main {
    public class Factorial {
        static int n = 1;
        public int Facto(int a) {
        for (int i = 1; i <= a; i++) {
            n = n * i;
            }
        return n;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int g = 0;
        Factorial factorial = new Main().new Factorial();
        System.out.println("Введите число для которого нужно найти факториал");
        g = scanner.nextInt();
        factorial.Facto(g);
        System.out.println("Факториал равен " + Factorial.n);
    }
}