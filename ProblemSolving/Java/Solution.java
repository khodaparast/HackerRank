import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by "P.Khodaparast" on 2019-02-15.
 */
public class Solution {

    int calcOneOperation( String operation,int var1, int var2){
        int result=0;
        switch (operation){
            case "+":
                result=var1+var2;
                break;
            case "-":
                result=var1-var2;
                break;
            case "*":
                result=var1*var2;
                break;
            case  "/":
                result=var1/var2;
        }
        return result;
    }
    int calcOperation(ArrayList<String> operations, ArrayList<Integer> operands){
        int result=0;
        int operationIndex=operations.size()-1;
        int operandIndex=0;
        while (operationIndex>=0){
            if (operandIndex==0){
                result=calcOneOperation(operations.get(operationIndex),operands.get(operandIndex),operands.get(operandIndex+1));
                System.out.println(result+"<---result");
                operandIndex=operandIndex+2;
            }
            else {
                result=calcOneOperation(operations.get(operationIndex),result,operands.get(operandIndex));
                System.out.println("res-->"+result);
                operandIndex++;
            }
            operationIndex--;
        }


        return result;
    }
    HashMap<String, ArrayList> inputVal(String str){
       String[] result=str.split(" ");
        ArrayList<String> operations=new ArrayList<>();
        ArrayList<Integer> operands=new ArrayList<>();
        for (String s : result) {
        switch (s){
            case "+":
                operations.add(s.trim());
                break;
            case  "-":
                operations.add(s.trim());
                break;
            case "*":
                operations.add(s.trim());
                break;
            case "/":
                operations.add(s.trim());
                break;
            default:
                operands.add(Integer.parseInt(s));
        }
        }
       HashMap<String, ArrayList> res=new HashMap<>();
        res.put("operations",operations);
        res.put("operands",operands);
        return res;
   }

    public static void main(String[] args) {

        String str="+ - 3 2 4";
        Solution s=new Solution();
        HashMap<String, ArrayList> res=s.inputVal(str);
        System.out.println(res.get("operations"));
        System.out.println(res.get("operands"));
        System.out.println(s.calcOperation(res.get("operations"),res.get("operands")));

    }
}
