class Solution {
    public int missingNumber(int[] nums) {
        int asum=0;
        int leng=nums.length;
        int sum=(leng*(leng+1))/2;
        for(int i=0;i<leng;i++){
            asum+=nums[i];
        }
        return sum-asum;
    }
}