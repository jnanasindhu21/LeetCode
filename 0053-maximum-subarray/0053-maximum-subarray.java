class Solution {
    public int maxSubArray(int[] nums) {
        
        int max=nums[0],cur=0;
        for(int i=0; i<nums.length; i++)
        {
            cur=cur+nums[i];
            cur = Math.max(cur,nums[i]);
            max = Math.max(max,cur);
        }
        return max;
    }
}