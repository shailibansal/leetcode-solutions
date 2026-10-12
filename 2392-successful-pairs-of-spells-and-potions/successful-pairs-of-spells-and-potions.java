class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int ans[]= new int[spells.length];
        int n= spells.length;
        int m= potions.length;
        Arrays.sort(potions);
        for(int i=0; i<n; i++)
        {
            int left=0;
            int right= m-1;
            while(left <= right)
            {
                int mid= left + (right-left)/2;
                long prod= (long)spells[i]*potions[mid];
                if(prod >= success)
                {
                    right= mid-1;
                }
                else
                {
                    left= mid+1;
                }
            }
        ans[i]= m-left;
        }
        return ans;
    }
}