class Solution {
    public int[] twoSum(int[] nums, int target) {
     HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
           
            int support=target-nums[i];
            if(map.containsKey(support)){
                return new int[] {map.get(support),i};
            }
             map.put(nums[i],i);
        }
        return new int[] {};
    }
}