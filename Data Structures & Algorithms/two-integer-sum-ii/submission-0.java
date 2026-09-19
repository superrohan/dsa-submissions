class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer , Integer> map = new HashMap<>();
        for(int i =0; i<numbers.length; i++) {
            int targetNum = target - numbers[i];
            if (map.containsKey(targetNum)) {
                return new int[]{map.get(targetNum), i + 1};
            }
            map.put (numbers[i], i+1);
        }

        return new int[0];
    }
}
