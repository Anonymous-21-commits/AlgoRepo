import java.util.Arrays;

class DNF {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 0, 1, 0, 2, 0, 1, 0, 2, 0 };
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void sort(int[] nums) {
        int i = 0, j = nums.length - 1, k = 0;
        while (k <= j) {
            if (nums[k] == 1) {
                k++;
            } else if (nums[k] == 0) {
                swap(nums, i, k);
                i++;
                k++;
            } else {
                swap(nums, j, k);
                j--;
            }
        }
    }

    public static void swap(int[] nums, int i1, int i2) {
        int temp = nums[i1];
        nums[i1] = nums[i2];
        nums[i2] = temp;
    }
}
