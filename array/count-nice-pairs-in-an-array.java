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

        return (int)(ans % (Math.pow(10,9)+7));
    }

    public static int rev (int num){
        ArrayList<Integer> numList = new ArrayList<>();
        int revNum = 0;
        while (num >= 10){
            numList.add(num % 10);
            num = num / 10;
        }
        numList.add(num);
        int size = numList.size();
        for (int i = 0; i < numList.size(); i++){
            revNum = revNum + (int) (numList.get(i) * Math.pow(10, size-1));
            size--;
        }
        
        return revNum ;
    }
}