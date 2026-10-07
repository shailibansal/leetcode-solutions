class Solution {
    public int largestAltitude(int[] gain) {
        int n= gain.length;
        int ans[]= new int[n+1];
        ans[0]=0;

        for(int i=1; i<ans.length; i++)
        {
            ans[i]= gain[i-1]+ ans[i-1];
        }
        Arrays.sort(ans);
        return ans[ans.length-1];
    }
}