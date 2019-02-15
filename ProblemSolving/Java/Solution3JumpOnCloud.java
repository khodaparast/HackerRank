import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution3JumpOnCloud {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
        int result=0;
        int i=0;
        int n=c.length;
        //if (c.length%2==0)
        while(i<c.length-1){
            System.out.println("i: "+i);
            if ( n>2 && c[i+2]==0 ){
                result++;
                i=i+2;
                n=n-2;
            }else{
                result++;
                i++;
                n--;
            }
        }
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = jumpingOnClouds(c);
        System.out.println(result);

      //  bufferedWriter.write(String.valueOf(result));
       // bufferedWriter.newLine();

        //bufferedWriter.close();

        scanner.close();
    }
}
