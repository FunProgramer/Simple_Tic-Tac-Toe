import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt();
        int[] ints = new int[length];

        for (int i = 0; i < ints.length; i++) {
            ints[i] = sc.nextInt();
        }

        int numberToCheck = sc.nextInt();
        boolean doesContain = false;
        for (int i :
                ints) {
            if (i == numberToCheck) {
                doesContain = true;
            }
        }

        System.out.println(doesContain);
    }
}