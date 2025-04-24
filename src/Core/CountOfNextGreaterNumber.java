// Input List of daily temperature
// Output List of number of days to wait to get warmer temperature
// {73, 74, 75, 71, 69, 72, 76, 73}
// {1, 1, 4, 2, 1, 1, 0, 0}
// Can be optimized from O(n^2) to O(n) using Stack

package Core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountOfNextGreaterNumber {
    public static void main(String[] args) {
        List<Integer> input = new ArrayList<>(Arrays.asList(73, 74, 75, 71, 69, 72, 76, 73));
        List<Integer> output = new ArrayList<>();
        int listSize = input.size();
        int num1, num2, count = 0;
        boolean flag = false;
        
        for(int i = 0; i < listSize; i++) {
            num1 = input.get(i);
            //System.out.println("num1 " + num1);
            if (i+1 < listSize) {
                count = 0;
                for (int j = i + 1; j < listSize; j++) {
                    num2 = input.get(j);
                    //System.out.println("num2 " + num2);
                    if(num2 > num1) {
                        flag = true;
                        count++;
                        break;
                    }
                    else {
                        flag = false;
                        count++;
                    }
                }
                if (flag == true) {
                    output.add(count);
                }
                else {
                    output.add(0);
                }
            }
            else {
                output.add(0);
            }
        }
        System.out.println(output);
    }
}
