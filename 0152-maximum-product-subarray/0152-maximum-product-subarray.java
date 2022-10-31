class Solution {
    public int maxProduct(int[] nums) {
        int ma=nums[0],mi=nums[0],ans=nums[0];
        if(nums.length==1)
            return nums[0];
        for(int i=1;i<nums.length; i++)
        {
            if(nums[i] < 0)
            {   
                int t = ma;
                ma = mi;
                mi = t;
            }
            
            ma = Math.max(nums[i], ma*nums[i]);
            mi = Math.min(nums[i], mi*nums[i]);
            ans = Math.max(ans,ma);
        }
        return ans;
    }
}