package Easy;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;

public class RemoveDup {
    public static void main(String[] args) {
        var op = remove(new int[] { -3, -1, 0, 0, 0, 3, 3 });
        // System.out.println(op);
    }

    static int remove(int[] nums) {
        var setList = new HashSet<Integer>();
        for (Integer n : nums) {
            setList.add(n);
            System.out.println(setList.toString());
        }
        Object[] arr = setList.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            nums[i] = Integer.parseInt(arr[i].toString());
        }
        // for (int n : nums) {
        // System.out.println(n);
        // }
        return setList.size();

    }
}
