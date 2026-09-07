class Solution {
    // public boolean containsDuplicate(int[] nums) {
    //     // timeCom.= o(nlogn)
    //     // spaceCom= o(logn)
    //    Arrays.sort(nums);
      
    //   for(int i=0;i<nums.length-1;i++){
    //     if(nums[i]==nums[i+1]){
    //         return true;
    //     }
    //   }
    //   return false;

    // optimal approach 
    public boolean containsDuplicate(int[] nums){
    Set<Integer> set = new HashSet<>();
    // T:o(n)
    // S:o(1)
    for(int num : nums){
        if(set.contains(num)){
            return true;
        }
        set.add(num);
    }
      return false;
    }
}