class Solution {
    public int[] sortedSquares(int[] nums) {
       int left=0;
       int right=nums.length-1;
       int[] arr= new int[nums.length];
       int a=nums.length-1;
       while(left<=right){
        int temp1=nums[left]*nums[left];
        int temp2=nums[right]*nums[right];
        if(temp2>temp1){
            arr[a]=temp2;
            right--;
        }
        else {
            arr[a]=temp1;
            left++;
        }
        a--;
       } 
       return arr;
    }
}