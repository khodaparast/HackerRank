import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution5MatrixDiagonalSum {

    // Complete the diagonalDifference function below.
    static int diagonalDifference(int[][] arr) {
        int result = 0;
        int LTR = 0;
        int RTL = 0;
        System.out.println(arr.length);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j)
                    LTR = LTR + arr[i][j];
                if (i + j == arr.length - 1)
                    RTL = RTL + arr[i][j];

            }
        }

        System.out.println("LTR: " + RTL);
        System.out.println("RTL:" + LTR);
        result = Math.abs(LTR - RTL);
        return result;
    }
//  11 2 4
    //    4 5 6
    //  10 8 -12

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < n; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = diagonalDifference(arr);
        System.out.println(result);

        // bufferedWriter.write(String.valueOf(result));
        // bufferedWriter.newLine();

        // bufferedWriter.close();

        scanner.close();
    }
}
