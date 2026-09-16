class Solution {
    public void duplicateZeros(int[] arr) {
       int [] desti = new int [arr.length];
       int sIdx = 0;
       int dIdx =0;

    //    T:o(n) , S: o(n)
       while(sIdx < arr.length) {
        if(arr[sIdx] == 0) {
            if(dIdx < arr.length) {
                desti[dIdx] = 0;
            }
            dIdx++;
            if(dIdx < arr.length) {
                desti[dIdx] = 0;
            }
        }
        else{
            if(dIdx < arr.length) {
                desti[dIdx] = arr[sIdx];
            }
        }
        dIdx++;
        sIdx++;
       }
       for(int i=0; i<arr.length;i++){
        arr[i] = desti[i];
       }
        
    }
}