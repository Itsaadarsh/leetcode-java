package Easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        var list = new int[] { 11, 15, 3, 6 };
        var op = twoSum(list, 9);
        System.out.println(Arrays.toString(op));
    }

    static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                result[1] = i;
                result[0] = map.get(target - nums[i]);
                return result;
            }
            map.put(nums[i], i);
        }
        return result;
    }
}