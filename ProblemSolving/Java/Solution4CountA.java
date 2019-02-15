import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution4CountA {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        int numberOfA = 0;
        String[] str = s.split("");
        for (String s1 : str) {
            if (s1.equalsIgnoreCase("a")) numberOfA++;
        }
        long sInInputString = (long) Math.floor(n / s.length());
        long totalNumberOfA = sInInputString * numberOfA;
        long remains = s.length() * sInInputString;
        long rest = n - remains;
        if (rest > 0) {
            for (int i=0;i<rest;i++){
                if (str[i].equalsIgnoreCase("a"))totalNumberOfA++;
            }
        }
        return totalNumberOfA;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);
        System.out.println(result);

        //  bufferedWriter.write(String.valueOf(result));
        // bufferedWriter.newLine();

        //bufferedWriter.close();

        scanner.close();
    }
}
