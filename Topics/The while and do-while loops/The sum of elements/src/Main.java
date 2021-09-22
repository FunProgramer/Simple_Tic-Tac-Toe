import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean stop = false;
        int sum = 0;
        while (!stop) {
            int i = sc.nextInt();
            if (i == 0) {
                stop = true;
            } else {
                sum += i;
            }
        }

        System.out.println(sum);
    }
}