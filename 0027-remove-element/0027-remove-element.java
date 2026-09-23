class Solution {
    public int removeElement(int[] nums, int val) {
        // approch 1 Order Maintained
        // T:o(n), o(1)
        // int i =0;
        // for(int j=0; j<nums.length;j++){
        //     if(nums[j] != val){
        //         nums[i] = nums[j];
        //         i++;
        //     }
        // }
        // return i;

        // approch 2 Order Not Maintained but Good
        // T:o(n), o(1)
        int n = nums.length;
        int i =0;
        while(i<n){
            if(nums[i] == val){
                nums[i] = nums[n-1];
                n--;
            }
            else{
                i++;
            }
        }
        return n;
    }
}