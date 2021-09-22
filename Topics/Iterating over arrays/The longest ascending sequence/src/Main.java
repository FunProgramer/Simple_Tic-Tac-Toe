import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arrayLength = sc.nextInt();
        int[] ints = new int[arrayLength];

        for (int i = 0; i < ints.length; i++) {
            ints[i] = sc.nextInt();
        }

        int index = 0;
        int[] lengthCounts = new int[arrayLength];
        for (int i = 1; i < ints.length; i++) {
            if (ints[i] > ints[i - 1]) {
                if (lengthCounts[index] == 0) {
                    lengthCounts[index] = 2;
                } else {
                    lengthCounts[index]++;
                }
            } else {
                index++;
            }
        }

        int maxSequenzLength = 1;
        for (int i = 1; i < lengthCounts.length; i++) {
            int lengthCandidate = Integer.max(lengthCounts[0], lengthCounts[i]);
            if (lengthCandidate > maxSequenzLength) {
                maxSequenzLength = lengthCandidate;
            }
        }

        System.out.println(maxSequenzLength);
    }
}