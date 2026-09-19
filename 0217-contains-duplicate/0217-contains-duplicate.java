class Solution {
    public boolean containsDuplicate(int[] nums) {
        // 1. nested method T:0(n^2), S:0(1)
        // for(int i=0; i<nums.length;i++){
        //     for(int j=i+1; j<nums.length;j++){
        //         if(nums[i] == nums[j]){
        //             return true;
        //         }
        //     }
        // }
        // return false;

    //   2. sorting method 
    //    Arrays.sort(nums);
    //     for(int i=0;i<nums.length-1;i++){
    //         // T:O(n log n), S:O(log n)
    //         if(nums[i] == nums[i+1]){
    //             return true;
    //         }
    //     }
    //     return false;

    // 3. HashSet method 
    Set<Integer> set = new HashSet<>();

    for(int num : nums){
        // T:0(n), S:o(n)
        if(set.contains(num)){
            // contains = Check if exists
            return true;
        }
        set.add(num); //Add element to set
    }
     return false;
    }
}