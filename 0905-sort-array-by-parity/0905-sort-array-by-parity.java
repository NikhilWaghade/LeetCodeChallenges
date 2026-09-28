class Solution {
    public int[] sortArrayByParity(int[] nums) {
        // Brute Force = T:O(n), S:O(n)
        // int[] result = new int[nums.length];
        // int idx = 0;

        // for (int i = 0; i < nums.length; i++) {
        //     if (nums[i] % 2 == 0) {
        //         result[idx] = nums[i];
        //         idx++;
        //     }
        // }

        // for (int i = 0; i < nums.length; i++) {
        //     if (nums[i] % 2 != 0) {
        //         result[idx] = nums[i];
        //         idx++;
        //     }
        // }
        // return result;

        // optimal Using Two Pointer + Swap
        // T:O(n), S:O(1)
        int left =0 ;
        for(int right=0; right < nums.length; right++){
            if(nums[right] %2 == 0){
                int temp = nums[left];
                nums[left]= nums[right];
                nums[right] = temp;

                left++;
            }
        }
        return nums;
    }
}