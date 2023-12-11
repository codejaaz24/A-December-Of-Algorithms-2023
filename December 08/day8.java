import java.util.Arrays;
import java.util.Scanner;

public class day8 {
    public static int[][] findPath(int n) {
        int[][] magicSquare = new int[n][n];
        int i = 0;
        int j = n / 2;//mid
        for (int num = 1; num <= n * n; num++) {
            magicSquare[i][j] = num; //0th row mid ele
            i--;
            j++;
            if (num % n == 0) {
                i += 2;
                j--;
            } 
            else {
                if (j == n) {
                    j -= n;
                } else if (i < 0) {
                    i += n;
                }
            }
        }
        return magicSquare;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] result = findPath(n);

        for (int i = 0; i < result.length; i++) {
            System.out.println(Arrays.toString(result[i]));
        }
    }
}
