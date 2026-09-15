class Solution {
    public int[] sortedSquares(int[] nums) {
        // for (int i = 0; i < nums.length; i++) {
        //     // T:O(n log n) , S:O(1) Brute Force Approch
        //     nums[i] = nums[i] * nums[i];
        // }
        // Arrays.sort(nums);
        // return nums;

        // second approach 
        int left = 0;
        int right = nums.length - 1;
        int pos = nums.length - 1;

        int[] result = new int[nums.length];

        while (left <= right) {
            // T: o(n),S:o(n)
            int lftSqr = nums[left] * nums[left];
            int rgtSqr = nums[right] * nums[right];

            if(lftSqr >= rgtSqr) {
                result[pos] = lftSqr;
                left++;
            }
            else{
                result[pos] = rgtSqr;
                right--;
            }
            pos--;
        }
        return result ;
    }
}