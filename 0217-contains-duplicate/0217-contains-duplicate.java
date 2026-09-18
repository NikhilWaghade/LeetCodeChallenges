class Solution {
    public boolean containsDuplicate(int[] nums) {
        // for(int i=0; i<nums.length;i++){
        //     if(nums[i] != nums[i+1]){
        //         return false;
        //     }
        //     else{
        //         return true;
        //     }
        // }
        // return false;

    //   sorting method 
       Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            // T:O(n log n), S:O(log n)
            if(nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
    }
}