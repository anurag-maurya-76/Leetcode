class Solution {
    public static int[] sortArrayByParity(int[] nums) {
        int location = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                int temp = nums[i];
                nums[i] = nums[location];
                nums[location] = temp;
                location++;
            }
        }
        return nums;

    }

    public static void main(String[] args) {
        int[] myArray = { 3, 8, 3, 8, 3, 8, 3, 8, 3, 8 };
        int[] newArray = sortArrayByParity(myArray);
        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]);
        }
    }
}