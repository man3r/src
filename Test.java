import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();

        for (int j = 0; j < q; j++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();

            int a1 = sc.nextInt();
            int b1 = sc.nextInt();
            int n1 = sc.nextInt();

            int t = a;
            for (int k = 0; k < n; k++) {
                t += Math.pow(2, k) * b;
                System.out.println(t);
            }

            System.out.println("\n");

            int t1 = a1;
            for (int k1 = 0; k1 < n1; k1++) {
                t1 += Math.pow(2, k1) * b1;
                System.out.println(t1);
            }

        }
    }
}
