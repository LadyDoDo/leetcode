package June;

/**
 * @Author: zhangdanjin
 * @Date: 2020/6/29 16:57
 */
public class Solution_215 {
    public int findKthLargest(int[] nums, int k) {
        if (nums == null || k < 0) {
            return 0;
        }
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        return nums[nums.length - k];
    }

    public static void main(String[] args) {
        int[] arr1 = new int[]{7, 6, 5, 4, 3, 2, 1};
        int k = 2;
        Solution_215 solution_215 = new Solution_215();
        System.out.println(solution_215.findKthLargest(arr1, k));
    }
}
