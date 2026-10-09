class Solution {
    public int singleNumber(int[] nums) {
        // T: O(n²), S: O(1)

        // for (int i = 0; i < nums.length; i++) {
        //     int count = 0;

        //     for (int j = 0; j < nums.length; j++) {
        //         if (nums[i] == nums[j]) {
        //             count++;
        //         }
        //     }

        //     if (count == 1) {
        //         return nums[i];
        //     }
        // }

        // return -1;

        // 2 hashMap 
        //  Map<Integer, Integer> map = new HashMap<>();
        //   // T: O(n), S: O(n)

        // for (int num : nums) {
        //     map.put(num, map.getOrDefault(num, 0) + 1);
        // }

        // for (int num : nums) {
        //     if (map.get(num) == 1) {
        //         return num;
        //     }
        // }

        // return -1;

        // 3. Optimal Approach — XOR
        // T: O(n), S: O(1)

        int result = 0;

        for (int num : nums) {
            result = result ^ num;
        }

        return result;
    }
}