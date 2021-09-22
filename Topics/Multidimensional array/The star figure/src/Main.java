import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        String[][] matrix = new String[n][n];

        for (int y = 0; y < matrix.length; y++) {
            for (int x = 0; x < matrix[y].length; x++) {
                if (y == matrix.length / 2) {
                    matrix[y][x] = "*";
                } else if (x == y || x == matrix[y].length / 2 || x == matrix[y].length -1 + (-y)) {
                    matrix[y][x] = "*";
                } else {
                    matrix[y][x] = ".";
                }
            }
        }

        for (String[] row :
                matrix) {
            for (String ch :
                    row) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }

    }
}