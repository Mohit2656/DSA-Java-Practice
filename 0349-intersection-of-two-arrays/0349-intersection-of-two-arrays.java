class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set=new HashSet<>();
        HashSet<Integer> res=new HashSet<>();
        for(int n:nums1){
            set.add(n);
        }
        for(int k:nums2){
            if(set.contains(k)){
                res.add(k);
            }
        }
        int[] arr=new int[res.size()];
        int i=0;
        for(int k:res){
            arr[i]=k;
            i++;
        }
        return arr;
    }
}