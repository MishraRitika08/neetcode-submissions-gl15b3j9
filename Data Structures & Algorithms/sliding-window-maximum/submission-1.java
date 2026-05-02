// class Solution {
//     public int[] maxSlidingWindow(int[] nums, int k) {
//         ArrayList<Integer> list = new ArrayList<>();
//         //first window;
//         Stack<Integer> s = new Stack<>();
//         int r = k;
//         int l = 0;
//         int max = Integer.MIN_VALUE;
//         s.push(nums[0]);
//         for(int i=1;i<k;i++){
//             if(nums[i]>= s.peek()){
//                 s.push(nums[i]);
//             }
//         }
//         while(r<nums.length){
//             if(s.peek() == nums[l]) {
//                 s.pop();
//             }
//             l++;
//             if(nums[r] >= s.peek()){
//                 s.push(nums[r]);
//             }
//             r++;
//             list.add(s.peek());
//             //k length
//             //remove l
//             //add r
//         }
//         return list.toArray(new int[0]);

//     }
// }


class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = nums.length;
        // int[] result = new int[n - k + 1];

        for(int i=0; i<=nums.length-k; i++){
            int max = Integer.MIN_VALUE;
            for(int j=i;j<i+k;j++){
                max = Math.max(nums[j], max);
            }
            list.add(max);
            // result[i] = (max);
        }
        // return result;
       return list.stream().mapToInt(Integer::intValue).toArray();  
    }
}