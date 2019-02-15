import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class Solution1SockPair {

    // Complete the sockMerchant function below.
    // this function count the number of sock pairs in an array
    static int sockMerchant(int n, int[] ar) {
        HashMap<Integer, Integer> count=new HashMap<>();
        for(int i=0;i<ar.length;i++){
            if (count.get(ar[i])==null)count.put(ar[i],0);
            count.put(ar[i],count.get(ar[i])+1);
        }
        System.out.println(count);
        int result=0;
        int t=0;
        for (Integer integer : count.keySet()) {

                result= (int) (result+Math.floor(count.get(integer)/2));
        }
       return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
    //    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);
        System.out.println(result);

      //  bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        //bufferedWriter.close();

        scanner.close();
    }
}
