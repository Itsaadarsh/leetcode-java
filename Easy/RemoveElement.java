package Easy;

public class RemoveElement {
    public static void main(String[] args) {
        var list = new int[] { 0, 1, 2, 2, 3, 0, 4, 2 };
        var op = remove(list, 2);
        System.out.println(op);
    }

    static int remove(int[] nums, int value) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != value) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}
