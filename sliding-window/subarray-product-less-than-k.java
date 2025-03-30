class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int left = 0;
        int ans = 0;
        int product = 1;

        for (int right = 0; right < nums.length; right++){
            product *= nums[right];
            while (product >= k && left <= right){
                product /= nums[left];
                left += 1;
            }
            ans += right - left + 1;

        }
    return ans;
    }
}