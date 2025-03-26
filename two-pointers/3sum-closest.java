class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int closetSum = Integer.MAX_VALUE;
        int currentSum;
        int len = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < len - 2; i++){
            int l = i+1;
            int r = len -1;
            while (l < r){
                currentSum = nums[i] + nums[l] + nums[r];
                if (Math.abs(currentSum - target) < Math.abs(closetSum - target)){
                    closetSum = currentSum;
                }
                if (currentSum < target){
                    l++;
                } else if (currentSum > target) {
                    r--;
                } else {
                    return currentSum;
                }
            }
        }
        return closetSum;
    }
}