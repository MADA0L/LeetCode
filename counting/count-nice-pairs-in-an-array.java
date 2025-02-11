class Solution {
    public int countNicePairs(int[] nums) {
        long ans = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i< nums.length ; i++){
            int target = nums[i]-rev(nums[i]);
            if(map.containsKey(target)){
                ans = ans + map.get(target);
            }
            map.put(target,map.getOrDefault(target, 0) + 1);
        }

        return (int) (ans % (Math.pow(10,9)+7));
    }

    public static int rev(int num) {
        int revNum = 0;

        while (num != 0) {
            int digit = num % 10;
            revNum = revNum * 10 + digit;
            num /= 10;
        }

        return revNum;
    }
}