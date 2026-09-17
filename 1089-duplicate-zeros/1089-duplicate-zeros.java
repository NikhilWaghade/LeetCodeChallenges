class Solution {
    public void duplicateZeros(int[] arr) {
        //    int [] desti = new int [arr.length];
        //    int sIdx = 0;
        //    int dIdx =0;

        // //    T:o(n) , S: o(n) Brute Forch Approach
        //    while(sIdx < arr.length) {
        //     if(arr[sIdx] == 0) {
        //         if(dIdx < arr.length) {
        //             desti[dIdx] = 0;
        //         }
        //         dIdx++;
        //         if(dIdx < arr.length) {
        //             desti[dIdx] = 0;
        //         }
        //     }
        //     else{
        //         if(dIdx < arr.length) {
        //             desti[dIdx] = arr[sIdx];
        //         }
        //     }
        //     dIdx++;
        //     sIdx++;
        //    }
        //    for(int i=0; i<a{rr.length;i++){
        //     arr[i] = desti[i];
        //    }

        // second approach Bruth foarch 2

        int n = arr.length;
        // T:0(n^2), S:0()
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                for (int j = n - 1; j > i; j--) {
                    arr[j] = arr[j - 1];
                }
                i++;
            }
        }

    }
}