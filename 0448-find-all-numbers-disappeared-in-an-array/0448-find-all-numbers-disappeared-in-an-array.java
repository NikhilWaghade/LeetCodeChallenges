class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        //Brute Forch --> T:O(n), S:O(n)
        // HashSet<Integer> set = new HashSet<>();
        // for (int num : nums) {
        //     set.add(num);
        // }
        // List<Integer> result = new ArrayList<>();

        // for (int i = 1; i <= nums.length; i++) {
        //     if (!set.contains(i)) {
        //         result.add(i);
        //     }
        // }
        // return result;

        // Optimal Approach --> T:O(n),  S:O(1)
        for(int i=0; i<nums.length; i++){
            int currNum = Math.abs(nums[i]);
            int idx = currNum -1;

            if(nums[idx] < 0){
                continue;
            }

            nums[idx]  = -1 * nums[idx];
        }
        List <Integer> res = new LinkedList<>();

        for(int i=0; i<nums.length; i++){
            if(nums[i] > 0){
                res.add(i+1);
            }
        }
        return res;
    }
}