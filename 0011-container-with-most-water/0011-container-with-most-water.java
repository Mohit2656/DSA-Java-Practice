class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int area=0;
        int maxx=0;
        while(left<right){
            area=Math.min(height[left],height[right])*(right-left);
            if(height[left]>height[right]){
                right--;
            }
             else{
                left++;
            }
            if(area>maxx){
                maxx=area;
            }
        }
        return maxx;
    }
}