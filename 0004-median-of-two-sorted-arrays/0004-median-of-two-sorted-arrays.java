class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int totallength=m+n;
        int [] arr=new int[totallength];
        arr = IntStream.concat(Arrays.stream(nums1),Arrays.stream(nums2)).toArray();
        Arrays.sort(arr);
        if(totallength%2==0){
            int mid=totallength/2;
            Double med=(arr[mid]+arr[mid-1])/2.0;
            return med;
        }
        else{
            int mid=totallength/2;
            return arr[mid];
        }
    }
}