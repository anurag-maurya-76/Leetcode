import java.util.Arrays;

public class Solution {
    static int leftIndex(int arr[], int x) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr[m] == x) {
                r = m - 1;
            } else if (arr[m] < x)
                l = m + 1;
            else
                r = m - 1;
        }
        return l;
    }

    static int rightIndex(int arr[], int x) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr[m] == x) {
                l = m + 1;
            } else if (arr[m] < x)
                l = m + 1;
            else
                r = m - 1;
        }
        return r;
    }

    public static int[] searchRange(int[] nums, int target) {
        int left = 0, right = 0;
        left = leftIndex(nums, target);
        right = rightIndex(nums, target);
        if (left > right) {
            return new int[] { -1, -1 };
        }
        return new int[] { left, right };
    }

    public static void main(String[] args) {
        int[] myNum = {};
        System.out.println(Arrays.toString(searchRange(myNum, 7)));
    }
}
