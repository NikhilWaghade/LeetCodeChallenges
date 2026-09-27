class Solution {
    public int[] replaceElements(int[] arr) {
        // Brute Force = T:o(n^2),o(1)
        // for(int i=0; i<arr.length;i++){
        //     int max =-1;
        //     for(int j=i+1; j<arr.length;j++){
        //      max = Math.max(max,arr[j]);
        // }
        // arr[i] = max;
        // }
        // return arr;

        // Optimal Approach = T:o(n), S:o(1)

        int maxRight = -1;

        for(int i=arr.length-1; i>=0; i--){
            int current = arr[i];
            arr[i]= maxRight;

            maxRight = Math.max(maxRight,current);
        }
        return arr;
    }
}