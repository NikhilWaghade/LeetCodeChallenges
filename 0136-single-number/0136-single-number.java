class Solution {
    public int singleNumber(int[] nums) {
        // Map<Integer,Integer> map = new HashMap<>();
        // 2 2 1
        //   n
        // <2:0++ 1:++1: 2:2,  1:0:++1; 1:1>
        // for(int num:nums){
        //     if(!map.containsKey(num)){
        //         map.put(num, 0);        
        //     }
        //     map.put(num,map.get(num)+1);
        // }
        // <2:0++1, 2:1:++1, 2:2,  1:0:++1; 1:1>
        // for(int num:nums){
        //     if(map.get(num) ==1){
        //         return num;
        //     }
        // }
        // return -1;

// second approach using XOR
   int result =0;
   //2 2 1
   //0 ^2^2^1 
   //2^2 = 0 and 0^0=0 and 0^1= 1 so print 1
      for(int num: nums){
        result ^=num;
      }
      return result;
   
    }
}