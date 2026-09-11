class Solution {
    public void moveZeroes(int[] nums) {

        //     int k=0;
        // T:0(n) , S:0(1)
        //     for(int i=0;i<nums.length;i++){
        //         if(nums[i] != 0){
        //             nums[k]=nums[i];
        //             k++;
        //           }
        //     }
        //    while(k < nums.length){
        //     nums[k] = 0;
        //     k++;
        //    }

        // second approach 
        // Complexity
        //   T:O(n),S:O(1)
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = 0;
                nums[k] = temp;
                k++;
            }
        }
    }
}