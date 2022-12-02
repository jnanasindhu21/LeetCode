class Solution {
    public int removeDuplicates(int[] nums) {
       
        int j=0; 
        //int a[] = new int[nums.length];
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i] != nums[j] )
                nums[++j] = nums[i];
        }
        
        return ++j;
    }
}