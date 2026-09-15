class Solution {
    public int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            // T:O(n log n) , S:O(1) Brute Force Approch
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;

    }
}