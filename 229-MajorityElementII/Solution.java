import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> output = new ArrayList<Integer>();
        int length = nums.length;
        Map<Integer, Integer> myMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < length; i++) {
            myMap.put(nums[i], myMap.get(nums[i]) == null ? 1 : myMap.get(nums[i]) + 1);
        }
        int count = length / 3;
        for (Map.Entry<Integer, Integer> mapElement : myMap.entrySet()) {
            if (mapElement.getValue() > count) {
                output.add(mapElement.getKey());
            }
        }
        return output;
    }

    public static void main(String[] args) {

    }
}
