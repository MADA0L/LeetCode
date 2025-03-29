class Solution {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int leftMax = height[left];
        int rightMax = height[right];
        int ans = 0;

        while (left < right){
            leftMax = Math.max(height[left], leftMax);
            rightMax = Math.max(height[right], rightMax);
            if (height[left] <= height[right]){
                left++;
                int current = leftMax - height[left];
                if (current > 0){
                    ans += current;
                }else {
                    leftMax = height[left];
                }
            } else {
                right--;
                int current = rightMax - height[right];
                if (current > 0){
                    ans += current;
                } else {
                    rightMax = height[right];
                }
            }
        }
        return  ans;
    }
}