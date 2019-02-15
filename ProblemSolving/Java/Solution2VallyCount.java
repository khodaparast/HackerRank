import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution2VallyCount {

    // Complete the countingValleys function below.

    static int countingValleys(int n, String s) {
        int result = 0;
        String[] str = s.split("");
        int seaLevel = 0;
        int valy = 0;
        for (int i=0;i<str.length;i++){
            if (str[i].equalsIgnoreCase("U")){
                seaLevel++;
            }else {
                if (seaLevel==0){
                    valy++;
                    seaLevel--;
                }
                else seaLevel--;
            }
        }
        return valy;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = countingValleys(n, s);
        System.out.println("Number of Vally: "+result);

        //  bufferedWriter.write(String.valueOf(result));
        // bufferedWriter.newLine();

        // bufferedWriter.close();

        scanner.close();
    }
}
//Test Cases:
//n:2 DU -->V=1
//n:4 UDDU -->V=1, n:4 UDUD
//n:6 UDDDUU -->v=1
//n:8 UDDDUDUU --> v=1