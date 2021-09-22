import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        while(sc.hasNextInt()) {
            int int_ = sc.nextInt();
            if (int_ % 4 == 0 && int_ > max) {
                max = int_;
            }
        }

        System.out.println(max);
    }
}