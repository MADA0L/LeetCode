class Solution {
    public int maxArea(int[] height) {
        int len = height.length;
        int left = 0;
        int right = len - 1;
        int ans = 0;
        while (left < right){
            int current = getVolumn(left, right, height);
            ans = Math.max(ans, current);
            if (height[left] < height[right]){
                left++;
            } else {
                right--;
            }
        }
        return ans;
    }

    public static int getVolumn(int a1, int a2, int[] heigt){
        if (heigt[a1] > heigt[a2]){
            return  (a2 - a1) * heigt[a2];
        } else {
            return (a2 - a1) * heigt[a1];
        }
    }
}