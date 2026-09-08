class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
      Set<Integer> s1 = new HashSet<>();
      Set<Integer> s2 = new HashSet<>();
      
//  Time: O(n + m)
//  Space: O(n + m)
      for(int num:nums1){
        s1.add(num);
      }

      for(int num:nums2){
        s2.add(num);
      }

    //   intersection apply
    int [] result = new int[s1.size()];
    int k=0;
      for(int num: s1){
        if(s2.contains(num)){
          result[k]=num;
          k=k+1;
        }        
       }
    return Arrays.copyOfRange(result, 0, k);
    }
}