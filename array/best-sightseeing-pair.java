class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int ans = 0;
        int maxPrev = values[0] + 0;
        for (int i =0 ; i< values.length; i++){
            ans = Math.max(ans, values[i]-i+maxPrev);
            maxPrev = Math.max(maxPrev, values[i]+i);
        }
        return ans;
    }
}