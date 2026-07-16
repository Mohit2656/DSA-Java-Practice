class Solution {
    public int numSubarrayProductLessThanK(int[] arr, int k) {
        int l=0;
        int mul=1;
         int s=0;
       int h;
        for(h=0;h<arr.length;h++){
            mul*=arr[h];
            while(mul>=k && l<=h){
                mul/=arr[l];
                l++;
            }
            s+=h-l+1;
        }
    return s;
    }
}