class Solution {
    public boolean checkIfExist(int[] arr) {
        // T:o(n^2), S:o(1)
        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr.length;j++){
        //         if(i != j && arr[i] == 2*arr[j]){
        //             return true;
        //         }
        //     }
        // }
        // return false;

        // T:o(n), S:o(n)
        Set<Integer> set = new HashSet<>();
        for(int num : arr){
           if(set.contains(2 * num) || (set.contains(num / 2)) && (num % 2 == 0)){
            return true;
           }
           set.add(num);
        }
         return false ;
    }
}