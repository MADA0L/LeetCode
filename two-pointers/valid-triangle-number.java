class Solution {
    public static int triangleNumber(int[] nums) {
        int ans = 0;
        Arrays.sort(nums); 
        int len = nums.length;
        if (len < 3) {
            return 0;
        }
        for (int i = len - 1; i >= 2; i--) {
            int l = 0, r = i - 1;
            while (l < r) {
                if (nums[l] + nums[r] > nums[i]) { 
                    ans += (r - l); 
                    r--;
                } else {
                    l++;
                }
            }
        }
        return ans;
    }
}