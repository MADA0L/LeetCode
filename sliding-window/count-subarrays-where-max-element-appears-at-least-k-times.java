class Solution {
    public long countSubarrays(int[] nums, int k) {
        
        int ans = 0;
        int max = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int right = 0; right < nums.length; right++){
            int left = 0;
            int currNum = nums[right];
            int currCount = map.getOrDefault(nums[right], 0) + 1;
            map.put(currNum,currCount);
            max = Math.max(max, currCount);
            while(max >= k ){
                if (nums[left] == currNum){
                    max--;
                }
                left++;
            }
            ans += left;
        }
        return ans;
    }
}