import java.util.HashMap;
import java.util.Map;

class Solution {
    public int countBeautifulPairs(int[] nums) {
        int ans = 0;
        Map<Integer, Integer> hmap = new HashMap<>();
        for (int i = 0; i < nums.length ; i++){
            for (Map.Entry<Integer, Integer> entry : hmap.entrySet()){
                if (gcd(entry.getKey() , nums[i]) == 1){
                    ans = ans + entry.getValue();
                }
            }
            if (hmap.containsKey(nums)){
                hmap.put(nums[i],hmap.get(nums[i]+1));
            } else {
                hmap.put(nums[i], 1);
            }
        }
        return ans;
    }

    public int gcd(int a, int b){
        while (b != 0 ){
            int tmp = b;
            b = a % b;
            a = tmp;
        }
        return a;
    }

}