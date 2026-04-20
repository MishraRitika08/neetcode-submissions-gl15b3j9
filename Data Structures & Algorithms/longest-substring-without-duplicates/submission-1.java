class Solution {
        public int lengthOfLongestSubstring(String s) {
           // s = s.toLowerCase();
            int max = 0;
            for(int i=0;i<s.length();i++){
                int curr = 0;
               // int hash[] = new int[26]; 
               Set<Character> set = new HashSet<>();
                for(int j=i;j<s.length();j++){                    
                    if(!set.contains(s.charAt(j))){
                        set.add((s.charAt(j)));
                        curr++;
                    }
                    else{
                        break;
                    }
                max = Math.max(curr, max);
                }
            }
            return max;
        }}

//     public int lengthOfLongestSubstring(String s) {
//         HashSet<Character> set = new HashSet<>();
//         int l=0;
//         int max = 0;
//         int count = 0;

//         for(int i=0;i<s.length();i++){
//             char ch = s.charAt(i);
//             if(!set.contains(ch)){
//                 set.add(ch);
//                 count++;
//                 max = Math.max(count, max);                
//             }
//             else{
//                 set.remove(l);
//                 l++;
//             }
//         }
//         return count;
//     }
// }
