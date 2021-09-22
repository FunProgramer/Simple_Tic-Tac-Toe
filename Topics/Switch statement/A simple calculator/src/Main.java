import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split(" ");
        long a = Long.parseLong(input[0]);
        char operator = input[1].charAt(0);
        long b = Long.parseLong(input[2]);

        switch (operator) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '/':
                if (b == 0) {
                    System.out.println("Division by 0!");
                } else {
                    System.out.println(a / b);
                }
                break;
            case '*':
                System.out.println(a * b);
                break;
            default:
                System.out.println("Unknown operator");
        }

    }
}