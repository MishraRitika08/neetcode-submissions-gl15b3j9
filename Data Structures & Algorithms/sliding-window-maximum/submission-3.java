
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int i = 0;
        int ans[] = new int[nums.length-k+1];
        int r=0;
        Deque<Integer> q = new ArrayDeque<>();
        while(r<nums.length){
           
            while(!q.isEmpty()&&nums[r]>=nums[q.getLast()]){
                q.removeLast();
            }
            q.addLast(r);
            if(r>=k-1){
                ans[i++]= nums[q.getFirst()];
            }
            if(r-q.getFirst()==k-1) q.removeFirst();
            r++;
        }
        return ans;
    }
}