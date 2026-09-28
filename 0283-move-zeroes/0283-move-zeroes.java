class Solution {
    public void moveZeroes(int[] nums) {
        // brute force 
        // T:O(n), S:O(1)
        // int [] result = new int [nums.length];
        // int j=0;
        // for(int i=0; i<nums.length; i++){
        //     if(nums[i] !=0 ){
        //         result[j] = nums[i];
        //         j++;
        //     }
        // }
        // for(int i=0; i<nums.length; i++){
        //     nums[i] = result[i];
        // }

        // two pointer 
        // T:O(n), S: O(1)
        // int slow =0, fast = 0;
        
        // while(fast < nums.length){
        //     if(nums[fast] != 0){
        //     nums[slow] = nums[fast];
        //     slow++;
        //     }
        //     fast++;
        // }
         
        // while(slow < nums.length){
        //     nums[slow] = 0;
        //     slow++;
        // }

        // or swap 
        // T:O(n), S:O(1)
        int slow =0, fast = 0;
        
        while(fast < nums.length){
            if(nums[fast] != 0){
            int temp = nums[fast];
            nums[fast] = nums[slow];
            nums[slow] = temp;
            slow++;
        }
        fast++;
        }
    }
}