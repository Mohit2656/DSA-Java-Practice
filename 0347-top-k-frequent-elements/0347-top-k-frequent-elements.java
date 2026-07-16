class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int []arr=new int[k];
        for(int n: nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        for(int i=0;i<k;i++){
            int max=0;
            int element=0;
            for(int n:map.keySet()){
                if(max<map.get(n)){
                    max=map.get(n);
                    element=n;
                }
            }   
            arr[i]=element;
            map.remove(element);
        }
        return arr;
    }
}