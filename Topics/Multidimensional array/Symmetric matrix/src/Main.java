import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create matrix array
        int len = sc.nextInt();
        int[][] matrix = new int[len][len];

        // Read in matrix array
        for (int y = 0; y < matrix.length; y++) {
            for (int x = 0; x < matrix[y].length; x++) {
                matrix[y][x] = sc.nextInt();
            }
        }

        // Check if it is symmetric
        boolean isSymmetric = true;
        for (int y = 0; y < matrix.length; y++) {
            for (int x = 0; x < matrix[y].length; x++) {
                if (matrix[y][x] != matrix[x][y]) {
                    isSymmetric = false;
                    break;
                }
            }
        }

        // Print out the result
        System.out.println(isSymmetric ? "YES" : "NO");
    }
}