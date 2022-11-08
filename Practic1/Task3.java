//№3
/*Написать программу, в результате которой массив чисел создается с
помощью инициализации (как в Си) вводится и считается в цикле сумма
элементов целочисленного массива, а также среднее арифметическое его
элементов результат выводится на экран. Использовать цикл for.
*/
public class Main {
    public static void main(String[] args) {
        int[] a = new int[6];
        int sum = 0;
        double srAR = 0;
        for (int i = 1; i<=5; i++) {
            a[i] = i;
            sum = sum+a[i];
            srAR = sum/5;
            System.out.print("a[");
            System.out.print(i);
            System.out.print("] = ");
            System.out.println(i);
        }
        System.out.print("Sum = ");
        System.out.println(sum);
        System.out.print("srAR = ");
        System.out.println(srAR);
    }
}