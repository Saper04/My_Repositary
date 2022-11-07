//№3
public class Main {
    public static void main(String[] args) {
        int[] a = new int[6];
        int sum = 0;
        int srAR = 0;
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