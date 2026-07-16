class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double ave,sum=0,max;
         for(int i=0;i<k;i++){
            sum+=nums[i];
         }  
         max=sum;
         for(int i=k;i<nums.length;i++){
            sum-=nums[i-k];
            sum+=nums[i];
            if(sum>max){
                max=sum;
            }
         }
         ave=max/k;
         return ave;
    }
}