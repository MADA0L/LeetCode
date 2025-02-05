class Solution {
    public long countCompleteDayPairs(int[] hours) {
        long ans = 0;
        if (hours.length == 0 ){
            return 0;
        }
        int[] remainders = new int[24];
        for (int h : hours){
            if (h % 24 == 0){
                ans += remainders[0];
            } else {
                ans +=  remainders[24 - h % 24];
            }
            remainders[h % 24]++;
        }
        return ans;
    }
}