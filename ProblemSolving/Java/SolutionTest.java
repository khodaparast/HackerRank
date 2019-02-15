//import java.io.*;
//import java.util.*;
//
//public class Solution {
//
//    static float getMean(float[] vals) {
//        float result = 0;
//        for (int i = 0; i < vals.length; i++) {
//            result = result + vals[i];
//        }
//        if (vals.length != 0) result = result / vals.length;
//        return result;
//    }
//
//    static float getMedian(float[] vals) {
//        Arrays.sort(vals);
//        float result=0;
//        if (vals.length % 2 == 0){
//            float firstElement=vals[vals.length/2];
//            float secondElement=vals[vals.length/2-1];
//            return (firstElement+secondElement)/2;
//        }
//        else return (float) (Math.floor(vals.length/2)+1);
//
//    }
//    static  float getMode(float[] vals){
//        Arrays.sort(vals);
//        in
//        for (int i=0;i<vals.length;i++){
//
//        }
//    }
//
//    public static void main(String[] args) {
//        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//        float[] vals = {3, 1, 1, 4};
//        System.out.println(getMean(vals));
//        System.out.println(getMedian(vals));
//    }
//}
//
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class SolutionTest {
// find odd number between l and r


    // Complete the findNumber function below.
    static String findNumber(List<Integer> arr, int k) {
        if (arr.size()<k || arr.size()==0 ||k<1) return "NO";
        if(arr.get(k-1)==k) return "YES";
        return "No";

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> arrTemp = new ArrayList<>();

        IntStream.range(0, arrCount).forEach(i -> {
            try {
                arrTemp.add(bufferedReader.readLine().replaceAll("\\s+$", ""));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        List<Integer> arr = arrTemp.stream()
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        String res = findNumber(arr, k);
        System.out.println(res);

      //  bufferedWriter.write(res);
      //  bufferedWriter.newLine();

        bufferedReader.close();
       // bufferedWriter.close();
    }
}
