class Solution {
    public int longestSemiRepetitiveSubstring(String s) {
        int left = 0;
        int flag = 0;
        int ans = 0;
        for (int right = 1; right < s.length(); right++){
            if (s.charAt(right) == s.charAt(right - 1)){
                flag ++;
            }
            while(flag > 1){
                left ++;
                if (s.charAt(left) == s.charAt(left - 1)){
                    flag --;
                }
            }
            ans = Math.max(ans, right - left + 1);
        }
        return  ans;
    }
}