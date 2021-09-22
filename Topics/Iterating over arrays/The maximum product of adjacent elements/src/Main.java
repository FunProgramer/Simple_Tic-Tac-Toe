import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt();
        int[] ints = new int[length];

        for (int i = 0; i < ints.length; i++) {
            ints[i] = sc.nextInt();
        }

        int maxProduct = Integer.MIN_VALUE;
        for (int i = 1; i < ints.length; i++) {
            int product = ints[i] * ints[i - 1];
            if (product > maxProduct) {
                maxProduct = product;
            }
        }

        System.out.println(maxProduct);
    }
}