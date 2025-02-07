class Solution {
    public long maximumTripletValue(int[] nums) {
        long ans = 0;
        int maxDiff = 0;
        int preMax = 0;
        for (int i = 0; i< nums.length; i++){
            ans = Math.max(ans,(long) maxDiff * nums[i]);
            maxDiff = Math.max(maxDiff, preMax - nums[i]);
            preMax = Math.max(preMax, nums[i]);
        }
        return ans;
    }
}