class Solution {
    public boolean checkInclusion(String s1, String s2) {

        int[] count = new int[26];
        for(char c : s1.toCharArray()){
            count[c-'a']++;
        }
        int r = 0;
        int l = 0;
        while(r<s2.length()){
            //include current ch
            char c = s2.charAt(r);

            count[c - 'a']--;
            //maintain window
            while(r-l+1>s1.length()){
                count[s2.charAt(l) - 'a']++;
                l++;
            }
             // check if all zero
            if (allZero(count)) {
                return true;
            }
            r++;
        }
        return false;        
    }
    private boolean allZero(int[] arr){
        for(int i: arr){
            if(i!=0){
                return false;
            }
        }
        return true;
    }
}
