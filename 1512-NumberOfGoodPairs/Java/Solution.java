import java.util.HashMap;

class Solution {
    public static int numIdenticalPairs(int[] nums) {
        int count = 0;
        HashMap<Integer, Integer> myMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            boolean contains = myMap.containsKey(nums[i]);
            myMap.put(nums[i], contains ? myMap.get(nums[i]) + 1 : 1);
        }
        for (Integer num : myMap.values()) {
            count += ((num - 1) * num) / 2;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] myArray = { 1, 2, 3 };
        int newArray = numIdenticalPairs(myArray);
        System.out.println(newArray);
    }
}