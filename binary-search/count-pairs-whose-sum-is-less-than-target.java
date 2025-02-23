class Solution {
    public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);
        int ans = 0;
        int l = 0;
        int r = nums.size() - 1;
        while (l < r){
            if (nums.get(l) + nums.get(r) < target){
                ans = ans + r  - l;
                l++;
            } else {
                r--;
            }
        }
        return ans;
    }
}