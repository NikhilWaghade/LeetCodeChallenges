class Solution {
    public boolean isAnagram(String s, String t) {
        //1. Sorting Method
        //   T:o(n log n), S:o(n)

        // char[] a = s.toCharArray();
        // char[] b = t.toCharArray();

        // Arrays.sort(a);
        // Arrays.sort(b);

        // return Arrays.equals(a, b);

        // 2. optimal approach
        // T:o(n), S:o(1)
        // if(s.length() != t.length()) {
        //     return false ;
        // }
        // int [] freq = new int [26];
        // for(char c : s.toCharArray()) {
        //     int idx = c - 'a';
        //     freq[idx] = freq[idx] + 1;
        // }   
        // for(char c : t.toCharArray()){
        //     int idx = c - 'a';
        //     freq[idx] = freq[idx] - 1;
        // }
        // for(int i =0; i<26; i++){
        //     if(freq[i] != 0){
        //         return false;
        //     }
        // }
        // return true;

        // 3. HashMap Method 
        // T: o(n), S:o(n)
        if(s.length() != t.length()) {
            return false;
        }
        HashMap <Character , Integer> freq = new HashMap<>();

        for(char c : s.toCharArray()){
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        for(char c : t.toCharArray()){
            freq.put(c, freq.getOrDefault(c, 0) - 1);
        }
        for(char c : freq.keySet()){
            if(freq.get(c) != 0) {
                return false;
            }
        }
        return true;
    }
}