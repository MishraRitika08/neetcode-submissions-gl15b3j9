
/*class Solution {
        public int lengthOfLongestSubstring(String s) {
            int max = 0;
            for(int i=0;i<s.length();i++){
               int hash[] = new int[256]; 
                for(int j=i;j<s.length();j++){      
                    if(hash[s.charAt(j)]==1) break;
                    else{
                        hash[s.charAt(j)] = 1;  
                    }
                max = Math.max(j-i+1, max);
                }
            }
            return max;
        }
}*/
// }
class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int l=0;
        int r = 0;
        int max = 0;
        while(r<s.length()){
            char ch = s.charAt(r);
            //shrink window
            if(set.contains(ch)){
                while(set.contains(ch)) {
                    set.remove(s.charAt(l));
                    l++;
                }
                set.add(ch);
            }
            else{
                set.add(ch);
            }
            max = Math.max(r-l+1, max);
            r++;
        }
        return max;
    }
}
