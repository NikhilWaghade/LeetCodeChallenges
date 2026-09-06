class Solution {
     public void Rev(int[] nums, int start, int end ){
        while(start <= end){

        int temp = nums[start];
        nums[start]=nums[end];
        nums[end]=temp;

        start++;
        end --;
           
        }
     }
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        // if(k % n == 0){
        //     return ;
        // }
        k= k % n;
       Rev(nums, 0, n-1);
       Rev(nums, 0, k-1);
       Rev(nums, k, n-1);
    }
}