class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int t = nums.length - k ;
        return nums[t];
    }
}