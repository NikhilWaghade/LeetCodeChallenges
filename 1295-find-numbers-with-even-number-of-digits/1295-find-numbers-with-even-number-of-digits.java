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

    // second approach (convert to string) 
    // public int findNumbers(int[] nums) {

    //     int evenCount = 0;

    //     for (int num : nums) {
    //         int len = String.valueOf(num).length();

    //         if (len % 2 == 0) {
    //             evenCount++;
    //         }
    //     }

    //     return evenCount;

    // third approach (log method)
    // public int findNumbers(int[] nums) {
    //     int evenCount =0;

    //     for(int num: nums){
    //         int digitCount = (int) Math.floor(Math.log10(num) + 1);

    //         if(digitCount % 2 == 0){
    //             evenCount++;
    //         }
    //     }
    //     return evenCount;

    // forth & leetcode according
    public int findNumbers(int[] nums) {
        int evenCount = 0;
        for (int num : nums) {
            if (num >= 10 && num <= 99 || num >= 1000 && num <= 9999 || num == 100000) {
                evenCount++;
            }
        }
        return evenCount;
    }
}