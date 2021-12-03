import java.util.ArrayList;
import java.util.List;

import javax.xml.transform.Result;

public class TwoNumberSum {
    public static void main(String[] args) {
        int input[] = new int[] {3,5,-4,8,11,1,-1,6};
        int targetSum = 10;
        twoNumberSum(input, targetSum);
    }

    public static int[] twoNumberSum(int[] array, int targetSum){
        for (int i : array) {
            System.out.println(i);
            for (int j : array) {
                if(i != j && i + j == targetSum){
                    System.out.println("Found two numbers that equal " + targetSum + " They are " + i + " and " +j);
                    return new int[]{i,j};
                }
            }
        }
        return  new int[0];
    }
}
