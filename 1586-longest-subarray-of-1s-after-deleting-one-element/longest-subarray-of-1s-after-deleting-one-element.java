class Solution {
    public int longestSubarray(int[] nums) {
        int left= 0;
        int maxL= 0;
        int zero=0;
        int n= nums.length;

        for(int i=0; i<n; i++)
        {
           
            if(nums[i]== 0)
            {
                zero++;
            }
            if(zero > 1)
            {
                if(nums[left]==0)
                {
                    zero--;
                }
                left++;
            }
            maxL= Math.max(maxL, i-left+1-zero);
        }
        return (maxL== n) ? maxL-1 : maxL;
    }
}