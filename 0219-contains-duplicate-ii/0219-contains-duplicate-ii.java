class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
     int sum=0;
     boolean x=true;
     for(int i=0;i<nums.length;i++){
        int j=i+1;
        sum=nums[i]+nums[i+1];
        if(i-1>=0){
            sum-=nums[i-1];
        }
   
        if(sum<k){
            x=false;
        }
     }
     return x;
    }
}