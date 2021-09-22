import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int len = new Scanner(System.in).nextInt();
        int[][] matrix = new int[len][len];

        for (int y = 0; y < matrix.length; y++) {
            for (int x = 0; x < matrix[y].length; x++) {
                if (x == y) {
                    matrix[y][x] = 0;
                } else if (y > x) {
                    matrix[y][x] = y - x;
                } else {
                    matrix[y][x] = x - y;
                }
            }
        }

        for (int[] row :
                matrix) {
            for (int i :
                    row) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}