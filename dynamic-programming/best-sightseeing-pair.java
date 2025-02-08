class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int ans = 0;
        for (int i =1 ; i < values.length; i++){
            for (int j = 0 ; j < i ; j++){
                ans = Math.max(ans,values[i]+values[j]-(i-j));
            }
        }
        return ans;
    }
}