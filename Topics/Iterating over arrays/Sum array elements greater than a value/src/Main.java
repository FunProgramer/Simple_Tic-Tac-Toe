import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int len = sc.nextInt();
        int[] intsArray = new int[len];

        for (int i = 0; i < intsArray.length; i++) {
            intsArray[i] = sc.nextInt();
        }

        int n = sc.nextInt();
        int sum = 0;
        for (int i :
                intsArray) {
            if (i > n) {
                sum += i;
            }
        }

        System.out.println(sum);
    }
}