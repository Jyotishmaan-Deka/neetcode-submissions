class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] indexArray = new int[2];
        for(int i = 0 ;i < nums.length;i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                Integer index = map.get(complement); 
                indexArray[0] = index;
                indexArray[1] = i;
                return indexArray;
            }else{
                map.put(nums[i],i);
            }
        }

        return null;
    }
}
