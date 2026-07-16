class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left=0;
        for(int weight:weights){
            left=Math.max(weight,left);
        }
        int right=0;
        for(int weight:weights){
            right+=weight;
        }
        int ans=right;
        while(left<=right){
            int mid=left+(right-left)/2;
           int day = 1;
            int currentWeight = 0;

for (int weight : weights) {

    if (currentWeight + weight > mid) {
        day++;
        currentWeight = 0;
    }
    currentWeight += weight;
}
            if (day <= days) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }
}