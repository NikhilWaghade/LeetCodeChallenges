class Solution {

    public boolean validMountainArray(int[] arr) {

        int i = 0;
        int n = arr.length;

        // Time: O(n), Space: O(1)

        // Step 1: Move up while array is strictly increasing
        while (i + 1 < n && arr[i] < arr[i + 1]) {
            i++;
        }

        // Step 2: Peak cannot be at the first or last position
        if (i == 0 || i == n - 1) {
            return false;
        }

        // Step 3: Move down while array is strictly decreasing
        while (i + 1 < n && arr[i] > arr[i + 1]) {
            i++;
        }

        // Step 4: If we reached the last index, it is a valid mountain
        return i == n - 1;
    }
}