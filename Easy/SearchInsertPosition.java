package Easy;

public class SearchInsertPosition {
    public static void main(String[] args) {
        var list = new int[] { 1, 3, 5, 6 };
        var op = searchInsert(list, 8);
        System.out.println(op);
    }

    static int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > target) {
                return i;
            }
        }
        return nums.length;
    }
}
