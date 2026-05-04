class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        //first window;
        ArrayDeque<Integer> q = new ArrayDeque<>();
        int n = nums.length;
        int[] result = new int[n - k + 1];
        int l = 0;
        for(int i=0;i<n;i++){
            while(!q.isEmpty() && nums[i]>nums[q.getLast()]){
                q.removeLast();
            }
            q.addLast(i);
            if(i - q.getFirst()>=k){
                q.removeFirst();
            }
            if(i>=k-1){
                result[l++] = nums[q.getFirst()];
            }
        }
            return result;

    }
}


// class Solution {
//     public int[] maxSlidingWindow(int[] nums, int k) {
//         ArrayList<Integer> list = new ArrayList<>();
//         int n = nums.length;
//         // int[] result = new int[n - k + 1];

//         for(int i=0; i<=nums.length-k; i++){
//             int max = Integer.MIN_VALUE;
//             for(int j=i;j<i+k;j++){
//                 max = Math.max(nums[j], max);
//             }
//             list.add(max);
//             // result[i] = (max);
//         }
//         // return result;
//        return list.stream().mapToInt(Integer::intValue).toArray();  
//     }
// }