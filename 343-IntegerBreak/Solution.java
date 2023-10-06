import java.util.HashMap;
import java.util.Map;

public class Solution {
    Map<Integer, Integer> myMap = new HashMap<Integer, Integer>();
    Integer target = 0;

    public int integerBreak(int n) {
        myMap.put(1, 1);
        target = n;
        return myRecursion(n);
    }

    int myRecursion(int num) {
        if (myMap.get(num) != null) {
            return myMap.get(num);
        }
        int max = target == num ? 0 : num;
        myMap.put(num, max);
        for (int i = 1; i < num; i++) {
            int result = myRecursion(i) * myRecursion(num - i);
            max = result > max ? result : max;
            myMap.put(num, max);
        }
        return myMap.get(num);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.integerBreak(5));
    }
}
