public class BinarySearch {
    public static int search(int[] nums, int target) {
        int left = -1, right = nums.length;
        while (right - left > 1) {
            int mid = left + (right - left) / 2;
            if (nums[mid] <= target)
                left = mid;
            else
                right = mid;
        }
        return left;  //last occuring index of target in nums
    } //t.c O(log(nums.length))
      
    public static void main(String[] args) {
        int[] nums={2,2,2,3,5};
        System.out.println(search(nums, 1));

    }
}