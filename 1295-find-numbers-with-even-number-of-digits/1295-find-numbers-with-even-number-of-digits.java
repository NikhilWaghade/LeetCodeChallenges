class Solution {
    // first approach 
    // public boolean numberHasEvenDigit(int num) {
    //     int digitCount = 0;

    //     while (num != 0) {
    //         num = num / 10;
    //         digitCount++;
    //     }
    //     return digitCount % 2 == 0;
    // }

    // public int findNumbers(int[] nums) {
    //     int evenCount = 0;

    //     for (int i = 0; i < nums.length; i++) {
    //         if (numberHasEvenDigit(nums[i])) {
    //             evenCount++;
    //         }
    //     }
    //     return evenCount;

    // second approach 
    public int findNumbers(int[] nums) {

        int evenCount = 0;

        for (int num : nums) {
            int len = String.valueOf(num).length();

            if (len % 2 == 0) {
                evenCount++;
            }
        }

        return evenCount;
    }
}