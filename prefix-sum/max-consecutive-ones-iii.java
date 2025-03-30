class Solution {
    public int longestOnes(int[] nums, int k) {
        int ans = 0;
        int left = 0;
        int count = 0;
        for (int right = 0; right < nums.length; right++){
            if (nums[right] == 0){
                count += 1;
            }
            while (count > k){
                if (nums[left] == 0){
                    count -= 1;
                }
                left += 1;
            }
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }
}