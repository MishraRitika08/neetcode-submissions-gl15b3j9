class Solution {
        public int lengthOfLongestSubstring(String s) {
            int max = 0;
            for(int i=0;i<s.length();i++){
               int hash[] = new int[256]; 
             //  Set<Character> set = new HashSet<>();
                for(int j=i;j<s.length();j++){      
                    if(hash[s.charAt(j)]==1) break;
                    else{
                        hash[s.charAt(j)] = 1;  
                        // curr = j-i+1;                      
                    }
                    // }              
                    // if(!set.contains(s.charAt(j))){
                    //     set.add((s.charAt(j)));
                    //     curr++;
                    // }
                    // else{
                    //     break;
                    // }
                max = Math.max(j-i+1, max);
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
