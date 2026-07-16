class Solution {
    public static void reverse(int[] nums, int i, int j) {
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // Adjust k if it is greater than n
        reverse(nums, 0, n - k - 1); // Reverse the first part
        reverse(nums, n - k, n - 1); // Reverse the second part
        reverse(nums, 0, n - 1); // Reverse the entire array
    }
}
