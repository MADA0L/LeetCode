class Solution {
    public long countSubarrays(int[] nums, int k) {
        List<Integer> arrayList = new ArrayList<>();
        int max = 0;
        int ans = 0;
        for (int i = 0; i< nums.length; i++){
            max = Math.max(nums[i], max);
        }
        for (int i = 0; i< nums.length; i++){
            if (nums[i] == max){
                arrayList.add(i);
            }
        }

        for(int i = 0; i + k <= arrayList.size(); i++){
            ans += nums[i] + 1;
        }
        if (ans == 0){
            return 0;
        }
        ans += nums.length - arrayList.get(arrayList.size() -1 ) - 1 ;
        return  ans;
    }
}