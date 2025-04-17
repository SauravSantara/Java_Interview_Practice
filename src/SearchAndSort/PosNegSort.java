// input={-7,3,-4,2,6,-1}
// output={2,-1,3,-4,6,-7}
package SearchAndSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PosNegSort {
    public static List<Integer> posNegSort(List<Integer> result, int count) {
        Integer smallPos = null;
        Integer smallNeg = null;
        int listLen = result.size();

        if (listLen > count) {
            
            for (int num = 0; num < listLen - count; num++) {
                if (result.get(num) > 0) {
                    if (smallPos == null || result.get(num) < smallPos) {
                        smallPos = result.get(num);
                    }
                }
            }
            result.remove(smallPos);
            result.add(smallPos);
            
            for (int num = 0; num < listLen - count; num++) {
                if (result.get(num) < 0) {
                    if (smallNeg == null || result.get(num) > smallNeg) {
                        smallNeg = result.get(num);
                    }
                }
            }
            result.remove(smallNeg);
            result.add(smallNeg);

            posNegSort(result, count + 2);
        }
        return result;
    }
    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<>(Arrays.asList(-7,3,-4,2,6,-1));
        System.out.println("Input : " + list);
        //List<Integer> result = new ArrayList<>(list.size());
        


        System.out.println("Output : " + posNegSort(list, 0));
    }
}
