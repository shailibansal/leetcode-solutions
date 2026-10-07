class Solution {
    public int longestOnes(int[] nums, int k) {
        int left= 0;
        int maxL= 0;
        int zero= 0;
        int n= nums.length;

        for(int r=0; r<n; ++r)
        {
           if(nums[r]==0)
           {
             zero++;
           }
           while(zero > k)
           {
             if(nums[left]==0)
             {
                zero--;
             }
             left++;
           }
           maxL= Math.max(maxL, r-left+1);
        }
        return maxL;
    }
}