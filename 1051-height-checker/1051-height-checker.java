class Solution {
    public int heightChecker(int[] heights) {
        //  T:O(n log n), S:O(n)
        Integer [] result = new Integer[heights.length];
    
        for(int i=0;i<heights.length;i++){
            result[i] = heights[i];
        }
        Arrays.sort(result);

        int count =0;
        for(int i=0; i<heights.length; i++){
            if(heights[i] != result[i]){
                count++;
            }
        }
        return  count;
    }
}