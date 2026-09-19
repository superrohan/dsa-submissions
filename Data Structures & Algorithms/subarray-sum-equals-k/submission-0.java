class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int currSum = 0;
        Map<Integer, Integer> prefixSum = new HashMap<>();
        prefixSum.put(0,1);

        for(int num : nums) {
            currSum += num;
            if(prefixSum.containsKey(currSum - k)){
                count += prefixSum.get(currSum - k);
            }
            prefixSum.put(currSum , prefixSum.getOrDefault(currSum, 0) + 1);
        } 
        return count;
    }
}