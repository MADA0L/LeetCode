class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        if (nums.length < 3) return null;

        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < nums.length - 2 ; i++){
            if (i > 0 && nums[i] == nums[i - 1]){
                continue;
            }
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k){
                int s = nums[i] + nums[j] + nums[k];
                if (s > 0){
                    k--;
                } else if(s < 0){
                    j++;
                } else {
                    List<Integer> triplet = new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[k]));
                    ans.add(triplet);
                    j++;
                    while (j < k && nums[j] == nums[j-1]){
                        j++;
                    }
                    k--;
                    while (j < k && nums[k] == nums[k+1]){
                        k--;
                    }
                }
            }
        }
        return ans;
    }
}